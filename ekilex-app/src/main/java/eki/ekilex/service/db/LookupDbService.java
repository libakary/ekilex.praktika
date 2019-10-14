package eki.ekilex.service.db;

import static eki.ekilex.data.db.Tables.FORM;
import static eki.ekilex.data.db.Tables.LEXEME;
import static eki.ekilex.data.db.Tables.MEANING;
import static eki.ekilex.data.db.Tables.PARADIGM;
import static eki.ekilex.data.db.Tables.WORD;
import static eki.ekilex.data.db.Tables.WORD_WORD_TYPE;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.jooq.Condition;
import org.jooq.DSLContext;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Record4;
import org.jooq.Table;
import org.jooq.impl.DSL;
import org.jooq.util.postgres.PostgresDSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import eki.common.constant.DbConstant;
import eki.common.constant.FormMode;
import eki.ekilex.data.WordLexemeMeaningIdTuple;
import eki.ekilex.data.db.tables.Form;
import eki.ekilex.data.db.tables.Lexeme;
import eki.ekilex.data.db.tables.Meaning;
import eki.ekilex.data.db.tables.Paradigm;
import eki.ekilex.data.db.tables.Word;

@Component
public class LookupDbService implements DbConstant {

	@Autowired
	private DSLContext create;

	public String getWordValue(Long wordId) {
		return create
				.select(FORM.VALUE)
				.from(FORM, PARADIGM)
				.where(
						PARADIGM.WORD_ID.eq(wordId)
								.and(FORM.PARADIGM_ID.eq(PARADIGM.ID))
								.and(FORM.MODE.eq(FormMode.WORD.name())))
				.fetchOneInto(String.class);
	}

	public Map<String, Integer[]> getMeaningsWordsWithMultipleHomonymNumbers(List<Long> meaningIds) {

		Field<String> wordValue = FORM.VALUE.as("word_value");
		Field<Integer[]> homonymNumbers = DSL.arrayAggDistinct(WORD.HOMONYM_NR).as("homonym_numbers");

		Table<Record2<String, Integer[]>> wv = DSL
				.select(wordValue, homonymNumbers)
				.from(LEXEME, WORD, PARADIGM, FORM)
				.where(
						LEXEME.MEANING_ID.in(meaningIds)
								.and(LEXEME.TYPE.eq(LEXEME_TYPE_PRIMARY))
								.and(WORD.ID.eq(LEXEME.WORD_ID))
								.and(PARADIGM.WORD_ID.eq(WORD.ID))
								.and(FORM.PARADIGM_ID.eq(PARADIGM.ID))
								.and(FORM.MODE.eq(FormMode.WORD.name())))
				.groupBy(FORM.VALUE)
				.asTable("wv");

		return create
				.selectFrom(wv)
				.where(PostgresDSL.arrayLength(wv.field(homonymNumbers)).gt(1))
				.fetchMap(wordValue, homonymNumbers);
	}

	public List<Long> getWordIdsOfJoinCandidates(String wordValue, List<String> userPrefDatasetCodes, List<String> userPermDatasetCodes, Long wordIdToExclude) {

		Table<Record4<Long, Long, String, String>> wl = DSL
				.select(
						WORD.ID.as("word_id"),
						LEXEME.ID.as("lexeme_id"),
						LEXEME.DATASET_CODE.as("dataset_code"),
						LEXEME.PROCESS_STATE_CODE.as("process_state_code"))
				.from(WORD, PARADIGM, FORM, LEXEME)
				.where(
						FORM.VALUE.like(wordValue)
								.and(FORM.MODE.eq(FormMode.WORD.name()))
								.and(FORM.PARADIGM_ID.eq(PARADIGM.ID))
								.and(PARADIGM.WORD_ID.eq(WORD.ID))
								.and(LEXEME.WORD_ID.eq(WORD.ID))
								.and(WORD.ID.ne(wordIdToExclude))
								.andExists(DSL
										.select(LEXEME.ID)
										.from(LEXEME)
										.where(
												LEXEME.WORD_ID.eq(WORD.ID)
														.and(LEXEME.TYPE.eq(LEXEME_TYPE_PRIMARY))
														.and(LEXEME.DATASET_CODE.in(userPrefDatasetCodes))))
								.andNotExists(DSL
										.select(WORD_WORD_TYPE.ID)
										.from(WORD_WORD_TYPE)
										.where(WORD_WORD_TYPE.WORD_ID.eq(WORD.ID))
										.and(WORD_WORD_TYPE.WORD_TYPE_CODE.in(WORD_TYPE_CODE_PREFIXOID, WORD_TYPE_CODE_SUFFIXOID))))
				.asTable("wl");

		return create
				.selectDistinct(wl.field("word_id"))
				.from(wl)
				.where(wl.field("process_state_code", String.class).eq(PROCESS_STATE_PUBLIC)
						.or(wl.field("dataset_code", String.class).in(userPermDatasetCodes)))
				.fetchInto(Long.class);
	}

