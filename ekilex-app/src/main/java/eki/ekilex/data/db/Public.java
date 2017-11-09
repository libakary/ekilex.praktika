/*
 * This file is generated by jOOQ.
*/
package eki.ekilex.data.db;


import eki.ekilex.data.db.tables.Dataset;
import eki.ekilex.data.db.tables.Definition;
import eki.ekilex.data.db.tables.DefinitionDataset;
import eki.ekilex.data.db.tables.DefinitionFreeform;
import eki.ekilex.data.db.tables.Deriv;
import eki.ekilex.data.db.tables.DerivLabel;
import eki.ekilex.data.db.tables.Domain;
import eki.ekilex.data.db.tables.DomainLabel;
import eki.ekilex.data.db.tables.EkiUser;
import eki.ekilex.data.db.tables.EntryClass;
import eki.ekilex.data.db.tables.Form;
import eki.ekilex.data.db.tables.FormRelType;
import eki.ekilex.data.db.tables.FormRelTypeLabel;
import eki.ekilex.data.db.tables.FormRelation;
import eki.ekilex.data.db.tables.Freeform;
import eki.ekilex.data.db.tables.Gender;
import eki.ekilex.data.db.tables.GenderLabel;
import eki.ekilex.data.db.tables.LabelType;
import eki.ekilex.data.db.tables.Lang;
import eki.ekilex.data.db.tables.LangLabel;
import eki.ekilex.data.db.tables.LexRelType;
import eki.ekilex.data.db.tables.LexRelTypeLabel;
import eki.ekilex.data.db.tables.LexRelation;
import eki.ekilex.data.db.tables.LexRelationDataset;
import eki.ekilex.data.db.tables.Lexeme;
import eki.ekilex.data.db.tables.LexemeDataset;
import eki.ekilex.data.db.tables.LexemeDeriv;
import eki.ekilex.data.db.tables.LexemeFreeform;
import eki.ekilex.data.db.tables.LexemeFrequency;
import eki.ekilex.data.db.tables.LexemePos;
import eki.ekilex.data.db.tables.LexemeRegister;
import eki.ekilex.data.db.tables.LexemeType;
import eki.ekilex.data.db.tables.LexemeTypeLabel;
import eki.ekilex.data.db.tables.LifecycleLog;
import eki.ekilex.data.db.tables.Meaning;
import eki.ekilex.data.db.tables.MeaningDataset;
import eki.ekilex.data.db.tables.MeaningDomain;
import eki.ekilex.data.db.tables.MeaningFreeform;
import eki.ekilex.data.db.tables.MeaningState;
import eki.ekilex.data.db.tables.MeaningType;
import eki.ekilex.data.db.tables.Morph;
import eki.ekilex.data.db.tables.MorphLabel;
import eki.ekilex.data.db.tables.Paradigm;
import eki.ekilex.data.db.tables.Pos;
import eki.ekilex.data.db.tables.PosLabel;
import eki.ekilex.data.db.tables.Register;
import eki.ekilex.data.db.tables.RegisterLabel;
import eki.ekilex.data.db.tables.Word;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Sequence;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Public extends SchemaImpl {

    private static final long serialVersionUID = -1683732904;

    /**
     * The reference instance of <code>public</code>
     */
    public static final Public PUBLIC = new Public();

    /**
     * The table <code>public.dataset</code>.
     */
    public final Dataset DATASET = eki.ekilex.data.db.tables.Dataset.DATASET;

    /**
     * The table <code>public.definition</code>.
     */
    public final Definition DEFINITION = eki.ekilex.data.db.tables.Definition.DEFINITION;

    /**
     * The table <code>public.definition_dataset</code>.
     */
    public final DefinitionDataset DEFINITION_DATASET = eki.ekilex.data.db.tables.DefinitionDataset.DEFINITION_DATASET;

    /**
     * The table <code>public.definition_freeform</code>.
     */
    public final DefinitionFreeform DEFINITION_FREEFORM = eki.ekilex.data.db.tables.DefinitionFreeform.DEFINITION_FREEFORM;

    /**
     * The table <code>public.deriv</code>.
     */
    public final Deriv DERIV = eki.ekilex.data.db.tables.Deriv.DERIV;

    /**
     * The table <code>public.deriv_label</code>.
     */
    public final DerivLabel DERIV_LABEL = eki.ekilex.data.db.tables.DerivLabel.DERIV_LABEL;

    /**
     * The table <code>public.domain</code>.
     */
    public final Domain DOMAIN = eki.ekilex.data.db.tables.Domain.DOMAIN;

    /**
     * The table <code>public.domain_label</code>.
     */
    public final DomainLabel DOMAIN_LABEL = eki.ekilex.data.db.tables.DomainLabel.DOMAIN_LABEL;

    /**
     * The table <code>public.eki_user</code>.
     */
    public final EkiUser EKI_USER = eki.ekilex.data.db.tables.EkiUser.EKI_USER;

    /**
     * The table <code>public.entry_class</code>.
     */
    public final EntryClass ENTRY_CLASS = eki.ekilex.data.db.tables.EntryClass.ENTRY_CLASS;

    /**
     * The table <code>public.form</code>.
     */
    public final Form FORM = eki.ekilex.data.db.tables.Form.FORM;

    /**
     * The table <code>public.form_rel_type</code>.
     */
    public final FormRelType FORM_REL_TYPE = eki.ekilex.data.db.tables.FormRelType.FORM_REL_TYPE;

    /**
     * The table <code>public.form_rel_type_label</code>.
     */
    public final FormRelTypeLabel FORM_REL_TYPE_LABEL = eki.ekilex.data.db.tables.FormRelTypeLabel.FORM_REL_TYPE_LABEL;

    /**
     * The table <code>public.form_relation</code>.
     */
    public final FormRelation FORM_RELATION = eki.ekilex.data.db.tables.FormRelation.FORM_RELATION;

    /**
     * The table <code>public.freeform</code>.
     */
    public final Freeform FREEFORM = eki.ekilex.data.db.tables.Freeform.FREEFORM;

    /**
     * The table <code>public.gender</code>.
     */
    public final Gender GENDER = eki.ekilex.data.db.tables.Gender.GENDER;

    /**
     * The table <code>public.gender_label</code>.
     */
    public final GenderLabel GENDER_LABEL = eki.ekilex.data.db.tables.GenderLabel.GENDER_LABEL;

    /**
     * The table <code>public.label_type</code>.
     */
    public final LabelType LABEL_TYPE = eki.ekilex.data.db.tables.LabelType.LABEL_TYPE;

    /**
     * The table <code>public.lang</code>.
     */
    public final Lang LANG = eki.ekilex.data.db.tables.Lang.LANG;

    /**
     * The table <code>public.lang_label</code>.
     */
    public final LangLabel LANG_LABEL = eki.ekilex.data.db.tables.LangLabel.LANG_LABEL;

    /**
     * The table <code>public.lex_rel_type</code>.
     */
    public final LexRelType LEX_REL_TYPE = eki.ekilex.data.db.tables.LexRelType.LEX_REL_TYPE;

    /**
     * The table <code>public.lex_rel_type_label</code>.
     */
    public final LexRelTypeLabel LEX_REL_TYPE_LABEL = eki.ekilex.data.db.tables.LexRelTypeLabel.LEX_REL_TYPE_LABEL;

    /**
     * The table <code>public.lex_relation</code>.
     */
    public final LexRelation LEX_RELATION = eki.ekilex.data.db.tables.LexRelation.LEX_RELATION;

    /**
     * The table <code>public.lex_relation_dataset</code>.
     */
    public final LexRelationDataset LEX_RELATION_DATASET = eki.ekilex.data.db.tables.LexRelationDataset.LEX_RELATION_DATASET;

    /**
     * The table <code>public.lexeme</code>.
     */
    public final Lexeme LEXEME = eki.ekilex.data.db.tables.Lexeme.LEXEME;

    /**
     * The table <code>public.lexeme_dataset</code>.
     */
    public final LexemeDataset LEXEME_DATASET = eki.ekilex.data.db.tables.LexemeDataset.LEXEME_DATASET;

    /**
     * The table <code>public.lexeme_deriv</code>.
     */
    public final LexemeDeriv LEXEME_DERIV = eki.ekilex.data.db.tables.LexemeDeriv.LEXEME_DERIV;

    /**
     * The table <code>public.lexeme_freeform</code>.
     */
    public final LexemeFreeform LEXEME_FREEFORM = eki.ekilex.data.db.tables.LexemeFreeform.LEXEME_FREEFORM;

    /**
     * The table <code>public.lexeme_frequency</code>.
     */
    public final LexemeFrequency LEXEME_FREQUENCY = eki.ekilex.data.db.tables.LexemeFrequency.LEXEME_FREQUENCY;

    /**
     * The table <code>public.lexeme_pos</code>.
     */
    public final LexemePos LEXEME_POS = eki.ekilex.data.db.tables.LexemePos.LEXEME_POS;

    /**
     * The table <code>public.lexeme_register</code>.
     */
    public final LexemeRegister LEXEME_REGISTER = eki.ekilex.data.db.tables.LexemeRegister.LEXEME_REGISTER;

    /**
     * The table <code>public.lexeme_type</code>.
     */
    public final LexemeType LEXEME_TYPE = eki.ekilex.data.db.tables.LexemeType.LEXEME_TYPE;

    /**
     * The table <code>public.lexeme_type_label</code>.
     */
    public final LexemeTypeLabel LEXEME_TYPE_LABEL = eki.ekilex.data.db.tables.LexemeTypeLabel.LEXEME_TYPE_LABEL;

    /**
     * The table <code>public.lifecycle_log</code>.
     */
    public final LifecycleLog LIFECYCLE_LOG = eki.ekilex.data.db.tables.LifecycleLog.LIFECYCLE_LOG;

    /**
     * The table <code>public.meaning</code>.
     */
    public final Meaning MEANING = eki.ekilex.data.db.tables.Meaning.MEANING;

    /**
     * The table <code>public.meaning_dataset</code>.
     */
    public final MeaningDataset MEANING_DATASET = eki.ekilex.data.db.tables.MeaningDataset.MEANING_DATASET;

    /**
     * The table <code>public.meaning_domain</code>.
     */
    public final MeaningDomain MEANING_DOMAIN = eki.ekilex.data.db.tables.MeaningDomain.MEANING_DOMAIN;

    /**
     * The table <code>public.meaning_freeform</code>.
     */
    public final MeaningFreeform MEANING_FREEFORM = eki.ekilex.data.db.tables.MeaningFreeform.MEANING_FREEFORM;

    /**
     * The table <code>public.meaning_state</code>.
     */
    public final MeaningState MEANING_STATE = eki.ekilex.data.db.tables.MeaningState.MEANING_STATE;

    /**
     * The table <code>public.meaning_type</code>.
     */
    public final MeaningType MEANING_TYPE = eki.ekilex.data.db.tables.MeaningType.MEANING_TYPE;

    /**
     * The table <code>public.morph</code>.
     */
    public final Morph MORPH = eki.ekilex.data.db.tables.Morph.MORPH;

    /**
     * The table <code>public.morph_label</code>.
     */
    public final MorphLabel MORPH_LABEL = eki.ekilex.data.db.tables.MorphLabel.MORPH_LABEL;

    /**
     * The table <code>public.paradigm</code>.
     */
    public final Paradigm PARADIGM = eki.ekilex.data.db.tables.Paradigm.PARADIGM;

    /**
     * The table <code>public.pos</code>.
     */
    public final Pos POS = eki.ekilex.data.db.tables.Pos.POS;

    /**
     * The table <code>public.pos_label</code>.
     */
    public final PosLabel POS_LABEL = eki.ekilex.data.db.tables.PosLabel.POS_LABEL;

    /**
     * The table <code>public.register</code>.
     */
    public final Register REGISTER = eki.ekilex.data.db.tables.Register.REGISTER;

    /**
     * The table <code>public.register_label</code>.
     */
    public final RegisterLabel REGISTER_LABEL = eki.ekilex.data.db.tables.RegisterLabel.REGISTER_LABEL;

    /**
     * The table <code>public.word</code>.
     */
    public final Word WORD = eki.ekilex.data.db.tables.Word.WORD;

    /**
     * No further instances allowed
     */
    private Public() {
        super("public", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Sequence<?>> getSequences() {
        List result = new ArrayList();
        result.addAll(getSequences0());
        return result;
    }

    private final List<Sequence<?>> getSequences0() {
        return Arrays.<Sequence<?>>asList(
            Sequences.DEFINITION_FREEFORM_ID_SEQ,
            Sequences.DEFINITION_ID_SEQ,
            Sequences.EKI_USER_ID_SEQ,
            Sequences.FORM_ID_SEQ,
            Sequences.FORM_RELATION_ID_SEQ,
            Sequences.FREEFORM_ID_SEQ,
            Sequences.LEX_RELATION_ID_SEQ,
            Sequences.LEXEME_DERIV_ID_SEQ,
            Sequences.LEXEME_FREEFORM_ID_SEQ,
            Sequences.LEXEME_ID_SEQ,
            Sequences.LEXEME_POS_ID_SEQ,
            Sequences.LEXEME_REGISTER_ID_SEQ,
            Sequences.LIFECYCLE_LOG_ID_SEQ,
            Sequences.MEANING_DOMAIN_ID_SEQ,
            Sequences.MEANING_FREEFORM_ID_SEQ,
            Sequences.MEANING_ID_SEQ,
            Sequences.PARADIGM_ID_SEQ,
            Sequences.WORD_ID_SEQ);
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Dataset.DATASET,
            Definition.DEFINITION,
            DefinitionDataset.DEFINITION_DATASET,
            DefinitionFreeform.DEFINITION_FREEFORM,
            Deriv.DERIV,
            DerivLabel.DERIV_LABEL,
            Domain.DOMAIN,
            DomainLabel.DOMAIN_LABEL,
            EkiUser.EKI_USER,
            EntryClass.ENTRY_CLASS,
            Form.FORM,
            FormRelType.FORM_REL_TYPE,
            FormRelTypeLabel.FORM_REL_TYPE_LABEL,
            FormRelation.FORM_RELATION,
            Freeform.FREEFORM,
            Gender.GENDER,
            GenderLabel.GENDER_LABEL,
            LabelType.LABEL_TYPE,
            Lang.LANG,
            LangLabel.LANG_LABEL,
            LexRelType.LEX_REL_TYPE,
            LexRelTypeLabel.LEX_REL_TYPE_LABEL,
            LexRelation.LEX_RELATION,
            LexRelationDataset.LEX_RELATION_DATASET,
            Lexeme.LEXEME,
            LexemeDataset.LEXEME_DATASET,
            LexemeDeriv.LEXEME_DERIV,
            LexemeFreeform.LEXEME_FREEFORM,
            LexemeFrequency.LEXEME_FREQUENCY,
            LexemePos.LEXEME_POS,
            LexemeRegister.LEXEME_REGISTER,
            LexemeType.LEXEME_TYPE,
            LexemeTypeLabel.LEXEME_TYPE_LABEL,
            LifecycleLog.LIFECYCLE_LOG,
            Meaning.MEANING,
            MeaningDataset.MEANING_DATASET,
            MeaningDomain.MEANING_DOMAIN,
            MeaningFreeform.MEANING_FREEFORM,
            MeaningState.MEANING_STATE,
            MeaningType.MEANING_TYPE,
            Morph.MORPH,
            MorphLabel.MORPH_LABEL,
            Paradigm.PARADIGM,
            Pos.POS,
            PosLabel.POS_LABEL,
            Register.REGISTER,
            RegisterLabel.REGISTER_LABEL,
            Word.WORD);
    }
}
