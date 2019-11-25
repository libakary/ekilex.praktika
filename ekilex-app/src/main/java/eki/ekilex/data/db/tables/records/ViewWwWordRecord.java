/*
 * This file is generated by jOOQ.
 */
package eki.ekilex.data.db.tables.records;


import eki.ekilex.data.db.tables.ViewWwWord;
import eki.ekilex.data.db.udt.records.TypeDefinitionRecord;
import eki.ekilex.data.db.udt.records.TypeLangComplexityRecord;
import eki.ekilex.data.db.udt.records.TypeMeaningWordRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record15;
import org.jooq.Row15;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewWwWordRecord extends TableRecordImpl<ViewWwWordRecord> implements Record15<Long, String, String, String, Integer, String[], String, String, String, TypeLangComplexityRecord[], TypeMeaningWordRecord[], TypeDefinitionRecord[], Boolean, Boolean, String[]> {

    private static final long serialVersionUID = 598501847;

    /**
     * Setter for <code>public.view_ww_word.word_id</code>.
     */
    public void setWordId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.view_ww_word.word_id</code>.
     */
    public Long getWordId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.view_ww_word.word</code>.
     */
    public void setWord(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.view_ww_word.word</code>.
     */
    public String getWord() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.view_ww_word.word_class</code>.
     */
    public void setWordClass(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.view_ww_word.word_class</code>.
     */
    public String getWordClass() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.view_ww_word.lang</code>.
     */
    public void setLang(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.view_ww_word.lang</code>.
     */
    public String getLang() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.view_ww_word.homonym_nr</code>.
     */
    public void setHomonymNr(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.view_ww_word.homonym_nr</code>.
     */
    public Integer getHomonymNr() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>public.view_ww_word.word_type_codes</code>.
     */
    public void setWordTypeCodes(String... value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.view_ww_word.word_type_codes</code>.
     */
    public String[] getWordTypeCodes() {
        return (String[]) get(5);
    }

    /**
     * Setter for <code>public.view_ww_word.morph_code</code>.
     */
    public void setMorphCode(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.view_ww_word.morph_code</code>.
     */
    public String getMorphCode() {
        return (String) get(6);
    }

    /**
     * Setter for <code>public.view_ww_word.display_morph_code</code>.
     */
    public void setDisplayMorphCode(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.view_ww_word.display_morph_code</code>.
     */
    public String getDisplayMorphCode() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.view_ww_word.aspect_code</code>.
     */
    public void setAspectCode(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.view_ww_word.aspect_code</code>.
     */
    public String getAspectCode() {
        return (String) get(8);
    }

    /**
     * Setter for <code>public.view_ww_word.lang_complexities</code>.
     */
    public void setLangComplexities(TypeLangComplexityRecord... value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.view_ww_word.lang_complexities</code>.
     */
    public TypeLangComplexityRecord[] getLangComplexities() {
        return (TypeLangComplexityRecord[]) get(9);
    }

    /**
     * Setter for <code>public.view_ww_word.meaning_words</code>.
     */
    public void setMeaningWords(TypeMeaningWordRecord... value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.view_ww_word.meaning_words</code>.
     */
    public TypeMeaningWordRecord[] getMeaningWords() {
        return (TypeMeaningWordRecord[]) get(10);
    }

    /**
     * Setter for <code>public.view_ww_word.definitions</code>.
     */
    public void setDefinitions(TypeDefinitionRecord... value) {
        set(11, value);
    }

    /**
     * Getter for <code>public.view_ww_word.definitions</code>.
     */
    public TypeDefinitionRecord[] getDefinitions() {
        return (TypeDefinitionRecord[]) get(11);
    }

    /**
     * Setter for <code>public.view_ww_word.lex_dataset_exists</code>.
     */
    public void setLexDatasetExists(Boolean value) {
        set(12, value);
    }

    /**
     * Getter for <code>public.view_ww_word.lex_dataset_exists</code>.
     */
    public Boolean getLexDatasetExists() {
        return (Boolean) get(12);
    }

    /**
     * Setter for <code>public.view_ww_word.term_dataset_exists</code>.
     */
    public void setTermDatasetExists(Boolean value) {
        set(13, value);
    }

    /**
     * Getter for <code>public.view_ww_word.term_dataset_exists</code>.
     */
    public Boolean getTermDatasetExists() {
        return (Boolean) get(13);
    }

    /**
     * Setter for <code>public.view_ww_word.od_word_recommendations</code>.
     */
    public void setOdWordRecommendations(String... value) {
        set(14, value);
    }

    /**
     * Getter for <code>public.view_ww_word.od_word_recommendations</code>.
     */
    public String[] getOdWordRecommendations() {
        return (String[]) get(14);
    }

    // -------------------------------------------------------------------------
    // Record15 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<Long, String, String, String, Integer, String[], String, String, String, TypeLangComplexityRecord[], TypeMeaningWordRecord[], TypeDefinitionRecord[], Boolean, Boolean, String[]> fieldsRow() {
        return (Row15) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<Long, String, String, String, Integer, String[], String, String, String, TypeLangComplexityRecord[], TypeMeaningWordRecord[], TypeDefinitionRecord[], Boolean, Boolean, String[]> valuesRow() {
        return (Row15) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return ViewWwWord.VIEW_WW_WORD.WORD_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ViewWwWord.VIEW_WW_WORD.WORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ViewWwWord.VIEW_WW_WORD.WORD_CLASS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ViewWwWord.VIEW_WW_WORD.LANG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return ViewWwWord.VIEW_WW_WORD.HOMONYM_NR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String[]> field6() {
        return ViewWwWord.VIEW_WW_WORD.WORD_TYPE_CODES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return ViewWwWord.VIEW_WW_WORD.MORPH_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return ViewWwWord.VIEW_WW_WORD.DISPLAY_MORPH_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return ViewWwWord.VIEW_WW_WORD.ASPECT_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<TypeLangComplexityRecord[]> field10() {
        return ViewWwWord.VIEW_WW_WORD.LANG_COMPLEXITIES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<TypeMeaningWordRecord[]> field11() {
        return ViewWwWord.VIEW_WW_WORD.MEANING_WORDS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<TypeDefinitionRecord[]> field12() {
        return ViewWwWord.VIEW_WW_WORD.DEFINITIONS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field13() {
        return ViewWwWord.VIEW_WW_WORD.LEX_DATASET_EXISTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field14() {
        return ViewWwWord.VIEW_WW_WORD.TERM_DATASET_EXISTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String[]> field15() {
        return ViewWwWord.VIEW_WW_WORD.OD_WORD_RECOMMENDATIONS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getWordId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getWord();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getWordClass();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getLang();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getHomonymNr();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] component6() {
        return getWordTypeCodes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getMorphCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getDisplayMorphCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getAspectCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeLangComplexityRecord[] component10() {
        return getLangComplexities();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeMeaningWordRecord[] component11() {
        return getMeaningWords();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeDefinitionRecord[] component12() {
        return getDefinitions();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component13() {
        return getLexDatasetExists();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component14() {
        return getTermDatasetExists();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] component15() {
        return getOdWordRecommendations();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getWordId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getWord();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getWordClass();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getLang();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getHomonymNr();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] value6() {
        return getWordTypeCodes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getMorphCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getDisplayMorphCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getAspectCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeLangComplexityRecord[] value10() {
        return getLangComplexities();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeMeaningWordRecord[] value11() {
        return getMeaningWords();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeDefinitionRecord[] value12() {
        return getDefinitions();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value13() {
        return getLexDatasetExists();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value14() {
        return getTermDatasetExists();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] value15() {
        return getOdWordRecommendations();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewWwWordRecord value1(Long value) {
        setWordId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewWwWordRecord value2(String value) {
        setWord(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewWwWordRecord value3(String value) {
        setWordClass(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewWwWordRecord value4(String value) {
        setLang(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewWwWordRecord value5(Integer value) {
        setHomonymNr(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewWwWordRecord value6(String... value) {
        setWordTypeCodes(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewWwWordRecord value7(String value) {
        setMorphCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewWwWordRecord value8(String value) {
        setDisplayMorphCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewWwWordRecord value9(String value) {
        setAspectCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewWwWordRecord value10(TypeLangComplexityRecord... value) {
        setLangComplexities(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewWwWordRecord value11(TypeMeaningWordRecord... value) {
        setMeaningWords(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewWwWordRecord value12(TypeDefinitionRecord... value) {
        setDefinitions(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewWwWordRecord value13(Boolean value) {
        setLexDatasetExists(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewWwWordRecord value14(Boolean value) {
        setTermDatasetExists(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewWwWordRecord value15(String... value) {
        setOdWordRecommendations(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewWwWordRecord values(Long value1, String value2, String value3, String value4, Integer value5, String[] value6, String value7, String value8, String value9, TypeLangComplexityRecord[] value10, TypeMeaningWordRecord[] value11, TypeDefinitionRecord[] value12, Boolean value13, Boolean value14, String[] value15) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ViewWwWordRecord
     */
    public ViewWwWordRecord() {
        super(ViewWwWord.VIEW_WW_WORD);
    }

    /**
     * Create a detached, initialised ViewWwWordRecord
     */
    public ViewWwWordRecord(Long wordId, String word, String wordClass, String lang, Integer homonymNr, String[] wordTypeCodes, String morphCode, String displayMorphCode, String aspectCode, TypeLangComplexityRecord[] langComplexities, TypeMeaningWordRecord[] meaningWords, TypeDefinitionRecord[] definitions, Boolean lexDatasetExists, Boolean termDatasetExists, String[] odWordRecommendations) {
        super(ViewWwWord.VIEW_WW_WORD);

        set(0, wordId);
        set(1, word);
        set(2, wordClass);
        set(3, lang);
        set(4, homonymNr);
        set(5, wordTypeCodes);
        set(6, morphCode);
        set(7, displayMorphCode);
        set(8, aspectCode);
        set(9, langComplexities);
        set(10, meaningWords);
        set(11, definitions);
        set(12, lexDatasetExists);
        set(13, termDatasetExists);
        set(14, odWordRecommendations);
    }
}
