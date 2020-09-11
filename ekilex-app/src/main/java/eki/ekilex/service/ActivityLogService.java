package eki.ekilex.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.apache.commons.lang3.ArrayUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.flipkart.zjsonpatch.JsonDiff;

import eki.common.constant.ActivityEntity;
import eki.common.constant.FreeformType;
import eki.common.constant.LifecycleLogOwner;
import eki.ekilex.constant.SystemConstant;
import eki.ekilex.data.ActivityLog;
import eki.ekilex.data.ActivityLogData;
import eki.ekilex.data.Classifier;
import eki.ekilex.data.Collocation;
import eki.ekilex.data.CollocationPosGroup;
import eki.ekilex.data.CollocationTuple;
import eki.ekilex.data.DefSourceAndNoteSourceTuple;
import eki.ekilex.data.Definition;
import eki.ekilex.data.DefinitionLangGroup;
import eki.ekilex.data.FreeForm;
import eki.ekilex.data.Government;
import eki.ekilex.data.Image;
import eki.ekilex.data.ImageSourceTuple;
import eki.ekilex.data.LexemeNote;
import eki.ekilex.data.Meaning;
import eki.ekilex.data.MeaningNote;
import eki.ekilex.data.MeaningWord;
import eki.ekilex.data.NoteLangGroup;
import eki.ekilex.data.NoteSourceTuple;
import eki.ekilex.data.OrderedClassifier;
import eki.ekilex.data.Relation;
import eki.ekilex.data.Source;
import eki.ekilex.data.SourceLink;
import eki.ekilex.data.SourcePropertyTuple;
import eki.ekilex.data.TypeActivityLogDiff;
import eki.ekilex.data.Usage;
import eki.ekilex.data.UsageTranslationDefinitionTuple;
import eki.ekilex.data.Word;
import eki.ekilex.data.WordEtym;
import eki.ekilex.data.WordEtymTuple;
import eki.ekilex.data.WordGroup;
import eki.ekilex.data.WordLexeme;
import eki.ekilex.data.WordLexemeMeaningIds;
import eki.ekilex.data.WordNote;
import eki.ekilex.service.db.ActivityLogDbService;
import eki.ekilex.service.db.CommonDataDbService;
import eki.ekilex.service.db.LexSearchDbService;
import eki.ekilex.service.db.SourceDbService;
import eki.ekilex.service.util.ConversionUtil;

@Component
public class ActivityLogService implements SystemConstant {

	private static final String ACTIVITY_LOG_DIFF_FIELD_NAME = "diff";

	private static final List<ActivityEntity> FIRST_DEPTH_FREEFORM_ENTITIES = Arrays.asList(
			ActivityEntity.GOVERNMENT,
			ActivityEntity.GOVERNMENT_TYPE,
			ActivityEntity.USAGE,
			ActivityEntity.USAGE_TYPE,
			ActivityEntity.GRAMMAR,
			ActivityEntity.CONCEPT_ID,
			ActivityEntity.LTB_ID,
			ActivityEntity.LTB_SOURCE,
			ActivityEntity.ADVICE_NOTE,
			ActivityEntity.UNCLASSIFIED,
			ActivityEntity.SOURCE_NAME,
			ActivityEntity.SOURCE_RT,
			ActivityEntity.SOURCE_CELEX,
			ActivityEntity.SOURCE_WWW,
			ActivityEntity.SOURCE_AUTHOR,
			ActivityEntity.SOURCE_ISBN,
			ActivityEntity.SOURCE_ISSN,
			ActivityEntity.SOURCE_PUBLISHER,
			ActivityEntity.SOURCE_PUBLICATION_YEAR,
			ActivityEntity.SOURCE_PUBLICATION_PLACE,
			ActivityEntity.SOURCE_PUBLICATION_NAME,
			ActivityEntity.SOURCE_FILE,
			ActivityEntity.SOURCE_EXPLANATION,
			ActivityEntity.SOURCE_ARTICLE_TITLE,
			ActivityEntity.SOURCE_ARTICLE_AUTHOR,
			ActivityEntity.EXTERNAL_SOURCE_ID,
			ActivityEntity.LEARNER_COMMENT,
			ActivityEntity.IMAGE_FILE,
			ActivityEntity.SEMANTIC_TYPE,
			ActivityEntity.SYSTEMATIC_POLYSEMY_PATTERN,
			ActivityEntity.GENUS,
			ActivityEntity.FAMILY,
			ActivityEntity.DESCRIBER,
			ActivityEntity.DESCRIBING_YEAR,
			ActivityEntity.OD_WORD_RECOMMENDATION,
			ActivityEntity.OD_LEXEME_RECOMMENDATION,
			ActivityEntity.WORD_NOTE,
			ActivityEntity.MEANING_NOTE,
			ActivityEntity.LEXEME_NOTE,
			ActivityEntity.SOURCE_NOTE,
			ActivityEntity.ADVICE_NOTE);

