package eki.wordweb.service.db;

import static eki.wordweb.data.db.Tables.MVIEW_WW_COLLOCATION;
import static eki.wordweb.data.db.Tables.MVIEW_WW_DEFINITION_SOURCE_LINK;
import static eki.wordweb.data.db.Tables.MVIEW_WW_FORM;
import static eki.wordweb.data.db.Tables.MVIEW_WW_FREEFORM_SOURCE_LINK;
import static eki.wordweb.data.db.Tables.MVIEW_WW_LEXEME;
import static eki.wordweb.data.db.Tables.MVIEW_WW_LEXEME_SOURCE_LINK;
import static eki.wordweb.data.db.Tables.MVIEW_WW_MEANING;
import static eki.wordweb.data.db.Tables.MVIEW_WW_MEANING_RELATION;
import static eki.wordweb.data.db.Tables.MVIEW_WW_WORD;
import static eki.wordweb.data.db.Tables.MVIEW_WW_WORD_ETYMOLOGY;
import static eki.wordweb.data.db.Tables.MVIEW_WW_WORD_ETYM_SOURCE_LINK;
import static eki.wordweb.data.db.Tables.MVIEW_WW_WORD_RELATION;

import java.util.List;
import java.util.Map;

import org.jooq.Condition;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;

import eki.common.constant.DbConstant;
import eki.common.constant.FormMode;
import eki.wordweb.constant.SystemConstant;
import eki.wordweb.data.CollocationTuple;
import eki.wordweb.data.DataFilter;
import eki.wordweb.data.Form;
import eki.wordweb.data.LexemeMeaningTuple;
import eki.wordweb.data.SourceLinksWrapper;
import eki.wordweb.data.TypeSourceLink;
import eki.wordweb.data.Word;
import eki.wordweb.data.WordEtymTuple;
import eki.wordweb.data.WordForm;
import eki.wordweb.data.WordRelationTuple;
import eki.wordweb.data.WordSearchElement;
import eki.wordweb.data.db.tables.MviewWwCollocation;
import eki.wordweb.data.db.tables.MviewWwDefinitionSourceLink;
import eki.wordweb.data.db.tables.MviewWwForm;
import eki.wordweb.data.db.tables.MviewWwFreeformSourceLink;
import eki.wordweb.data.db.tables.MviewWwLexeme;
import eki.wordweb.data.db.tables.MviewWwLexemeSourceLink;
import eki.wordweb.data.db.tables.MviewWwMeaning;
import eki.wordweb.data.db.tables.MviewWwMeaningRelation;
import eki.wordweb.data.db.tables.MviewWwWord;
import eki.wordweb.data.db.tables.MviewWwWordEtymSourceLink;
import eki.wordweb.data.db.tables.MviewWwWordEtymology;
import eki.wordweb.data.db.tables.MviewWwWordRelation;

public abstract class AbstractSearchDbService implements DbConstant, SystemConstant {

	@Autowired
	protected DSLContext create;

	public abstract Map<String, List<WordSearchElement>> getWordsByInfixLev(String wordInfix, List<String> destinLangs, int maxWordCount);

	public abstract List<Word> getWords(String searchWord, DataFilter dataFilter);

	public Word getWord(Long wordId) {

		MviewWwWord w = MVIEW_WW_WORD.as("w");

		return create
				.select(
						w.WORD_ID,
						w.WORD,
						w.AS_WORD,
						w.HOMONYM_NR,
						w.WORD_CLASS,
						w.LANG,
						w.WORD_TYPE_CODES,
						w.MORPH_CODE,
						w.DISPLAY_MORPH_CODE,
						w.ASPECT_CODE,
						w.MEANING_WORDS,
						w.DEFINITIONS,
						w.OD_WORD_RECOMMENDATIONS,
						w.LEX_DATASET_EXISTS,
						w.TERM_DATASET_EXISTS,
						w.FORMS_EXIST)
				.from(w)
				.where(w.WORD_ID.eq(wordId))
				.fetchOne()
				.into(Word.class);
	}

	public Map<Long, List<Form>> getWordForms(Long wordId, Integer maxDisplayLevel) {

		MviewWwForm f = MVIEW_WW_FORM.as("f");

		Condition where = f.WORD_ID.eq(wordId).and(f.MODE.in(FormMode.WORD.name(), FormMode.FORM.name()));
		if (maxDisplayLevel != null) {
			where = where.and(f.DISPLAY_LEVEL.le(maxDisplayLevel));
		}

		return create
				.select(
						f.PARADIGM_ID,
						f.INFLECTION_TYPE,
						f.FORM_ID,
						f.MODE,
						f.MORPH_GROUP1,
						f.MORPH_GROUP2,
						f.MORPH_GROUP3,
						f.DISPLAY_LEVEL,
						f.MORPH_CODE,
						f.MORPH_EXISTS,
						f.FORM,
						f.COMPONENTS,
						f.DISPLAY_FORM,
						f.VOCAL_FORM,
						f.AUDIO_FILE,
						f.ORDER_BY)
				.from(f)
				.where(where)
				.orderBy(f.PARADIGM_ID, f.ORDER_BY, f.FORM_ID)
				.fetchGroups(f.PARADIGM_ID, Form.class);
	}

	@Cacheable(value = CACHE_KEY_NULL_WORD, key = "{#wordId, #tokens}")
	public List<WordForm> getWordFormCandidates(Long wordId, List<String> tokens) {

		MviewWwForm f = MVIEW_WW_FORM.as("f");

		return create
				.select(
						f.WORD,
						f.FORM)
				.from(f)
				.where(
						f.WORD_ID.eq(wordId)
								.and(f.FORM.in(tokens)))
				.fetchInto(WordForm.class);
	}