	public List<WordLexemeMeaningIdTuple> getWordLexemeMeaningIds(Long meaningId, String datasetCode) {

		return create
				.select(
						LEXEME.WORD_ID,
						LEXEME.MEANING_ID,
						LEXEME.ID.as("lexeme_id"))
				.from(LEXEME)
				.where(
						LEXEME.MEANING_ID.eq(meaningId)
								.and(LEXEME.DATASET_CODE.eq(datasetCode))
								.and(LEXEME.TYPE.eq(LEXEME_TYPE_PRIMARY)))
				.fetchInto(WordLexemeMeaningIdTuple.class);
	}

	public List<eki.ekilex.data.Meaning> getMeaningsOfJoinCandidates(String searchFilter, List<String> userPrefDatasetCodes,
			List<String> userPermDatasetCodes, Long excludedMeaningId) {

		String maskedSearchFilter = searchFilter.replace("*", "%").replace("?", "_").toLowerCase();

		Meaning m = MEANING.as("m");
		Lexeme l = LEXEME.as("l");
		Word w = WORD.as("w");
		Paradigm p = PARADIGM.as("p");
		Form f = FORM.as("f");

		Condition whereFormValue;
		if (StringUtils.containsAny(maskedSearchFilter, '%', '_')) {
			whereFormValue = f.VALUE.lower().like(maskedSearchFilter);
		} else {
			whereFormValue = f.VALUE.lower().equal(maskedSearchFilter);
		}

		Table<Record1<Long>> mid = DSL
				.selectDistinct(m.ID.as("meaning_id"))
				.from(m, l, w, p, f)
				.where(
						m.ID.ne(excludedMeaningId)
								.and(l.MEANING_ID.eq(m.ID))
								.and(l.TYPE.eq(LEXEME_TYPE_PRIMARY))
								.and(l.DATASET_CODE.in(userPrefDatasetCodes))
								.and(w.ID.eq(l.WORD_ID))
								.and(p.WORD_ID.eq(w.ID))
								.and(f.PARADIGM_ID.eq(p.ID))
								.and(f.MODE.in(FormMode.WORD.name(), FormMode.AS_WORD.name()))
								.and(whereFormValue))
				.asTable("mid");

		return create
				.select(
						MEANING.ID.as("meaning_id"),
						DSL.arrayAggDistinct(LEXEME.ID).orderBy(LEXEME.ID).as("lexeme_ids"))
				.from(MEANING, LEXEME, mid)
				.where(
						MEANING.ID.eq(mid.field("meaning_id", Long.class))
								.and(LEXEME.MEANING_ID.eq(MEANING.ID))
								.and(LEXEME.TYPE.eq(LEXEME_TYPE_PRIMARY))
								.and(LEXEME.PROCESS_STATE_CODE.eq(PROCESS_STATE_PUBLIC)
										.or(LEXEME.DATASET_CODE.in(userPermDatasetCodes))))
				.groupBy(MEANING.ID)
				.fetchInto(eki.ekilex.data.Meaning.class);
	}
}