	private static final List<ActivityEntity> SECOND_DEPTH_FREEFORM_ENTITIES = Arrays.asList(
			ActivityEntity.GOVERNMENT_PLACEMENT,
			ActivityEntity.GOVERNMENT_VARIANT,
			ActivityEntity.GOVERNMENT_OPTIONAL,
			ActivityEntity.OD_USAGE_DEFINITION,
			ActivityEntity.OD_USAGE_ALTERNATIVE,
			ActivityEntity.IMAGE_TITLE,
			ActivityEntity.SEMANTIC_TYPE_GROUP,
			ActivityEntity.USAGE_TRANSLATION,
			ActivityEntity.USAGE_DEFINITION);

	@Autowired
	protected UserContext userContext;

	@Autowired
	private ActivityLogDbService activityLogDbService;

	@Autowired
	private LexSearchDbService lexSearchDbService;

	@Autowired
	private SourceDbService sourceDbService;

	@Autowired
	private CommonDataDbService commonDataDbService;

	@Autowired
	private ConversionUtil conversionUtil;

	public Long getOwnerId(Long entityId, ActivityEntity entity) {
		if (FIRST_DEPTH_FREEFORM_ENTITIES.contains(entity)) {
			return activityLogDbService.getFirstDepthFreeformOwnerId(entityId);
		} else if (SECOND_DEPTH_FREEFORM_ENTITIES.contains(entity)) {
			return activityLogDbService.getSecondDepthFreeformOwnerId(entityId);
		} else if (ActivityEntity.WORD_TYPE.equals(entity)) {
			return activityLogDbService.getWordTypeOwnerId(entityId);
		} else if (ActivityEntity.WORD_ETYMOLOGY.equals(entity)) {
			return activityLogDbService.getWordEtymologyOwnerId(entityId);
		} else if (ActivityEntity.WORD_RELATION.equals(entity)) {
			return activityLogDbService.getWordRelationOwnerId(entityId);
		} else if (ActivityEntity.LEXEME_RELATION.equals(entity)) {
			return activityLogDbService.getLexemeRelationOwnerId(entityId);
		} else if (ActivityEntity.MEANING_RELATION.equals(entity)) {
			return activityLogDbService.getMeaningRelationOwnerId(entityId);
		} else if (ActivityEntity.DOMAIN.equals(entity)) {
			return activityLogDbService.getMeaningDomainOwnerId(entityId);
		} else if (ActivityEntity.DEFINITION.equals(entity)) {
			return activityLogDbService.getMeaningDefinitionOwnerId(entityId);
		} else if (ActivityEntity.DEFINITION_NOTE.equals(entity)) {
			Long definitionId = activityLogDbService.getFirstDepthFreeformOwnerId(entityId);
			return activityLogDbService.getMeaningDefinitionOwnerId(definitionId);
		}
		return null;
	}

