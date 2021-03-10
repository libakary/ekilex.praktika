/*
 * This file is generated by jOOQ.
 */
package eki.ekilex.data.db;


import eki.ekilex.data.db.tables.ActivityLog;
import eki.ekilex.data.db.tables.Aspect;
import eki.ekilex.data.db.tables.AspectLabel;
import eki.ekilex.data.db.tables.Collocation;
import eki.ekilex.data.db.tables.CollocationFreeform;
import eki.ekilex.data.db.tables.Dataset;
import eki.ekilex.data.db.tables.DatasetPermission;
import eki.ekilex.data.db.tables.Definition;
import eki.ekilex.data.db.tables.DefinitionDataset;
import eki.ekilex.data.db.tables.DefinitionFreeform;
import eki.ekilex.data.db.tables.DefinitionSourceLink;
import eki.ekilex.data.db.tables.DefinitionType;
import eki.ekilex.data.db.tables.DefinitionTypeLabel;
import eki.ekilex.data.db.tables.Deriv;
import eki.ekilex.data.db.tables.DerivLabel;
import eki.ekilex.data.db.tables.DisplayMorph;
import eki.ekilex.data.db.tables.DisplayMorphLabel;
import eki.ekilex.data.db.tables.Domain;
import eki.ekilex.data.db.tables.DomainLabel;
import eki.ekilex.data.db.tables.EkiUser;
import eki.ekilex.data.db.tables.EkiUserApplication;
import eki.ekilex.data.db.tables.EkiUserProfile;
import eki.ekilex.data.db.tables.EtymologyType;
import eki.ekilex.data.db.tables.FeedbackLog;
import eki.ekilex.data.db.tables.FeedbackLogComment;
import eki.ekilex.data.db.tables.Form;
import eki.ekilex.data.db.tables.FormFreq;
import eki.ekilex.data.db.tables.Freeform;
import eki.ekilex.data.db.tables.FreeformSourceLink;
import eki.ekilex.data.db.tables.FreqCorp;
import eki.ekilex.data.db.tables.GameNonword;
import eki.ekilex.data.db.tables.Gender;
import eki.ekilex.data.db.tables.GenderLabel;
import eki.ekilex.data.db.tables.GovernmentType;
import eki.ekilex.data.db.tables.GovernmentTypeLabel;
import eki.ekilex.data.db.tables.LabelType;
import eki.ekilex.data.db.tables.Language;
import eki.ekilex.data.db.tables.LanguageLabel;
import eki.ekilex.data.db.tables.LexColloc;
import eki.ekilex.data.db.tables.LexCollocPosGroup;
import eki.ekilex.data.db.tables.LexCollocRelGroup;
import eki.ekilex.data.db.tables.LexRelMapping;
import eki.ekilex.data.db.tables.LexRelType;
import eki.ekilex.data.db.tables.LexRelTypeLabel;
import eki.ekilex.data.db.tables.LexRelation;
import eki.ekilex.data.db.tables.Lexeme;
import eki.ekilex.data.db.tables.LexemeActivityLog;
import eki.ekilex.data.db.tables.LexemeDeriv;
import eki.ekilex.data.db.tables.LexemeFreeform;
import eki.ekilex.data.db.tables.LexemePos;
import eki.ekilex.data.db.tables.LexemeRegion;
import eki.ekilex.data.db.tables.LexemeRegister;
import eki.ekilex.data.db.tables.LexemeSourceLink;
import eki.ekilex.data.db.tables.LexemeTag;
import eki.ekilex.data.db.tables.Meaning;
import eki.ekilex.data.db.tables.MeaningActivityLog;
import eki.ekilex.data.db.tables.MeaningDomain;
import eki.ekilex.data.db.tables.MeaningFreeform;
import eki.ekilex.data.db.tables.MeaningLastActivityLog;
import eki.ekilex.data.db.tables.MeaningNr;
import eki.ekilex.data.db.tables.MeaningRelMapping;
import eki.ekilex.data.db.tables.MeaningRelType;
import eki.ekilex.data.db.tables.MeaningRelTypeLabel;
import eki.ekilex.data.db.tables.MeaningRelation;
import eki.ekilex.data.db.tables.MeaningSemanticType;
import eki.ekilex.data.db.tables.Morph;
import eki.ekilex.data.db.tables.MorphFreq;
import eki.ekilex.data.db.tables.MorphLabel;
import eki.ekilex.data.db.tables.Paradigm;
import eki.ekilex.data.db.tables.Pos;
import eki.ekilex.data.db.tables.PosGroup;
import eki.ekilex.data.db.tables.PosGroupLabel;
import eki.ekilex.data.db.tables.PosLabel;
import eki.ekilex.data.db.tables.Region;
import eki.ekilex.data.db.tables.Register;
import eki.ekilex.data.db.tables.RegisterLabel;
import eki.ekilex.data.db.tables.SemanticType;
import eki.ekilex.data.db.tables.SemanticTypeLabel;
import eki.ekilex.data.db.tables.Source;
import eki.ekilex.data.db.tables.SourceActivityLog;
import eki.ekilex.data.db.tables.SourceFreeform;
import eki.ekilex.data.db.tables.Tag;
import eki.ekilex.data.db.tables.TempDsImportPkMap;
import eki.ekilex.data.db.tables.TempDsImportQueue;
import eki.ekilex.data.db.tables.TermsOfUse;
import eki.ekilex.data.db.tables.UsageType;
import eki.ekilex.data.db.tables.UsageTypeLabel;
import eki.ekilex.data.db.tables.ValueState;
import eki.ekilex.data.db.tables.ValueStateLabel;
import eki.ekilex.data.db.tables.ViewWwClassifier;
import eki.ekilex.data.db.tables.ViewWwCollocation;
import eki.ekilex.data.db.tables.ViewWwDataset;
import eki.ekilex.data.db.tables.ViewWwDatasetWordMenu;
import eki.ekilex.data.db.tables.ViewWwDefinitionSourceLink;
import eki.ekilex.data.db.tables.ViewWwForm;
import eki.ekilex.data.db.tables.ViewWwLexeme;
import eki.ekilex.data.db.tables.ViewWwLexemeFreeformSourceLink;
import eki.ekilex.data.db.tables.ViewWwLexemeRelation;
import eki.ekilex.data.db.tables.ViewWwLexemeSourceLink;
import eki.ekilex.data.db.tables.ViewWwLexicalDecisionData;
import eki.ekilex.data.db.tables.ViewWwMeaning;
import eki.ekilex.data.db.tables.ViewWwMeaningFreeformSourceLink;
import eki.ekilex.data.db.tables.ViewWwMeaningRelation;
import eki.ekilex.data.db.tables.ViewWwSimilarityJudgementData;
import eki.ekilex.data.db.tables.ViewWwWord;
import eki.ekilex.data.db.tables.ViewWwWordEtymSourceLink;
import eki.ekilex.data.db.tables.ViewWwWordEtymology;
import eki.ekilex.data.db.tables.ViewWwWordRelation;
import eki.ekilex.data.db.tables.ViewWwWordSearch;
import eki.ekilex.data.db.tables.Word;
import eki.ekilex.data.db.tables.WordActivityLog;
import eki.ekilex.data.db.tables.WordEtymology;
import eki.ekilex.data.db.tables.WordEtymologyRelation;
import eki.ekilex.data.db.tables.WordEtymologySourceLink;
import eki.ekilex.data.db.tables.WordFreeform;
import eki.ekilex.data.db.tables.WordFreq;
import eki.ekilex.data.db.tables.WordGroup;
import eki.ekilex.data.db.tables.WordGroupMember;
import eki.ekilex.data.db.tables.WordGuid;
import eki.ekilex.data.db.tables.WordLastActivityLog;
import eki.ekilex.data.db.tables.WordRelMapping;
import eki.ekilex.data.db.tables.WordRelType;
import eki.ekilex.data.db.tables.WordRelTypeLabel;
import eki.ekilex.data.db.tables.WordRelation;
import eki.ekilex.data.db.tables.WordRelationParam;
import eki.ekilex.data.db.tables.WordType;
import eki.ekilex.data.db.tables.WordTypeLabel;
import eki.ekilex.data.db.tables.WordWordType;
import eki.ekilex.data.db.udt.TypeActivityLogDiff;
import eki.ekilex.data.db.udt.TypeClassifier;
import eki.ekilex.data.db.udt.TypeCollocMember;
import eki.ekilex.data.db.udt.TypeDefinition;
import eki.ekilex.data.db.udt.TypeDomain;
import eki.ekilex.data.db.udt.TypeFreeform;
import eki.ekilex.data.db.udt.TypeLangComplexity;
import eki.ekilex.data.db.udt.TypeLexemeRelation;
import eki.ekilex.data.db.udt.TypeMeaningRelation;
import eki.ekilex.data.db.udt.TypeMeaningWord;
import eki.ekilex.data.db.udt.TypeMediaFile;
import eki.ekilex.data.db.udt.TypeSourceLink;
import eki.ekilex.data.db.udt.TypeTermMeaningWord;
import eki.ekilex.data.db.udt.TypeUsage;
import eki.ekilex.data.db.udt.TypeWordEtymRelation;
import eki.ekilex.data.db.udt.TypeWordRelMeaning;
import eki.ekilex.data.db.udt.TypeWordRelParam;
import eki.ekilex.data.db.udt.TypeWordRelation;

