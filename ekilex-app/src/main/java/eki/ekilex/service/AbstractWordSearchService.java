package eki.ekilex.service;

import static java.util.stream.Collectors.toList;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import javax.transaction.Transactional;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import eki.common.constant.FreeformType;
import eki.ekilex.data.Classifier;
import eki.ekilex.data.Collocation;
import eki.ekilex.data.CollocationPosGroup;
import eki.ekilex.data.CollocationTuple;
import eki.ekilex.data.Definition;
import eki.ekilex.data.DefinitionRefTuple;
import eki.ekilex.data.FreeForm;
import eki.ekilex.data.Government;
import eki.ekilex.data.Image;
import eki.ekilex.data.ImageSourceTuple;
import eki.ekilex.data.Paradigm;
import eki.ekilex.data.ParadigmFormTuple;
import eki.ekilex.data.Relation;
import eki.ekilex.data.SearchDatasetsRestriction;
import eki.ekilex.data.SearchFilter;
import eki.ekilex.data.SourceLink;
import eki.ekilex.data.Usage;
import eki.ekilex.data.UsageTranslationDefinitionTuple;
import eki.ekilex.data.Word;
import eki.ekilex.data.WordDetails;
import eki.ekilex.data.WordEtym;
import eki.ekilex.data.WordEtymTuple;
import eki.ekilex.data.WordGroup;
import eki.ekilex.data.WordLexeme;
import eki.ekilex.data.WordsResult;
import eki.ekilex.service.db.LexSearchDbService;
import eki.ekilex.service.util.LexemeLevelCalcUtil;

@Component
public abstract class AbstractWordSearchService extends AbstractSearchService {

	protected final static String classifierLabelLang = "est";
	protected final static String classifierLabelTypeDescrip = "descrip";
	private final static String classifierLabelTypeFull = "full";

	@Autowired
	private LexSearchDbService lexSearchDbService;

	@Autowired
	private LexemeLevelCalcUtil lexemeLevelCalcUtil;

	@Transactional
	public WordsResult getWords(SearchFilter searchFilter, List<String> selectedDatasetCodes, boolean fetchAll) throws Exception {

		List<Word> words;
		int wordCount;
		if (CollectionUtils.isEmpty(searchFilter.getCriteriaGroups())) {
			words = Collections.emptyList();
			wordCount = 0;
		} else {
			SearchDatasetsRestriction searchDatasetsRestriction = composeDatasetsRestriction(selectedDatasetCodes);
			words = lexSearchDbService.getWords(searchFilter, searchDatasetsRestriction, fetchAll);
			wordCount = words.size();
			if (!fetchAll && wordCount == MAX_RESULTS_LIMIT) {
				wordCount = lexSearchDbService.countWords(searchFilter, searchDatasetsRestriction);
			}
		}
		WordsResult result = new WordsResult();
		result.setWords(words);
		result.setTotalCount(wordCount);
		return result;
	}

	@Transactional
	public WordsResult getWords(String searchFilter, List<String> selectedDatasetCodes, boolean fetchAll) {

		List<Word> words;
		int wordCount;
		if (StringUtils.isBlank(searchFilter)) {
			words = Collections.emptyList();
			wordCount = 0;
		} else {
			SearchDatasetsRestriction searchDatasetsRestriction = composeDatasetsRestriction(selectedDatasetCodes);
			words = lexSearchDbService.getWords(searchFilter, searchDatasetsRestriction, fetchAll);
			wordCount = words.size();
			if (!fetchAll && wordCount == MAX_RESULTS_LIMIT) {
				wordCount = lexSearchDbService.countWords(searchFilter, searchDatasetsRestriction);
			}
		}
		WordsResult result = new WordsResult();
		result.setWords(words);
		result.setTotalCount(wordCount);
		return result;
	}