	public ActivityLogData prepareActivityLog(String functName, Long ownerId, LifecycleLogOwner ownerName) throws Exception {

		String userName = userContext.getUserName();
		ActivityLogData activityLogData = new ActivityLogData();
		activityLogData.setEventBy(userName);
		activityLogData.setFunctName(functName);
		activityLogData.setOwnerId(ownerId);
		activityLogData.setOwnerName(ownerName);

		WordLexemeMeaningIds prevWlmIds;
		String prevData;

		if (LifecycleLogOwner.LEXEME.equals(ownerName)) {
			Long lexemeId = new Long(ownerId);
			prevData = getLexemeDetailsJson(lexemeId);
			prevWlmIds = activityLogDbService.getWordMeaningIds(lexemeId);
			activityLogData.setPrevData(prevData);
			activityLogData.setPrevWlmIds(prevWlmIds);
		} else if (LifecycleLogOwner.WORD.equals(ownerName)) {
			Long wordId = new Long(ownerId);
			prevData = getWordDetailsJson(wordId);
			prevWlmIds = activityLogDbService.getLexemeMeaningIds(wordId);
			activityLogData.setPrevData(prevData);
			activityLogData.setPrevWlmIds(prevWlmIds);
		} else if (LifecycleLogOwner.MEANING.equals(ownerName)) {
			Long meaningId = new Long(ownerId);
			prevData = getMeaningDetailsJson(meaningId);
			prevWlmIds = activityLogDbService.getLexemeWordIds(meaningId);
			activityLogData.setPrevData(prevData);
			activityLogData.setPrevWlmIds(prevWlmIds);
		} else if (LifecycleLogOwner.SOURCE.equals(ownerName)) {
			Long sourceId = new Long(ownerId);
			prevData = getSourceJson(sourceId);
			activityLogData.setPrevData(prevData);
		}
		return activityLogData;
	}

	public void createActivityLog(String functName, Long ownerId, LifecycleLogOwner ownerName) throws Exception {

		String userName = userContext.getUserName();
		ActivityLogData activityLogData = new ActivityLogData();
		activityLogData.setEventBy(userName);
		activityLogData.setFunctName(functName);
		activityLogData.setOwnerId(ownerId);
		activityLogData.setOwnerName(ownerName);
		activityLogData.setPrevData("{}");
		activityLogData.setPrevWlmIds(new WordLexemeMeaningIds());

		Long entityId = new Long(ownerId);
		ActivityEntity entityName = ActivityEntity.valueOf(ownerName.name());

		createActivityLog(activityLogData, entityId, entityName);
	}

	public void createActivityLogUnknownEntity(ActivityLogData activityLogData, ActivityEntity entityName) throws Exception {
		createActivityLog(activityLogData, -1L, entityName);
	}

	public void createActivityLog(ActivityLogData activityLogData, Long entityId, ActivityEntity entityName) throws Exception {

		activityLogData.setEntityId(entityId);
		activityLogData.setEntityName(entityName);
		LifecycleLogOwner ownerName = activityLogData.getOwnerName();
		Long ownerId = activityLogData.getOwnerId();
		WordLexemeMeaningIds currWlmIds = null;
		String currData = null;

		if (LifecycleLogOwner.LEXEME.equals(ownerName)) {
			Long lexemeId = new Long(ownerId);
			currWlmIds = activityLogDbService.getWordMeaningIds(lexemeId);
			currData = getLexemeDetailsJson(lexemeId);
			activityLogData.setCurrWlmIds(currWlmIds);
			activityLogData.setCurrData(currData);
			handleWlmActivityLog(activityLogData);
		} else if (LifecycleLogOwner.WORD.equals(ownerName)) {
			Long wordId = new Long(ownerId);
			currWlmIds = activityLogDbService.getLexemeMeaningIds(wordId);
			currData = getWordDetailsJson(wordId);
			activityLogData.setCurrWlmIds(currWlmIds);
			activityLogData.setCurrData(currData);
			handleWlmActivityLog(activityLogData);
		} else if (LifecycleLogOwner.MEANING.equals(ownerName)) {
			Long meaningId = new Long(ownerId);
			currWlmIds = activityLogDbService.getLexemeWordIds(meaningId);
			currData = getMeaningDetailsJson(meaningId);
			activityLogData.setCurrWlmIds(currWlmIds);
			activityLogData.setCurrData(currData);
			handleWlmActivityLog(activityLogData);
		} else if (LifecycleLogOwner.SOURCE.equals(ownerName)) {
			Long sourceId = new Long(ownerId);
			currData = getSourceJson(sourceId);
			activityLogData.setCurrData(currData);
			handleSourceActivityLog(activityLogData);
		}
	}

	private void handleWlmActivityLog(ActivityLogData activityLogData) throws Exception {

		calcDiffs(activityLogData);

		WordLexemeMeaningIds prevWlmIds = activityLogData.getPrevWlmIds();
		WordLexemeMeaningIds currWlmIds = activityLogData.getCurrWlmIds();

		Long[] lexemeIds = collect(prevWlmIds.getLexemeIds(), currWlmIds.getLexemeIds());
		Long[] wordIds = collect(prevWlmIds.getWordIds(), currWlmIds.getWordIds());
		Long[] meaningIds = collect(prevWlmIds.getMeaningIds(), currWlmIds.getMeaningIds());

		Long activityLogId = activityLogDbService.create(activityLogData);
		activityLogDbService.createLexemesActivityLogs(activityLogId, lexemeIds);
		activityLogDbService.createWordsActivityLogs(activityLogId, wordIds);
		activityLogDbService.createMeaningsActivityLogs(activityLogId, meaningIds);
	}