	public List<LexemeMeaningTuple> getLexemeMeaningTuples(Long wordId, DataFilter dataFilter) {

		MviewWwLexeme l = MVIEW_WW_LEXEME.as("l");
		MviewWwMeaning m = MVIEW_WW_MEANING.as("m");
		MviewWwMeaningRelation mr = MVIEW_WW_MEANING_RELATION.as("mr");
		MviewWwDefinitionSourceLink dsl = MVIEW_WW_DEFINITION_SOURCE_LINK.as("dsl");

		Condition where = l.WORD_ID.eq(wordId);

		return create
				.select(
						l.LEXEME_ID,
						m.MEANING_ID,
						m.DOMAIN_CODES,
						m.IMAGE_FILES,
						m.SYSTEMATIC_POLYSEMY_PATTERNS,
						m.SEMANTIC_TYPES,
						m.LEARNER_COMMENTS,
						m.DEFINITIONS,
						mr.RELATED_MEANINGS,
						dsl.SOURCE_LINKS.as("definition_source_links"))
				.from(
						l.innerJoin(m).on(m.MEANING_ID.eq(l.MEANING_ID))
								.leftOuterJoin(mr).on(mr.MEANING_ID.eq(m.MEANING_ID))
								.leftOuterJoin(dsl).on(dsl.MEANING_ID.eq(m.MEANING_ID)))
				.where(where)
				.orderBy(m.MEANING_ID, l.LEXEME_ID)
				.fetch()
				.into(LexemeMeaningTuple.class);
	}

	public List<WordRelationTuple> getWordRelationTuples(Long wordId) {

		MviewWwWordRelation wr = MVIEW_WW_WORD_RELATION.as("wr");

		return create
				.select(
						wr.WORD_ID,
						wr.RELATED_WORDS,
						wr.WORD_GROUP_ID,
						wr.WORD_REL_TYPE_CODE,
						wr.WORD_GROUP_MEMBERS)
				.from(wr)
				.where(wr.WORD_ID.eq(wordId))
				.fetch()
				.into(WordRelationTuple.class);
	}


	public List<WordEtymTuple> getWordEtymologyTuples(Long wordId) {

		MviewWwWordEtymology we = MVIEW_WW_WORD_ETYMOLOGY.as("we");

		return create
				.select(
						we.WORD_ID,
						we.WORD_ETYM_ID,
						we.WORD_ETYM_WORD_ID,
						we.WORD_ETYM_WORD,
						we.WORD_ETYM_WORD_LANG,
						we.WORD_ETYM_WORD_MEANING_WORDS,
						we.ETYMOLOGY_TYPE_CODE,
						we.ETYMOLOGY_YEAR,
						we.WORD_ETYM_COMMENT,
						we.WORD_ETYM_IS_QUESTIONABLE,
						we.WORD_ETYM_RELATIONS)
				.from(we)
				.where(we.WORD_ID.eq(wordId))
				.orderBy(we.WORD_ETYM_ORDER_BY)
				.fetchInto(WordEtymTuple.class);
	}

	public List<CollocationTuple> getCollocations(Long wordId) {

		MviewWwCollocation c = MVIEW_WW_COLLOCATION.as("c");

		Condition where = c.WORD_ID.eq(wordId);

		return create
				.select(
						c.LEXEME_ID,
						c.WORD_ID,
						c.POS_GROUP_ID,
						c.POS_GROUP_CODE,
						c.REL_GROUP_ID,
						c.REL_GROUP_NAME,
						c.COLLOC_ID,
						c.COLLOC_VALUE,
						c.COLLOC_DEFINITION,
						c.COLLOC_USAGES,
						c.COLLOC_MEMBERS,
						c.COMPLEXITY)
				.from(c)
				.where(where)
				.orderBy(
						c.POS_GROUP_ORDER_BY,
						c.REL_GROUP_ORDER_BY,
						c.COLLOC_GROUP_ORDER,
						c.COLLOC_ID)
				.fetch()
				.into(CollocationTuple.class);
	}

	public List<TypeSourceLink> getLexemeSourceLinks(Long wordId) {

		MviewWwLexemeSourceLink sl = MVIEW_WW_LEXEME_SOURCE_LINK.as("sl");

		SourceLinksWrapper sourceLinksWrapper = create
				.select(sl.SOURCE_LINKS)
				.from(sl)
				.where(sl.WORD_ID.eq(wordId))
				.fetchOptionalInto(SourceLinksWrapper.class).orElse(null);
		if (sourceLinksWrapper == null) {
			return null;
		}
		return sourceLinksWrapper.getSourceLinks();
	}

	public List<TypeSourceLink> getFreeformSourceLinks(Long wordId) {

		MviewWwFreeformSourceLink sl = MVIEW_WW_FREEFORM_SOURCE_LINK.as("sl");

		SourceLinksWrapper sourceLinksWrapper = create
				.select(sl.SOURCE_LINKS)
				.from(sl)
				.where(sl.WORD_ID.eq(wordId))
				.fetchOptionalInto(SourceLinksWrapper.class).orElse(null);
		if (sourceLinksWrapper == null) {
			return null;
		}
		return sourceLinksWrapper.getSourceLinks();
	}

	public List<TypeSourceLink> getWordEtymSourceLinks(Long wordId) {

		MviewWwWordEtymSourceLink sl = MVIEW_WW_WORD_ETYM_SOURCE_LINK.as("sl");

		SourceLinksWrapper sourceLinksWrapper = create
				.select(sl.SOURCE_LINKS)
				.from(sl)
				.where(sl.WORD_ID.eq(wordId))
				.fetchOptionalInto(SourceLinksWrapper.class).orElse(null);
		if (sourceLinksWrapper == null) {
			return null;
		}
		return sourceLinksWrapper.getSourceLinks();
	}
}