import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Sequence;
import org.jooq.Table;
import org.jooq.UDT;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Public extends SchemaImpl {

    private static final long serialVersionUID = -464947578;

    /**
     * The reference instance of <code>public</code>
     */
    public static final Public PUBLIC = new Public();

    /**
     * The table <code>public.activity_log</code>.
     */
    public final ActivityLog ACTIVITY_LOG = ActivityLog.ACTIVITY_LOG;

    /**
     * The table <code>public.aspect</code>.
     */
    public final Aspect ASPECT = Aspect.ASPECT;

    /**
     * The table <code>public.aspect_label</code>.
     */
    public final AspectLabel ASPECT_LABEL = AspectLabel.ASPECT_LABEL;

    /**
     * The table <code>public.collocation</code>.
     */
    public final Collocation COLLOCATION = Collocation.COLLOCATION;

    /**
     * The table <code>public.collocation_freeform</code>.
     */
    public final CollocationFreeform COLLOCATION_FREEFORM = CollocationFreeform.COLLOCATION_FREEFORM;

    /**
     * The table <code>public.dataset</code>.
     */
    public final Dataset DATASET = Dataset.DATASET;

    /**
     * The table <code>public.dataset_permission</code>.
     */
    public final DatasetPermission DATASET_PERMISSION = DatasetPermission.DATASET_PERMISSION;

    /**
     * The table <code>public.definition</code>.
     */
    public final Definition DEFINITION = Definition.DEFINITION;

    /**
     * The table <code>public.definition_dataset</code>.
     */
    public final DefinitionDataset DEFINITION_DATASET = DefinitionDataset.DEFINITION_DATASET;

    /**
     * The table <code>public.definition_freeform</code>.
     */
    public final DefinitionFreeform DEFINITION_FREEFORM = DefinitionFreeform.DEFINITION_FREEFORM;

    /**
     * The table <code>public.definition_source_link</code>.
     */
    public final DefinitionSourceLink DEFINITION_SOURCE_LINK = DefinitionSourceLink.DEFINITION_SOURCE_LINK;

    /**
     * The table <code>public.definition_type</code>.
     */
    public final DefinitionType DEFINITION_TYPE = DefinitionType.DEFINITION_TYPE;

    /**
     * The table <code>public.definition_type_label</code>.
     */
    public final DefinitionTypeLabel DEFINITION_TYPE_LABEL = DefinitionTypeLabel.DEFINITION_TYPE_LABEL;

    /**
     * The table <code>public.deriv</code>.
     */
    public final Deriv DERIV = Deriv.DERIV;

    /**
     * The table <code>public.deriv_label</code>.
     */
    public final DerivLabel DERIV_LABEL = DerivLabel.DERIV_LABEL;

    /**
     * The table <code>public.display_morph</code>.
     */
    public final DisplayMorph DISPLAY_MORPH = DisplayMorph.DISPLAY_MORPH;

    /**
     * The table <code>public.display_morph_label</code>.
     */
    public final DisplayMorphLabel DISPLAY_MORPH_LABEL = DisplayMorphLabel.DISPLAY_MORPH_LABEL;

    /**
     * The table <code>public.domain</code>.
     */
    public final Domain DOMAIN = Domain.DOMAIN;

    /**
     * The table <code>public.domain_label</code>.
     */
    public final DomainLabel DOMAIN_LABEL = DomainLabel.DOMAIN_LABEL;

    /**
     * The table <code>public.eki_user</code>.
     */
    public final EkiUser EKI_USER = EkiUser.EKI_USER;

    /**
     * The table <code>public.eki_user_application</code>.
     */
    public final EkiUserApplication EKI_USER_APPLICATION = EkiUserApplication.EKI_USER_APPLICATION;

    /**
     * The table <code>public.eki_user_profile</code>.
     */
    public final EkiUserProfile EKI_USER_PROFILE = EkiUserProfile.EKI_USER_PROFILE;

    /**
     * The table <code>public.etymology_type</code>.
     */
    public final EtymologyType ETYMOLOGY_TYPE = EtymologyType.ETYMOLOGY_TYPE;

    /**
     * The table <code>public.feedback_log</code>.
     */
    public final FeedbackLog FEEDBACK_LOG = FeedbackLog.FEEDBACK_LOG;

    /**
     * The table <code>public.feedback_log_comment</code>.
     */
    public final FeedbackLogComment FEEDBACK_LOG_COMMENT = FeedbackLogComment.FEEDBACK_LOG_COMMENT;

    /**
     * The table <code>public.form</code>.
     */
    public final Form FORM = Form.FORM;

    /**
     * The table <code>public.form_freq</code>.
     */
    public final FormFreq FORM_FREQ = FormFreq.FORM_FREQ;

    /**
     * The table <code>public.freeform</code>.
     */
    public final Freeform FREEFORM = Freeform.FREEFORM;

    /**
     * The table <code>public.freeform_source_link</code>.
     */
    public final FreeformSourceLink FREEFORM_SOURCE_LINK = FreeformSourceLink.FREEFORM_SOURCE_LINK;

    /**
     * The table <code>public.freq_corp</code>.
     */
    public final FreqCorp FREQ_CORP = FreqCorp.FREQ_CORP;

    /**
     * The table <code>public.game_nonword</code>.
     */
    public final GameNonword GAME_NONWORD = GameNonword.GAME_NONWORD;

    /**
     * The table <code>public.gender</code>.
     */
    public final Gender GENDER = Gender.GENDER;

    /**
     * The table <code>public.gender_label</code>.
     */
    public final GenderLabel GENDER_LABEL = GenderLabel.GENDER_LABEL;

    /**
     * The table <code>public.government_type</code>.
     */
    public final GovernmentType GOVERNMENT_TYPE = GovernmentType.GOVERNMENT_TYPE;

    /**
     * The table <code>public.government_type_label</code>.
     */
    public final GovernmentTypeLabel GOVERNMENT_TYPE_LABEL = GovernmentTypeLabel.GOVERNMENT_TYPE_LABEL;

    /**
     * The table <code>public.label_type</code>.
     */
    public final LabelType LABEL_TYPE = LabelType.LABEL_TYPE;

    /**
     * The table <code>public.language</code>.
     */
    public final Language LANGUAGE = Language.LANGUAGE;

    /**
     * The table <code>public.language_label</code>.
     */
    public final LanguageLabel LANGUAGE_LABEL = LanguageLabel.LANGUAGE_LABEL;

    /**
     * The table <code>public.lex_colloc</code>.
     */
    public final LexColloc LEX_COLLOC = LexColloc.LEX_COLLOC;

    /**
     * The table <code>public.lex_colloc_pos_group</code>.
     */
    public final LexCollocPosGroup LEX_COLLOC_POS_GROUP = LexCollocPosGroup.LEX_COLLOC_POS_GROUP;

    /**
     * The table <code>public.lex_colloc_rel_group</code>.
     */
    public final LexCollocRelGroup LEX_COLLOC_REL_GROUP = LexCollocRelGroup.LEX_COLLOC_REL_GROUP;

    /**
     * The table <code>public.lex_rel_mapping</code>.
     */
    public final LexRelMapping LEX_REL_MAPPING = LexRelMapping.LEX_REL_MAPPING;

    /**
     * The table <code>public.lex_rel_type</code>.
     */
    public final LexRelType LEX_REL_TYPE = LexRelType.LEX_REL_TYPE;

    /**
     * The table <code>public.lex_rel_type_label</code>.
     */
    public final LexRelTypeLabel LEX_REL_TYPE_LABEL = LexRelTypeLabel.LEX_REL_TYPE_LABEL;

    /**
     * The table <code>public.lex_relation</code>.
     */
    public final LexRelation LEX_RELATION = LexRelation.LEX_RELATION;

    /**
     * The table <code>public.lexeme</code>.
     */
    public final Lexeme LEXEME = Lexeme.LEXEME;

    /**
     * The table <code>public.lexeme_activity_log</code>.
     */
    public final LexemeActivityLog LEXEME_ACTIVITY_LOG = LexemeActivityLog.LEXEME_ACTIVITY_LOG;

    /**
     * The table <code>public.lexeme_deriv</code>.
     */
    public final LexemeDeriv LEXEME_DERIV = LexemeDeriv.LEXEME_DERIV;

    /**
     * The table <code>public.lexeme_freeform</code>.
     */
    public final LexemeFreeform LEXEME_FREEFORM = LexemeFreeform.LEXEME_FREEFORM;

    /**
     * The table <code>public.lexeme_pos</code>.
     */
    public final LexemePos LEXEME_POS = LexemePos.LEXEME_POS;

    /**
     * The table <code>public.lexeme_region</code>.
     */
    public final LexemeRegion LEXEME_REGION = LexemeRegion.LEXEME_REGION;

    /**
     * The table <code>public.lexeme_register</code>.
     */
    public final LexemeRegister LEXEME_REGISTER = LexemeRegister.LEXEME_REGISTER;

    /**
     * The table <code>public.lexeme_source_link</code>.
     */
    public final LexemeSourceLink LEXEME_SOURCE_LINK = LexemeSourceLink.LEXEME_SOURCE_LINK;

    /**
     * The table <code>public.lexeme_tag</code>.
     */
    public final LexemeTag LEXEME_TAG = LexemeTag.LEXEME_TAG;

    /**
     * The table <code>public.meaning</code>.
     */
    public final Meaning MEANING = Meaning.MEANING;

    /**
     * The table <code>public.meaning_activity_log</code>.
     */
    public final MeaningActivityLog MEANING_ACTIVITY_LOG = MeaningActivityLog.MEANING_ACTIVITY_LOG;

    /**
     * The table <code>public.meaning_domain</code>.
     */
    public final MeaningDomain MEANING_DOMAIN = MeaningDomain.MEANING_DOMAIN;

    /**
     * The table <code>public.meaning_freeform</code>.
     */
    public final MeaningFreeform MEANING_FREEFORM = MeaningFreeform.MEANING_FREEFORM;

    /**
     * The table <code>public.meaning_last_activity_log</code>.
     */
    public final MeaningLastActivityLog MEANING_LAST_ACTIVITY_LOG = MeaningLastActivityLog.MEANING_LAST_ACTIVITY_LOG;

    /**
     * The table <code>public.meaning_nr</code>.
     */
    public final MeaningNr MEANING_NR = MeaningNr.MEANING_NR;

    /**
     * The table <code>public.meaning_rel_mapping</code>.
     */
    public final MeaningRelMapping MEANING_REL_MAPPING = MeaningRelMapping.MEANING_REL_MAPPING;

    /**
     * The table <code>public.meaning_rel_type</code>.
     */
    public final MeaningRelType MEANING_REL_TYPE = MeaningRelType.MEANING_REL_TYPE;

    /**
     * The table <code>public.meaning_rel_type_label</code>.
     */
    public final MeaningRelTypeLabel MEANING_REL_TYPE_LABEL = MeaningRelTypeLabel.MEANING_REL_TYPE_LABEL;

    /**
     * The table <code>public.meaning_relation</code>.
     */
    public final MeaningRelation MEANING_RELATION = MeaningRelation.MEANING_RELATION;

    /**
     * The table <code>public.meaning_semantic_type</code>.
     */
    public final MeaningSemanticType MEANING_SEMANTIC_TYPE = MeaningSemanticType.MEANING_SEMANTIC_TYPE;

    /**
     * The table <code>public.morph</code>.
     */
    public final Morph MORPH = Morph.MORPH;

    /**
     * The table <code>public.morph_freq</code>.
     */
    public final MorphFreq MORPH_FREQ = MorphFreq.MORPH_FREQ;

    /**
     * The table <code>public.morph_label</code>.
     */
    public final MorphLabel MORPH_LABEL = MorphLabel.MORPH_LABEL;

    /**
     * The table <code>public.paradigm</code>.
     */
    public final Paradigm PARADIGM = Paradigm.PARADIGM;

    /**
     * The table <code>public.pos</code>.
     */
    public final Pos POS = Pos.POS;

    /**
     * The table <code>public.pos_group</code>.
     */
    public final PosGroup POS_GROUP = PosGroup.POS_GROUP;

    /**
     * The table <code>public.pos_group_label</code>.
     */
    public final PosGroupLabel POS_GROUP_LABEL = PosGroupLabel.POS_GROUP_LABEL;

    /**
     * The table <code>public.pos_label</code>.
     */
    public final PosLabel POS_LABEL = PosLabel.POS_LABEL;

    /**
     * The table <code>public.region</code>.
     */
    public final Region REGION = Region.REGION;

    /**
     * The table <code>public.register</code>.
     */
    public final Register REGISTER = Register.REGISTER;

    /**
     * The table <code>public.register_label</code>.
     */
    public final RegisterLabel REGISTER_LABEL = RegisterLabel.REGISTER_LABEL;

    /**
     * The table <code>public.semantic_type</code>.
     */
    public final SemanticType SEMANTIC_TYPE = SemanticType.SEMANTIC_TYPE;

    /**
     * The table <code>public.semantic_type_label</code>.
     */
    public final SemanticTypeLabel SEMANTIC_TYPE_LABEL = SemanticTypeLabel.SEMANTIC_TYPE_LABEL;

    /**
     * The table <code>public.source</code>.
     */
    public final Source SOURCE = Source.SOURCE;

    /**
     * The table <code>public.source_activity_log</code>.
     */
    public final SourceActivityLog SOURCE_ACTIVITY_LOG = SourceActivityLog.SOURCE_ACTIVITY_LOG;

    /**
     * The table <code>public.source_freeform</code>.
     */
    public final SourceFreeform SOURCE_FREEFORM = SourceFreeform.SOURCE_FREEFORM;

    /**
     * The table <code>public.tag</code>.
     */
    public final Tag TAG = Tag.TAG;

    /**
     * The table <code>public.temp_ds_import_pk_map</code>.
     */
    public final TempDsImportPkMap TEMP_DS_IMPORT_PK_MAP = TempDsImportPkMap.TEMP_DS_IMPORT_PK_MAP;

    /**
     * The table <code>public.temp_ds_import_queue</code>.
     */
    public final TempDsImportQueue TEMP_DS_IMPORT_QUEUE = TempDsImportQueue.TEMP_DS_IMPORT_QUEUE;

    /**
     * The table <code>public.terms_of_use</code>.
     */
    public final TermsOfUse TERMS_OF_USE = TermsOfUse.TERMS_OF_USE;

    /**
     * The table <code>public.usage_type</code>.
     */
    public final UsageType USAGE_TYPE = UsageType.USAGE_TYPE;

    /**
     * The table <code>public.usage_type_label</code>.
     */
    public final UsageTypeLabel USAGE_TYPE_LABEL = UsageTypeLabel.USAGE_TYPE_LABEL;

    /**
     * The table <code>public.value_state</code>.
     */
    public final ValueState VALUE_STATE = ValueState.VALUE_STATE;

    /**
     * The table <code>public.value_state_label</code>.
     */
    public final ValueStateLabel VALUE_STATE_LABEL = ValueStateLabel.VALUE_STATE_LABEL;

    /**
     * The table <code>public.view_ww_classifier</code>.
     */
    public final ViewWwClassifier VIEW_WW_CLASSIFIER = ViewWwClassifier.VIEW_WW_CLASSIFIER;

    /**
     * The table <code>public.view_ww_collocation</code>.
     */
    public final ViewWwCollocation VIEW_WW_COLLOCATION = ViewWwCollocation.VIEW_WW_COLLOCATION;

    /**
     * The table <code>public.view_ww_dataset</code>.
     */
    public final ViewWwDataset VIEW_WW_DATASET = ViewWwDataset.VIEW_WW_DATASET;

    /**
     * The table <code>public.view_ww_dataset_word_menu</code>.
     */
    public final ViewWwDatasetWordMenu VIEW_WW_DATASET_WORD_MENU = ViewWwDatasetWordMenu.VIEW_WW_DATASET_WORD_MENU;

    /**
     * The table <code>public.view_ww_definition_source_link</code>.
     */
    public final ViewWwDefinitionSourceLink VIEW_WW_DEFINITION_SOURCE_LINK = ViewWwDefinitionSourceLink.VIEW_WW_DEFINITION_SOURCE_LINK;

    /**
     * The table <code>public.view_ww_form</code>.
     */
    public final ViewWwForm VIEW_WW_FORM = ViewWwForm.VIEW_WW_FORM;

    /**
     * The table <code>public.view_ww_lexeme</code>.
     */
    public final ViewWwLexeme VIEW_WW_LEXEME = ViewWwLexeme.VIEW_WW_LEXEME;

    /**
     * The table <code>public.view_ww_lexeme_freeform_source_link</code>.
     */
    public final ViewWwLexemeFreeformSourceLink VIEW_WW_LEXEME_FREEFORM_SOURCE_LINK = ViewWwLexemeFreeformSourceLink.VIEW_WW_LEXEME_FREEFORM_SOURCE_LINK;

    /**
     * The table <code>public.view_ww_lexeme_relation</code>.
     */
    public final ViewWwLexemeRelation VIEW_WW_LEXEME_RELATION = ViewWwLexemeRelation.VIEW_WW_LEXEME_RELATION;

    /**
     * The table <code>public.view_ww_lexeme_source_link</code>.
     */
    public final ViewWwLexemeSourceLink VIEW_WW_LEXEME_SOURCE_LINK = ViewWwLexemeSourceLink.VIEW_WW_LEXEME_SOURCE_LINK;

    /**
     * The table <code>public.view_ww_lexical_decision_data</code>.
     */
    public final ViewWwLexicalDecisionData VIEW_WW_LEXICAL_DECISION_DATA = ViewWwLexicalDecisionData.VIEW_WW_LEXICAL_DECISION_DATA;

    /**
     * The table <code>public.view_ww_meaning</code>.
     */
    public final ViewWwMeaning VIEW_WW_MEANING = ViewWwMeaning.VIEW_WW_MEANING;

    /**
     * The table <code>public.view_ww_meaning_freeform_source_link</code>.
     */
    public final ViewWwMeaningFreeformSourceLink VIEW_WW_MEANING_FREEFORM_SOURCE_LINK = ViewWwMeaningFreeformSourceLink.VIEW_WW_MEANING_FREEFORM_SOURCE_LINK;

    /**
     * The table <code>public.view_ww_meaning_relation</code>.
     */
    public final ViewWwMeaningRelation VIEW_WW_MEANING_RELATION = ViewWwMeaningRelation.VIEW_WW_MEANING_RELATION;

    /**
     * The table <code>public.view_ww_similarity_judgement_data</code>.
     */
    public final ViewWwSimilarityJudgementData VIEW_WW_SIMILARITY_JUDGEMENT_DATA = ViewWwSimilarityJudgementData.VIEW_WW_SIMILARITY_JUDGEMENT_DATA;

    /**
     * The table <code>public.view_ww_word</code>.
     */
    public final ViewWwWord VIEW_WW_WORD = ViewWwWord.VIEW_WW_WORD;

    /**
     * The table <code>public.view_ww_word_etym_source_link</code>.
     */
    public final ViewWwWordEtymSourceLink VIEW_WW_WORD_ETYM_SOURCE_LINK = ViewWwWordEtymSourceLink.VIEW_WW_WORD_ETYM_SOURCE_LINK;

    /**
     * The table <code>public.view_ww_word_etymology</code>.
     */
    public final ViewWwWordEtymology VIEW_WW_WORD_ETYMOLOGY = ViewWwWordEtymology.VIEW_WW_WORD_ETYMOLOGY;

    /**
     * The table <code>public.view_ww_word_relation</code>.
     */
    public final ViewWwWordRelation VIEW_WW_WORD_RELATION = ViewWwWordRelation.VIEW_WW_WORD_RELATION;

    /**
     * The table <code>public.view_ww_word_search</code>.
     */
    public final ViewWwWordSearch VIEW_WW_WORD_SEARCH = ViewWwWordSearch.VIEW_WW_WORD_SEARCH;

    /**
     * The table <code>public.word</code>.
     */
    public final Word WORD = Word.WORD;

    /**
     * The table <code>public.word_activity_log</code>.
     */
    public final WordActivityLog WORD_ACTIVITY_LOG = WordActivityLog.WORD_ACTIVITY_LOG;

    /**
     * The table <code>public.word_etymology</code>.
     */
    public final WordEtymology WORD_ETYMOLOGY = WordEtymology.WORD_ETYMOLOGY;

    /**
     * The table <code>public.word_etymology_relation</code>.
     */
    public final WordEtymologyRelation WORD_ETYMOLOGY_RELATION = WordEtymologyRelation.WORD_ETYMOLOGY_RELATION;

    /**
     * The table <code>public.word_etymology_source_link</code>.
     */
    public final WordEtymologySourceLink WORD_ETYMOLOGY_SOURCE_LINK = WordEtymologySourceLink.WORD_ETYMOLOGY_SOURCE_LINK;

    /**
     * The table <code>public.word_freeform</code>.
     */
    public final WordFreeform WORD_FREEFORM = WordFreeform.WORD_FREEFORM;

    /**
     * The table <code>public.word_freq</code>.
     */
    public final WordFreq WORD_FREQ = WordFreq.WORD_FREQ;

    /**
     * The table <code>public.word_group</code>.
     */
    public final WordGroup WORD_GROUP = WordGroup.WORD_GROUP;

    /**
     * The table <code>public.word_group_member</code>.
     */
    public final WordGroupMember WORD_GROUP_MEMBER = WordGroupMember.WORD_GROUP_MEMBER;

    /**
     * The table <code>public.word_guid</code>.
     */
    public final WordGuid WORD_GUID = WordGuid.WORD_GUID;

    /**
     * The table <code>public.word_last_activity_log</code>.
     */
    public final WordLastActivityLog WORD_LAST_ACTIVITY_LOG = WordLastActivityLog.WORD_LAST_ACTIVITY_LOG;

    /**
     * The table <code>public.word_rel_mapping</code>.
     */
    public final WordRelMapping WORD_REL_MAPPING = WordRelMapping.WORD_REL_MAPPING;

    /**
     * The table <code>public.word_rel_type</code>.
     */
    public final WordRelType WORD_REL_TYPE = WordRelType.WORD_REL_TYPE;

    /**
     * The table <code>public.word_rel_type_label</code>.
     */
    public final WordRelTypeLabel WORD_REL_TYPE_LABEL = WordRelTypeLabel.WORD_REL_TYPE_LABEL;

    /**
     * The table <code>public.word_relation</code>.
     */
    public final WordRelation WORD_RELATION = WordRelation.WORD_RELATION;

    /**
     * The table <code>public.word_relation_param</code>.
     */
    public final WordRelationParam WORD_RELATION_PARAM = WordRelationParam.WORD_RELATION_PARAM;

    /**
     * The table <code>public.word_type</code>.
     */
    public final WordType WORD_TYPE = WordType.WORD_TYPE;

    /**
     * The table <code>public.word_type_label</code>.
     */
    public final WordTypeLabel WORD_TYPE_LABEL = WordTypeLabel.WORD_TYPE_LABEL;

    /**
     * The table <code>public.word_word_type</code>.
     */
    public final WordWordType WORD_WORD_TYPE = WordWordType.WORD_WORD_TYPE;

    /**
     * No further instances allowed
     */
    private Public() {
        super("public", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Sequence<?>> getSequences() {
        return Arrays.<Sequence<?>>asList(
            Sequences.ACTIVITY_LOG_ID_SEQ,
            Sequences.ASPECT_ORDER_BY_SEQ,
            Sequences.COLLOCATION_FREEFORM_ID_SEQ,
            Sequences.COLLOCATION_ID_SEQ,
            Sequences.DATASET_ORDER_BY_SEQ,
            Sequences.DATASET_PERMISSION_ID_SEQ,
            Sequences.DEFINITION_FREEFORM_ID_SEQ,
            Sequences.DEFINITION_ID_SEQ,
            Sequences.DEFINITION_ORDER_BY_SEQ,
            Sequences.DEFINITION_SOURCE_LINK_ID_SEQ,
            Sequences.DEFINITION_SOURCE_LINK_ORDER_BY_SEQ,
            Sequences.DEFINITION_TYPE_ORDER_BY_SEQ,
            Sequences.DERIV_ORDER_BY_SEQ,
            Sequences.DISPLAY_MORPH_ORDER_BY_SEQ,
            Sequences.DOMAIN_ORDER_BY_SEQ,
            Sequences.EKI_USER_APPLICATION_ID_SEQ,
            Sequences.EKI_USER_ID_SEQ,
            Sequences.EKI_USER_PROFILE_ID_SEQ,
            Sequences.ETYMOLOGY_TYPE_ORDER_BY_SEQ,
            Sequences.FEEDBACK_LOG_COMMENT_ID_SEQ,
            Sequences.FEEDBACK_LOG_ID_SEQ,
            Sequences.FORM_FREQ_ID_SEQ,
            Sequences.FORM_ID_SEQ,
            Sequences.FORM_ORDER_BY_SEQ,
            Sequences.FREEFORM_ID_SEQ,
            Sequences.FREEFORM_ORDER_BY_SEQ,
            Sequences.FREEFORM_SOURCE_LINK_ID_SEQ,
            Sequences.FREEFORM_SOURCE_LINK_ORDER_BY_SEQ,
            Sequences.FREQ_CORP_ID_SEQ,
            Sequences.GAME_NONWORD_ID_SEQ,
            Sequences.GENDER_ORDER_BY_SEQ,
            Sequences.GOVERNMENT_TYPE_ORDER_BY_SEQ,
            Sequences.LANGUAGE_ORDER_BY_SEQ,
            Sequences.LEX_COLLOC_ID_SEQ,
            Sequences.LEX_COLLOC_POS_GROUP_ID_SEQ,
            Sequences.LEX_COLLOC_POS_GROUP_ORDER_BY_SEQ,
            Sequences.LEX_COLLOC_REL_GROUP_ID_SEQ,
            Sequences.LEX_COLLOC_REL_GROUP_ORDER_BY_SEQ,
            Sequences.LEX_REL_TYPE_ORDER_BY_SEQ,
            Sequences.LEX_RELATION_ID_SEQ,
            Sequences.LEX_RELATION_ORDER_BY_SEQ,
            Sequences.LEXEME_ACTIVITY_LOG_ID_SEQ,
            Sequences.LEXEME_DERIV_ID_SEQ,
            Sequences.LEXEME_DERIV_ORDER_BY_SEQ,
            Sequences.LEXEME_FREEFORM_ID_SEQ,
            Sequences.LEXEME_FREEFORM_ORDER_BY_SEQ,
            Sequences.LEXEME_ID_SEQ,
            Sequences.LEXEME_ORDER_BY_SEQ,
            Sequences.LEXEME_POS_ID_SEQ,
            Sequences.LEXEME_POS_ORDER_BY_SEQ,
            Sequences.LEXEME_REGION_ID_SEQ,
            Sequences.LEXEME_REGION_ORDER_BY_SEQ,
            Sequences.LEXEME_REGISTER_ID_SEQ,
            Sequences.LEXEME_REGISTER_ORDER_BY_SEQ,
            Sequences.LEXEME_SOURCE_LINK_ID_SEQ,
            Sequences.LEXEME_SOURCE_LINK_ORDER_BY_SEQ,
            Sequences.LEXEME_TAG_ID_SEQ,
            Sequences.MEANING_ACTIVITY_LOG_ID_SEQ,
            Sequences.MEANING_DOMAIN_ID_SEQ,
            Sequences.MEANING_DOMAIN_ORDER_BY_SEQ,
            Sequences.MEANING_FREEFORM_ID_SEQ,
            Sequences.MEANING_ID_SEQ,
            Sequences.MEANING_LAST_ACTIVITY_LOG_ID_SEQ,
            Sequences.MEANING_NR_ID_SEQ,
            Sequences.MEANING_REL_TYPE_ORDER_BY_SEQ,
            Sequences.MEANING_RELATION_ID_SEQ,
            Sequences.MEANING_RELATION_ORDER_BY_SEQ,
            Sequences.MEANING_SEMANTIC_TYPE_ID_SEQ,
            Sequences.MEANING_SEMANTIC_TYPE_ORDER_BY_SEQ,
            Sequences.MORPH_FREQ_ID_SEQ,
            Sequences.MORPH_ORDER_BY_SEQ,
            Sequences.PARADIGM_ID_SEQ,
            Sequences.POS_GROUP_ORDER_BY_SEQ,
            Sequences.POS_ORDER_BY_SEQ,
            Sequences.REGION_ORDER_BY_SEQ,
            Sequences.REGISTER_ORDER_BY_SEQ,
            Sequences.SEMANTIC_TYPE_ORDER_BY_SEQ,
            Sequences.SOURCE_ACTIVITY_LOG_ID_SEQ,
            Sequences.SOURCE_FREEFORM_ID_SEQ,
            Sequences.SOURCE_ID_SEQ,
            Sequences.TAG_ORDER_BY_SEQ,
            Sequences.TEMP_DS_IMPORT_PK_MAP_ID_SEQ,
            Sequences.TEMP_DS_IMPORT_QUEUE_ID_SEQ,
            Sequences.TERMS_OF_USE_ID_SEQ,
            Sequences.USAGE_TYPE_ORDER_BY_SEQ,
            Sequences.VALUE_STATE_ORDER_BY_SEQ,
            Sequences.WORD_ACTIVITY_LOG_ID_SEQ,
            Sequences.WORD_ETYMOLOGY_ID_SEQ,
            Sequences.WORD_ETYMOLOGY_ORDER_BY_SEQ,
            Sequences.WORD_ETYMOLOGY_RELATION_ID_SEQ,
            Sequences.WORD_ETYMOLOGY_RELATION_ORDER_BY_SEQ,
            Sequences.WORD_ETYMOLOGY_SOURCE_LINK_ID_SEQ,
            Sequences.WORD_ETYMOLOGY_SOURCE_LINK_ORDER_BY_SEQ,
            Sequences.WORD_FREEFORM_ID_SEQ,
            Sequences.WORD_FREEFORM_ORDER_BY_SEQ,
            Sequences.WORD_FREQ_ID_SEQ,
            Sequences.WORD_GROUP_ID_SEQ,
            Sequences.WORD_GROUP_MEMBER_ID_SEQ,
            Sequences.WORD_GROUP_MEMBER_ORDER_BY_SEQ,
            Sequences.WORD_GUID_ID_SEQ,
            Sequences.WORD_ID_SEQ,
            Sequences.WORD_LAST_ACTIVITY_LOG_ID_SEQ,
            Sequences.WORD_REL_TYPE_ORDER_BY_SEQ,
            Sequences.WORD_RELATION_ID_SEQ,
            Sequences.WORD_RELATION_ORDER_BY_SEQ,
            Sequences.WORD_RELATION_PARAM_ID_SEQ,
            Sequences.WORD_TYPE_ORDER_BY_SEQ,
            Sequences.WORD_WORD_TYPE_ID_SEQ,
            Sequences.WORD_WORD_TYPE_ORDER_BY_SEQ);
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.<Table<?>>asList(
            ActivityLog.ACTIVITY_LOG,
            Aspect.ASPECT,
            AspectLabel.ASPECT_LABEL,
            Collocation.COLLOCATION,
            CollocationFreeform.COLLOCATION_FREEFORM,
            Dataset.DATASET,
            DatasetPermission.DATASET_PERMISSION,
            Definition.DEFINITION,
            DefinitionDataset.DEFINITION_DATASET,
            DefinitionFreeform.DEFINITION_FREEFORM,
            DefinitionSourceLink.DEFINITION_SOURCE_LINK,
            DefinitionType.DEFINITION_TYPE,
            DefinitionTypeLabel.DEFINITION_TYPE_LABEL,
            Deriv.DERIV,
            DerivLabel.DERIV_LABEL,
            DisplayMorph.DISPLAY_MORPH,
            DisplayMorphLabel.DISPLAY_MORPH_LABEL,
            Domain.DOMAIN,
            DomainLabel.DOMAIN_LABEL,
            EkiUser.EKI_USER,
            EkiUserApplication.EKI_USER_APPLICATION,
            EkiUserProfile.EKI_USER_PROFILE,
            EtymologyType.ETYMOLOGY_TYPE,
            FeedbackLog.FEEDBACK_LOG,
            FeedbackLogComment.FEEDBACK_LOG_COMMENT,
            Form.FORM,
            FormFreq.FORM_FREQ,
            Freeform.FREEFORM,
            FreeformSourceLink.FREEFORM_SOURCE_LINK,
            FreqCorp.FREQ_CORP,
            GameNonword.GAME_NONWORD,
            Gender.GENDER,
            GenderLabel.GENDER_LABEL,
            GovernmentType.GOVERNMENT_TYPE,
            GovernmentTypeLabel.GOVERNMENT_TYPE_LABEL,
            LabelType.LABEL_TYPE,
            Language.LANGUAGE,
            LanguageLabel.LANGUAGE_LABEL,
            LexColloc.LEX_COLLOC,
            LexCollocPosGroup.LEX_COLLOC_POS_GROUP,
            LexCollocRelGroup.LEX_COLLOC_REL_GROUP,
            LexRelMapping.LEX_REL_MAPPING,
            LexRelType.LEX_REL_TYPE,
            LexRelTypeLabel.LEX_REL_TYPE_LABEL,
            LexRelation.LEX_RELATION,
            Lexeme.LEXEME,
            LexemeActivityLog.LEXEME_ACTIVITY_LOG,
            LexemeDeriv.LEXEME_DERIV,
            LexemeFreeform.LEXEME_FREEFORM,
            LexemePos.LEXEME_POS,
            LexemeRegion.LEXEME_REGION,
            LexemeRegister.LEXEME_REGISTER,
            LexemeSourceLink.LEXEME_SOURCE_LINK,
            LexemeTag.LEXEME_TAG,
            Meaning.MEANING,
            MeaningActivityLog.MEANING_ACTIVITY_LOG,
            MeaningDomain.MEANING_DOMAIN,
            MeaningFreeform.MEANING_FREEFORM,
            MeaningLastActivityLog.MEANING_LAST_ACTIVITY_LOG,
            MeaningNr.MEANING_NR,
            MeaningRelMapping.MEANING_REL_MAPPING,
            MeaningRelType.MEANING_REL_TYPE,
            MeaningRelTypeLabel.MEANING_REL_TYPE_LABEL,
            MeaningRelation.MEANING_RELATION,
            MeaningSemanticType.MEANING_SEMANTIC_TYPE,
            Morph.MORPH,
            MorphFreq.MORPH_FREQ,
            MorphLabel.MORPH_LABEL,
            Paradigm.PARADIGM,
            Pos.POS,
            PosGroup.POS_GROUP,
            PosGroupLabel.POS_GROUP_LABEL,
            PosLabel.POS_LABEL,
            Region.REGION,
            Register.REGISTER,
            RegisterLabel.REGISTER_LABEL,
            SemanticType.SEMANTIC_TYPE,
            SemanticTypeLabel.SEMANTIC_TYPE_LABEL,
            Source.SOURCE,
            SourceActivityLog.SOURCE_ACTIVITY_LOG,
            SourceFreeform.SOURCE_FREEFORM,
            Tag.TAG,
            TempDsImportPkMap.TEMP_DS_IMPORT_PK_MAP,
            TempDsImportQueue.TEMP_DS_IMPORT_QUEUE,
            TermsOfUse.TERMS_OF_USE,
            UsageType.USAGE_TYPE,
            UsageTypeLabel.USAGE_TYPE_LABEL,
            ValueState.VALUE_STATE,
            ValueStateLabel.VALUE_STATE_LABEL,
            ViewWwClassifier.VIEW_WW_CLASSIFIER,
            ViewWwCollocation.VIEW_WW_COLLOCATION,
            ViewWwDataset.VIEW_WW_DATASET,
            ViewWwDatasetWordMenu.VIEW_WW_DATASET_WORD_MENU,
            ViewWwDefinitionSourceLink.VIEW_WW_DEFINITION_SOURCE_LINK,
            ViewWwForm.VIEW_WW_FORM,
            ViewWwLexeme.VIEW_WW_LEXEME,
            ViewWwLexemeFreeformSourceLink.VIEW_WW_LEXEME_FREEFORM_SOURCE_LINK,
            ViewWwLexemeRelation.VIEW_WW_LEXEME_RELATION,
            ViewWwLexemeSourceLink.VIEW_WW_LEXEME_SOURCE_LINK,
            ViewWwLexicalDecisionData.VIEW_WW_LEXICAL_DECISION_DATA,
            ViewWwMeaning.VIEW_WW_MEANING,
            ViewWwMeaningFreeformSourceLink.VIEW_WW_MEANING_FREEFORM_SOURCE_LINK,
            ViewWwMeaningRelation.VIEW_WW_MEANING_RELATION,
            ViewWwSimilarityJudgementData.VIEW_WW_SIMILARITY_JUDGEMENT_DATA,
            ViewWwWord.VIEW_WW_WORD,
            ViewWwWordEtymSourceLink.VIEW_WW_WORD_ETYM_SOURCE_LINK,
            ViewWwWordEtymology.VIEW_WW_WORD_ETYMOLOGY,
            ViewWwWordRelation.VIEW_WW_WORD_RELATION,
            ViewWwWordSearch.VIEW_WW_WORD_SEARCH,
            Word.WORD,
            WordActivityLog.WORD_ACTIVITY_LOG,
            WordEtymology.WORD_ETYMOLOGY,
            WordEtymologyRelation.WORD_ETYMOLOGY_RELATION,
            WordEtymologySourceLink.WORD_ETYMOLOGY_SOURCE_LINK,
            WordFreeform.WORD_FREEFORM,
            WordFreq.WORD_FREQ,
            WordGroup.WORD_GROUP,
            WordGroupMember.WORD_GROUP_MEMBER,
            WordGuid.WORD_GUID,
            WordLastActivityLog.WORD_LAST_ACTIVITY_LOG,
            WordRelMapping.WORD_REL_MAPPING,
            WordRelType.WORD_REL_TYPE,
            WordRelTypeLabel.WORD_REL_TYPE_LABEL,
            WordRelation.WORD_RELATION,
            WordRelationParam.WORD_RELATION_PARAM,
            WordType.WORD_TYPE,
            WordTypeLabel.WORD_TYPE_LABEL,
            WordWordType.WORD_WORD_TYPE);
    }

    @Override
    public final List<UDT<?>> getUDTs() {
        return Arrays.<UDT<?>>asList(
            TypeActivityLogDiff.TYPE_ACTIVITY_LOG_DIFF,
            TypeClassifier.TYPE_CLASSIFIER,
            TypeCollocMember.TYPE_COLLOC_MEMBER,
            TypeDefinition.TYPE_DEFINITION,
            TypeDomain.TYPE_DOMAIN,
            TypeFreeform.TYPE_FREEFORM,
            TypeLangComplexity.TYPE_LANG_COMPLEXITY,
            TypeLexemeRelation.TYPE_LEXEME_RELATION,
            TypeMeaningRelation.TYPE_MEANING_RELATION,
            TypeMeaningWord.TYPE_MEANING_WORD,
            TypeMediaFile.TYPE_MEDIA_FILE,
            TypeSourceLink.TYPE_SOURCE_LINK,
            TypeTermMeaningWord.TYPE_TERM_MEANING_WORD,
            TypeUsage.TYPE_USAGE,
            TypeWordEtymRelation.TYPE_WORD_ETYM_RELATION,
            TypeWordRelMeaning.TYPE_WORD_REL_MEANING,
            TypeWordRelParam.TYPE_WORD_REL_PARAM,
            TypeWordRelation.TYPE_WORD_RELATION);
    }
}