	private Long[] collect(Long[] ids1, Long[] ids2) {
		if ((ids1 == null) && (ids2 == null)) {
			return ArrayUtils.EMPTY_LONG_OBJECT_ARRAY;
		}
		if (ids1 == null) {
			return ids2;
		}
		if (ids2 == null) {
			return ids1;
		}
		Long[] ids = ArrayUtils.addAll(ids1, ids2);
		ids = Arrays.stream(ids).distinct().toArray(Long[]::new);
		return ids;
	}

	private void handleSourceActivityLog(ActivityLogData activityLogData) throws Exception {

		calcDiffs(activityLogData);

		Long activityLogId = activityLogDbService.create(activityLogData);
		activityLogDbService.createSourceActivityLog(activityLogId, activityLogData.getOwnerId());

		activityLogData.setId(activityLogId);
	}

	private void calcDiffs(ActivityLog activityLog) throws Exception {

		String prevData = activityLog.getPrevData();
		String currData = activityLog.getCurrData();

		ObjectMapper objectMapper = new ObjectMapper();

		JsonNode prevDataNode = objectMapper.readTree(prevData);
		JsonNode currDataNode = objectMapper.readTree(currData);

		JsonNode prevDataDiffNode = JsonDiff.asJson(currDataNode, prevDataNode);
		JsonNode currDataDiffNode = JsonDiff.asJson(prevDataNode, currDataNode);

		String prevDataDiffJson = "{\"" + ACTIVITY_LOG_DIFF_FIELD_NAME + "\": " + prevDataDiffNode.toString() + "}";
		String currDataDiffJson = "{\"" + ACTIVITY_LOG_DIFF_FIELD_NAME + "\": " + currDataDiffNode.toString() + "}";

		List<TypeActivityLogDiff> prevDiffs = composeActivityLogDiffs(objectMapper, prevDataDiffJson);
		List<TypeActivityLogDiff> currDiffs = composeActivityLogDiffs(objectMapper, currDataDiffJson);

		activityLog.setPrevDiffs(prevDiffs);
		activityLog.setCurrDiffs(currDiffs);
	}

	private List<TypeActivityLogDiff> composeActivityLogDiffs(ObjectMapper objectMapper, String diffJson) throws Exception {

		Map<String, Object> diffMap = objectMapper.readValue(diffJson, new TypeReference<Map<String, Object>>() {
		});
		@SuppressWarnings("unchecked")
		List<Map<String, Object>> diffList = (List<Map<String, Object>>) diffMap.get(ACTIVITY_LOG_DIFF_FIELD_NAME);
		List<TypeActivityLogDiff> activityLogDiffs = new ArrayList<>();

		for (Map<String, Object> diffRow : diffList) {
			String diffOp = diffRow.get("op").toString();
			String diffPath = diffRow.get("path").toString();
			Object diffValueObj = diffRow.get("value");
			String diffValue;
			if (diffValueObj == null) {
				diffValue = "-";
			} else if (diffValueObj instanceof Map) {
				@SuppressWarnings("unchecked")
				Map<String, Object> diffValueMap = (Map<String, Object>) diffValueObj;
				diffValueMap.values().removeIf(Objects::isNull);
				diffValue = diffValueObj.toString();
			} else {
				diffValue = diffValueObj.toString();
			}
			TypeActivityLogDiff activityLogDiff = new TypeActivityLogDiff();
			activityLogDiff.setOp(diffOp);
			activityLogDiff.setPath(diffPath);
			activityLogDiff.setValue(diffValue);
			activityLogDiffs.add(activityLogDiff);
		}
		return activityLogDiffs;
	}