	@Transactional
	public WordDetails getWordDetails(Long wordId, List<String> selectedDatasetCodes) {

		SearchDatasetsRestriction searchDatasetsRestriction = composeDatasetsRestriction(selectedDatasetCodes);
		Map<String, String> datasetNameMap = commonDataDbService.getDatasetNameMap();
		Word word = commonDataDbService.getWord(wordId);
		List<Classifier> wordTypes = commonDataDbService.getWordTypes(wordId, classifierLabelLang, classifierLabelTypeDescrip);
		List<WordLexeme> lexemes = lexSearchDbService.getWordLexemes(wordId, searchDatasetsRestriction);
		List<ParadigmFormTuple> paradigmFormTuples = lexSearchDbService.getParadigmFormTuples(wordId, word.getValue(), classifierLabelLang, classifierLabelTypeDescrip);
		List<Paradigm> paradigms = conversionUtil.composeParadigms(paradigmFormTuples);
		List<Relation> wordRelations = lexSearchDbService.getWordRelations(wordId, classifierLabelLang, classifierLabelTypeFull);
		List<WordEtymTuple> wordEtymTuples = lexSearchDbService.getWordEtymology(wordId);
		List<WordEtym> wordEtymology = conversionUtil.composeWordEtymology(wordEtymTuples);
		List<Relation> wordGroupMembers = lexSearchDbService.getWordGroupMembers(wordId, classifierLabelLang, classifierLabelTypeFull);
		List<WordGroup> wordGroups = conversionUtil.composeWordGroups(wordGroupMembers);

		lexemes.forEach(lexeme -> populateLexeme(lexeme, searchDatasetsRestriction, datasetNameMap));
		lexemeLevelCalcUtil.combineLevels(lexemes);

		WordDetails wordDetails = new WordDetails();
		wordDetails.setWord(word);
		wordDetails.setWordTypes(wordTypes);
		wordDetails.setParadigms(paradigms);
		wordDetails.setLexemes(lexemes);
		wordDetails.setWordRelations(wordRelations);
		wordDetails.setWordEtymology(wordEtymology);
		wordDetails.setWordGroups(wordGroups);

		return wordDetails;
	}