	private String getLexemeDetailsJson(Long lexemeId) throws Exception {

		WordLexeme lexeme = lexSearchDbService.getLexeme(lexemeId, CLASSIF_LABEL_LANG_EST, CLASSIF_LABEL_TYPE_DESCRIP);

		final String[] excludeLexemeAttributeTypes = new String[] {
				FreeformType.GOVERNMENT.name(), FreeformType.GRAMMAR.name(), FreeformType.USAGE.name(),
				FreeformType.NOTE.name(), FreeformType.OD_LEXEME_RECOMMENDATION.name()};

		List<MeaningWord> meaningWords = lexSearchDbService.getMeaningWords(lexemeId);
		List<String> tags = commonDataDbService.getLexemeTags(lexemeId);
		List<Government> governments = commonDataDbService.getLexemeGovernments(lexemeId);
		List<FreeForm> grammars = commonDataDbService.getLexemeGrammars(lexemeId);
		List<UsageTranslationDefinitionTuple> usageTranslationDefinitionTuples = commonDataDbService
				.getLexemeUsageTranslationDefinitionTuples(lexemeId, CLASSIF_LABEL_LANG_EST, CLASSIF_LABEL_TYPE_DESCRIP);
		List<Usage> usages = conversionUtil.composeUsages(usageTranslationDefinitionTuples);
		List<FreeForm> lexemeFreeforms = commonDataDbService.getLexemeFreeforms(lexemeId, excludeLexemeAttributeTypes);
		List<NoteSourceTuple> lexemeNoteSourceTuples = commonDataDbService.getLexemeNoteSourceTuples(lexemeId);
		List<LexemeNote> lexemeNotes = conversionUtil.composeNotes(LexemeNote.class, lexemeId, lexemeNoteSourceTuples);
		List<NoteLangGroup> lexemeNoteLangGroups = conversionUtil.composeNoteLangGroups(lexemeNotes, null);
		List<FreeForm> odLexemeRecommendations = commonDataDbService.getOdLexemeRecommendations(lexemeId);
		List<Relation> lexemeRelations = commonDataDbService.getLexemeRelations(lexemeId, CLASSIF_LABEL_LANG_EST, CLASSIF_LABEL_TYPE_FULL);
		List<SourceLink> lexemeSourceLinks = commonDataDbService.getLexemeSourceLinks(lexemeId);
		List<CollocationTuple> primaryCollocTuples = lexSearchDbService.getPrimaryCollocationTuples(lexemeId);
		List<CollocationPosGroup> collocationPosGroups = conversionUtil.composeCollocPosGroups(primaryCollocTuples);
		List<CollocationTuple> secondaryCollocTuples = lexSearchDbService.getSecondaryCollocationTuples(lexemeId);
		List<Collocation> secondaryCollocations = conversionUtil.composeCollocations(secondaryCollocTuples);

		lexeme.setMeaningWords(meaningWords);
		lexeme.setTags(tags);
		lexeme.setGovernments(governments);
		lexeme.setGrammars(grammars);
		lexeme.setUsages(usages);
		lexeme.setLexemeFreeforms(lexemeFreeforms);
		lexeme.setLexemeNoteLangGroups(lexemeNoteLangGroups);
		lexeme.setOdLexemeRecommendations(odLexemeRecommendations);
		lexeme.setLexemeRelations(lexemeRelations);
		lexeme.setSourceLinks(lexemeSourceLinks);
		lexeme.setCollocationPosGroups(collocationPosGroups);
		lexeme.setSecondaryCollocations(secondaryCollocations);

		ObjectMapper objectMapper = new ObjectMapper();
		String lexemeJson = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(lexeme);

		return lexemeJson;
	}

	private String getWordDetailsJson(Long wordId) throws Exception {

		Word word = lexSearchDbService.getWord(wordId);
		List<Classifier> wordTypes = commonDataDbService.getWordTypes(wordId, CLASSIF_LABEL_LANG_EST, CLASSIF_LABEL_TYPE_DESCRIP);
		List<Relation> wordRelations = lexSearchDbService.getWordRelations(wordId, CLASSIF_LABEL_LANG_EST, CLASSIF_LABEL_TYPE_FULL);
		List<Relation> wordGroupMembers = lexSearchDbService.getWordGroupMembers(wordId, CLASSIF_LABEL_LANG_EST, CLASSIF_LABEL_TYPE_FULL);
		List<WordGroup> wordGroups = conversionUtil.composeWordGroups(wordGroupMembers);
		List<WordEtymTuple> wordEtymTuples = lexSearchDbService.getWordEtymology(wordId);
		List<WordEtym> wordEtymology = conversionUtil.composeWordEtymology(wordEtymTuples);
		List<FreeForm> odWordRecommendations = lexSearchDbService.getOdWordRecommendations(wordId);
		List<NoteSourceTuple> wordNoteSourceTuples = commonDataDbService.getWordNoteSourceTuples(wordId);
		List<WordNote> wordNotes = conversionUtil.composeNotes(WordNote.class, wordId, wordNoteSourceTuples);

		word.setWordTypes(wordTypes);
		word.setNotes(wordNotes);
		word.setRelations(wordRelations);
		word.setGroups(wordGroups);
		word.setEtymology(wordEtymology);
		word.setOdWordRecommendations(odWordRecommendations);

		ObjectMapper objectMapper = new ObjectMapper();
		String wordDetailsJson = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(word);

		return wordDetailsJson;
	}

	private String getMeaningDetailsJson(Long meaningId) throws Exception {

		final String[] excludeMeaningAttributeTypes = new String[] {
				FreeformType.LEARNER_COMMENT.name(), FreeformType.SEMANTIC_TYPE.name(), FreeformType.NOTE.name()};

		List<OrderedClassifier> meaningDomains = commonDataDbService.getMeaningDomains(meaningId);
		meaningDomains = conversionUtil.removeOrderedClassifierDuplicates(meaningDomains);
		List<Definition> definitions = commonDataDbService.getMeaningDefinitions(meaningId, null, CLASSIF_LABEL_LANG_EST, CLASSIF_LABEL_TYPE_DESCRIP);
		List<DefSourceAndNoteSourceTuple> definitionsDataTuples = commonDataDbService.getMeaningDefSourceAndNoteSourceTuples(meaningId);
		conversionUtil.composeMeaningDefinitions(definitions, definitionsDataTuples);
		List<FreeForm> meaningFreeforms = commonDataDbService.getMeaningFreeforms(meaningId, excludeMeaningAttributeTypes);
		List<FreeForm> meaningLearnerComments = commonDataDbService.getMeaningLearnerComments(meaningId);
		List<ImageSourceTuple> meaningImageSourceTuples = commonDataDbService.getMeaningImageSourceTuples(meaningId);
		List<Image> meaningImages = conversionUtil.composeMeaningImages(meaningImageSourceTuples);
		List<NoteSourceTuple> meaningNoteSourceTuples = commonDataDbService.getMeaningNoteSourceTuples(meaningId);
		List<MeaningNote> meaningNotes = conversionUtil.composeNotes(MeaningNote.class, meaningId, meaningNoteSourceTuples);
		List<NoteLangGroup> meaningNoteLangGroups = conversionUtil.composeNoteLangGroups(meaningNotes, null);
		List<Classifier> meaningSemanticTypes = commonDataDbService.getMeaningSemanticTypes(meaningId, CLASSIF_LABEL_LANG_EST, CLASSIF_LABEL_TYPE_DESCRIP);
		List<Relation> meaningRelations = commonDataDbService.getMeaningRelations(meaningId, null, CLASSIF_LABEL_LANG_EST, CLASSIF_LABEL_TYPE_DESCRIP);
		List<DefinitionLangGroup> definitionLangGroups = conversionUtil.composeMeaningDefinitionLangGroups(definitions, null);

		Meaning meaning = new Meaning();
		meaning.setMeaningId(meaningId);
		meaning.setDomains(meaningDomains);
		meaning.setDefinitions(definitions);
		meaning.setFreeforms(meaningFreeforms);
		meaning.setLearnerComments(meaningLearnerComments);
		meaning.setImages(meaningImages);
		meaning.setNoteLangGroups(meaningNoteLangGroups);
		meaning.setSemanticTypes(meaningSemanticTypes);
		meaning.setRelations(meaningRelations);
		meaning.setDefinitionLangGroups(definitionLangGroups);

		ObjectMapper objectMapper = new ObjectMapper();
		String meaningJson = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(meaning);

		return meaningJson;
	}

	private String getSourceJson(Long sourceId) throws Exception {

		List<SourcePropertyTuple> sourcePropertyTuples = sourceDbService.getSource(sourceId);
		List<Source> sources = conversionUtil.composeSources(sourcePropertyTuples);
		Source source = sources.get(0);

		ObjectMapper objectMapper = new ObjectMapper();
		String sourceJson = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(source);

		return sourceJson;
	}
}