	protected void populateLexeme(WordLexeme lexeme, SearchDatasetsRestriction searchDatasetsRestriction, Map<String, String> datasetNameMap) {

		final String[] excludeMeaningAttributeTypes = new String[] {FreeformType.LEARNER_COMMENT.name()};
		final String[] excludeLexemeAttributeTypes = new String[] {FreeformType.GOVERNMENT.name(), FreeformType.GRAMMAR.name(), FreeformType.USAGE.name(), FreeformType.PUBLIC_NOTE.name()};

		String datasetName = datasetNameMap.get(lexeme.getDatasetCode());
		lexeme.setDataset(datasetName);

		Long wordId = lexeme.getWordId();
		Long lexemeId = lexeme.getLexemeId();
		Long meaningId = lexeme.getMeaningId();

		List<String> vocalForms = lexeme.getVocalForms();
		vocalForms = cleanUpVocalForms(vocalForms);

		List<Word> meaningWords = lexSearchDbService.getMeaningWords(wordId, meaningId, searchDatasetsRestriction);
		List<Classifier> lexemePos = commonDataDbService.getLexemePos(lexemeId, classifierLabelLang, classifierLabelTypeDescrip);
		List<Classifier> lexemeDerivs = commonDataDbService.getLexemeDerivs(lexemeId, classifierLabelLang, classifierLabelTypeDescrip);
		List<Classifier> lexemeRegisters = commonDataDbService.getLexemeRegisters(lexemeId, classifierLabelLang, classifierLabelTypeDescrip);
		List<Classifier> meaningDomains = commonDataDbService.getMeaningDomains(meaningId);
		List<DefinitionRefTuple> definitionRefTuples = commonDataDbService.getMeaningDefinitionRefTuples(meaningId);
		List<Definition> definitions = conversionUtil.composeMeaningDefinitions(definitionRefTuples);
		List<FreeForm> meaningFreeforms = commonDataDbService.getMeaningFreeforms(meaningId, excludeMeaningAttributeTypes);
		List<FreeForm> meaningLearnerComments = commonDataDbService.getMeaningLearnerComments(meaningId);
		List<ImageSourceTuple> meaningImageSourceTuples = commonDataDbService.getMeaningImageSourceTuples(meaningId);
		List<Image> meaningImages = conversionUtil.composeMeaningImages(meaningImageSourceTuples);
		List<FreeForm> lexemeFreeforms = commonDataDbService.getLexemeFreeforms(lexemeId, excludeLexemeAttributeTypes);
		List<FreeForm> lexemePublicNotes = commonDataDbService.getLexemePublicNotes(lexemeId);
		List<Government> governments = commonDataDbService.getLexemeGovernments(lexemeId);
		List<UsageTranslationDefinitionTuple> usageTranslationDefinitionTuples =
				commonDataDbService.getLexemeUsageTranslationDefinitionTuples(lexemeId, classifierLabelLang, classifierLabelTypeDescrip);
		List<Usage> usages = conversionUtil.composeUsages(usageTranslationDefinitionTuples);
		List<Relation> lexemeRelations = commonDataDbService.getLexemeRelations(lexemeId, classifierLabelLang, classifierLabelTypeFull);
		List<Relation> meaningRelations = commonDataDbService.getMeaningRelations(meaningId, classifierLabelLang, classifierLabelTypeDescrip);
		List<List<Relation>> groupedMeaningRelations = conversionUtil.groupRelationsById(meaningRelations);
		List<FreeForm> lexemeGrammars = commonDataDbService.getLexemeGrammars(lexemeId);
		List<CollocationTuple> primaryCollocTuples = lexSearchDbService.getPrimaryCollocationTuples(lexemeId);
		List<CollocationPosGroup> collocationPosGroups = conversionUtil.composeCollocPosGroups(primaryCollocTuples);
		List<CollocationTuple> secondaryCollocTuples = lexSearchDbService.getSecondaryCollocationTuples(lexemeId);
		List<Collocation> secondaryCollocations = conversionUtil.composeCollocations(secondaryCollocTuples);
		List<SourceLink> lexemeSourceLinks = commonDataDbService.getLexemeSourceLinks(lexemeId);

		lexeme.setPos(lexemePos);
		lexeme.setDerivs(lexemeDerivs);
		lexeme.setRegisters(lexemeRegisters);
		lexeme.setMeaningWords(meaningWords);
		lexeme.setMeaningDomains(meaningDomains);
		lexeme.setDefinitions(definitions);
		lexeme.setMeaningFreeforms(meaningFreeforms);
		lexeme.setMeaningLearnerComments(meaningLearnerComments);
		lexeme.setMeaningImages(meaningImages);
		lexeme.setLexemeFreeforms(lexemeFreeforms);
		lexeme.setLexemePublicNotes(lexemePublicNotes);
		lexeme.setGovernments(governments);
		lexeme.setUsages(usages);
		lexeme.setLexemeRelations(lexemeRelations);
		lexeme.setMeaningRelations(meaningRelations);
		lexeme.setGrammars(lexemeGrammars);
		lexeme.setCollocationPosGroups(collocationPosGroups);
		lexeme.setSecondaryCollocations(secondaryCollocations);
		lexeme.setVocalForms(vocalForms);
		lexeme.setSourceLinks(lexemeSourceLinks);
		lexeme.setGroupedMeaningRelations(groupedMeaningRelations);

		boolean lexemeOrMeaningClassifiersExist =
				StringUtils.isNotBlank(lexeme.getLexemeValueStateCode())
						|| StringUtils.isNotBlank(lexeme.getLexemeFrequencyGroupCode())
						|| StringUtils.isNotBlank(lexeme.getLexemeProcessStateCode())
						|| CollectionUtils.isNotEmpty(lexemePos)
						|| CollectionUtils.isNotEmpty(lexemeDerivs)
						|| CollectionUtils.isNotEmpty(lexemeRegisters)
						|| CollectionUtils.isNotEmpty(meaningDomains)
						|| CollectionUtils.isNotEmpty(lexemeGrammars)
						|| CollectionUtils.isNotEmpty(lexeme.getLexemeFrequencies());
		lexeme.setLexemeOrMeaningClassifiersExist(lexemeOrMeaningClassifiersExist);
	}

	private List<String> cleanUpVocalForms(List<String> vocalForms) {
		return vocalForms.stream().filter(Objects::nonNull).collect(toList());
	}

}