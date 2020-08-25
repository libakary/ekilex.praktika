/*
 * This file is generated by jOOQ.
 */
package eki.ekilex.data.db.tables.records;


import eki.ekilex.data.db.tables.ViewWwWord;
import eki.ekilex.data.db.udt.records.TypeDefinitionRecord;
import eki.ekilex.data.db.udt.records.TypeLangComplexityRecord;
import eki.ekilex.data.db.udt.records.TypeMeaningWordRecord;

import org.jooq.Field;
import org.jooq.Record18;
import org.jooq.Row18;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewWwWordRecord extends TableRecordImpl<ViewWwWordRecord> implements Record18<Long, String, String, String, String, Long, Integer, String, String[], String, String, String, TypeLangComplexityRecord[], TypeMeaningWordRecord[], TypeDefinitionRecord[], String[], Boolean, Long> {

    private static final long serialVersionUID = -293375555;

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
     * Setter for <code>public.view_ww_word.word_prese</code>.
     */
    public void setWordPrese(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.view_ww_word.word_prese</code>.
     */
    public String getWordPrese() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.view_ww_word.as_word</code>.
     */
    public void setAsWord(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.view_ww_word.as_word</code>.
     */
    public String getAsWord() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.view_ww_word.lang</code>.
     */
    public void setLang(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.view_ww_word.lang</code>.
     */
    public String getLang() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.view_ww_word.lang_order_by</code>.
     */
    public void setLangOrderBy(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.view_ww_word.lang_order_by</code>.
     */
    public Long getLangOrderBy() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>public.view_ww_word.homonym_nr</code>.
     */
    public void setHomonymNr(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.view_ww_word.homonym_nr</code>.
     */
    public Integer getHomonymNr() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>public.view_ww_word.word_class</code>.
     */
    public void setWordClass(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.view_ww_word.word_class</code>.
     */
    public String getWordClass() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.view_ww_word.word_type_codes</code>.
     */
    public void setWordTypeCodes(String[] value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.view_ww_word.word_type_codes</code>.
     */
    public String[] getWordTypeCodes() {
        return (String[]) get(8);
    }

    /**
     * Setter for <code>public.view_ww_word.morph_code</code>.
     */
    public void setMorphCode(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.view_ww_word.morph_code</code>.
     */
    public String getMorphCode() {
        return (String) get(9);
    }

    /**
     * Setter for <code>public.view_ww_word.display_morph_code</code>.
     */
    public void setDisplayMorphCode(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.view_ww_word.display_morph_code</code>.
     */
    public String getDisplayMorphCode() {
        return (String) get(10);
    }

    /**
     * Setter for <code>public.view_ww_word.aspect_code</code>.
     */
    public void setAspectCode(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>public.view_ww_word.aspect_code</code>.
     */
    public String getAspectCode() {
        return (String) get(11);
    }

    /**
     * Setter for <code>public.view_ww_word.lang_complexities</code>.
     */
    public void setLangComplexities(TypeLangComplexityRecord[] value) {
        set(12, value);
    }

    /**
     * Getter for <code>public.view_ww_word.lang_complexities</code>.
     */
    public TypeLangComplexityRecord[] getLangComplexities() {
        return (TypeLangComplexityRecord[]) get(12);
    }

    /**
     * Setter for <code>public.view_ww_word.meaning_words</code>.
     */
    public void setMeaningWords(TypeMeaningWordRecord[] value) {
        set(13, value);
    }

    /**
     * Getter for <code>public.view_ww_word.meaning_words</code>.
     */
    public TypeMeaningWordRecord[] getMeaningWords() {
        return (TypeMeaningWordRecord[]) get(13);
    }

    /**
     * Setter for <code>public.view_ww_word.definitions</code>.
     */
    public void setDefinitions(TypeDefinitionRecord[] value) {
        set(14, value);
    }

    /**
     * Getter for <code>public.view_ww_word.definitions</code>.
     */
    public TypeDefinitionRecord[] getDefinitions() {
        return (TypeDefinitionRecord[]) get(14);
    }

    /**
     * Setter for <code>public.view_ww_word.od_word_recommendations</code>.
     */
    public void setOdWordRecommendations(String[] value) {
        set(15, value);
    }

    /**
     * Getter for <code>public.view_ww_word.od_word_recommendations</code>.
     */
    public String[] getOdWordRecommendations() {
        return (String[]) get(15);
    }

    /**
     * Setter for <code>public.view_ww_word.forms_exist</code>.
     */
    public void setFormsExist(Boolean value) {
        set(16, value);
    }

    /**
     * Getter for <code>public.view_ww_word.forms_exist</code>.
     */
    public Boolean getFormsExist() {
        return (Boolean) get(16);
    }

    /**
     * Setter for <code>public.view_ww_word.min_ds_order_by</code>.
     */
    public void setMinDsOrderBy(Long value) {
        set(17, value);
    }

    /**
     * Getter for <code>public.view_ww_word.min_ds_order_by</code>.
     */
    public Long getMinDsOrderBy() {
        return (Long) get(17);
    }

    // -------------------------------------------------------------------------
    // Record18 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row18<Long, String, String, String, String, Long, Integer, String, String[], String, String, String, TypeLangComplexityRecord[], TypeMeaningWordRecord[], TypeDefinitionRecord[], String[], Boolean, Long> fieldsRow() {
        return (Row18) super.fieldsRow();
    }

    @Override
    public Row18<Long, String, String, String, String, Long, Integer, String, String[], String, String, String, TypeLangComplexityRecord[], TypeMeaningWordRecord[], TypeDefinitionRecord[], String[], Boolean, Long> valuesRow() {
        return (Row18) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return ViewWwWord.VIEW_WW_WORD.WORD_ID;
    }

    @Override
    public Field<String> field2() {
        return ViewWwWord.VIEW_WW_WORD.WORD;
    }

    @Override
    public Field<String> field3() {
        return ViewWwWord.VIEW_WW_WORD.WORD_PRESE;
    }

    @Override
    public Field<String> field4() {
        return ViewWwWord.VIEW_WW_WORD.AS_WORD;
    }

    @Override
    public Field<String> field5() {
        return ViewWwWord.VIEW_WW_WORD.LANG;
    }

    @Override
    public Field<Long> field6() {
        return ViewWwWord.VIEW_WW_WORD.LANG_ORDER_BY;
    }

    @Override
    public Field<Integer> field7() {
        return ViewWwWord.VIEW_WW_WORD.HOMONYM_NR;
    }

    @Override
    public Field<String> field8() {
        return ViewWwWord.VIEW_WW_WORD.WORD_CLASS;
    }

    @Override
    public Field<String[]> field9() {
        return ViewWwWord.VIEW_WW_WORD.WORD_TYPE_CODES;
    }

    @Override
    public Field<String> field10() {
        return ViewWwWord.VIEW_WW_WORD.MORPH_CODE;
    }

    @Override
    public Field<String> field11() {
        return ViewWwWord.VIEW_WW_WORD.DISPLAY_MORPH_CODE;
    }

    @Override
    public Field<String> field12() {
        return ViewWwWord.VIEW_WW_WORD.ASPECT_CODE;
    }

    @Override
    public Field<TypeLangComplexityRecord[]> field13() {
        return ViewWwWord.VIEW_WW_WORD.LANG_COMPLEXITIES;
    }

    @Override
    public Field<TypeMeaningWordRecord[]> field14() {
        return ViewWwWord.VIEW_WW_WORD.MEANING_WORDS;
    }

    @Override
    public Field<TypeDefinitionRecord[]> field15() {
        return ViewWwWord.VIEW_WW_WORD.DEFINITIONS;
    }

    @Override
    public Field<String[]> field16() {
        return ViewWwWord.VIEW_WW_WORD.OD_WORD_RECOMMENDATIONS;
    }

    @Override
    public Field<Boolean> field17() {
        return ViewWwWord.VIEW_WW_WORD.FORMS_EXIST;
    }

    @Override
    public Field<Long> field18() {
        return ViewWwWord.VIEW_WW_WORD.MIN_DS_ORDER_BY;
    }

    @Override
    public Long component1() {
        return getWordId();
    }

    @Override
    public String component2() {
        return getWord();
    }

    @Override
    public String component3() {
        return getWordPrese();
    }

    @Override
    public String component4() {
        return getAsWord();
    }

    @Override
    public String component5() {
        return getLang();
    }

    @Override
    public Long component6() {
        return getLangOrderBy();
    }

    @Override
    public Integer component7() {
        return getHomonymNr();
    }

    @Override
    public String component8() {
        return getWordClass();
    }

    @Override
    public String[] component9() {
        return getWordTypeCodes();
    }

    @Override
    public String component10() {
        return getMorphCode();
    }

    @Override
    public String component11() {
        return getDisplayMorphCode();
    }

    @Override
    public String component12() {
        return getAspectCode();
    }

    @Override
    public TypeLangComplexityRecord[] component13() {
        return getLangComplexities();
    }

    @Override
    public TypeMeaningWordRecord[] component14() {
        return getMeaningWords();
    }

    @Override
    public TypeDefinitionRecord[] component15() {
        return getDefinitions();
    }

    @Override
    public String[] component16() {
        return getOdWordRecommendations();
    }

    @Override
    public Boolean component17() {
        return getFormsExist();
    }

    @Override
    public Long component18() {
        return getMinDsOrderBy();
    }

    @Override
    public Long value1() {
        return getWordId();
    }

    @Override
    public String value2() {
        return getWord();
    }

    @Override
    public String value3() {
        return getWordPrese();
    }

    @Override
    public String value4() {
        return getAsWord();
    }

    @Override
    public String value5() {
        return getLang();
    }

    @Override
    public Long value6() {
        return getLangOrderBy();
    }

    @Override
    public Integer value7() {
        return getHomonymNr();
    }

    @Override
    public String value8() {
        return getWordClass();
    }

    @Override
    public String[] value9() {
        return getWordTypeCodes();
    }

    @Override
    public String value10() {
        return getMorphCode();
    }

    @Override
    public String value11() {
        return getDisplayMorphCode();
    }

    @Override
    public String value12() {
        return getAspectCode();
    }

    @Override
    public TypeLangComplexityRecord[] value13() {
        return getLangComplexities();
    }

    @Override
    public TypeMeaningWordRecord[] value14() {
        return getMeaningWords();
    }

    @Override
    public TypeDefinitionRecord[] value15() {
        return getDefinitions();
    }

    @Override
    public String[] value16() {
        return getOdWordRecommendations();
    }

    @Override
    public Boolean value17() {
        return getFormsExist();
    }

    @Override
    public Long value18() {
        return getMinDsOrderBy();
    }

    @Override
    public ViewWwWordRecord value1(Long value) {
        setWordId(value);
        return this;
    }

    @Override
    public ViewWwWordRecord value2(String value) {
        setWord(value);
        return this;
    }

    @Override
    public ViewWwWordRecord value3(String value) {
        setWordPrese(value);
        return this;
    }

    @Override
    public ViewWwWordRecord value4(String value) {
        setAsWord(value);
        return this;
    }

    @Override
    public ViewWwWordRecord value5(String value) {
        setLang(value);
        return this;
    }

    @Override
    public ViewWwWordRecord value6(Long value) {
        setLangOrderBy(value);
        return this;
    }

    @Override
    public ViewWwWordRecord value7(Integer value) {
        setHomonymNr(value);
        return this;
    }

    @Override
    public ViewWwWordRecord value8(String value) {
        setWordClass(value);
        return this;
    }

    @Override
    public ViewWwWordRecord value9(String[] value) {
        setWordTypeCodes(value);
        return this;
    }

    @Override
    public ViewWwWordRecord value10(String value) {
        setMorphCode(value);
        return this;
    }

    @Override
    public ViewWwWordRecord value11(String value) {
        setDisplayMorphCode(value);
        return this;
    }

    @Override
    public ViewWwWordRecord value12(String value) {
        setAspectCode(value);
        return this;
    }

    @Override
    public ViewWwWordRecord value13(TypeLangComplexityRecord[] value) {
        setLangComplexities(value);
        return this;
    }

    @Override
    public ViewWwWordRecord value14(TypeMeaningWordRecord[] value) {
        setMeaningWords(value);
        return this;
    }

    @Override
    public ViewWwWordRecord value15(TypeDefinitionRecord[] value) {
        setDefinitions(value);
        return this;
    }

    @Override
    public ViewWwWordRecord value16(String[] value) {
        setOdWordRecommendations(value);
        return this;
    }

    @Override
    public ViewWwWordRecord value17(Boolean value) {
        setFormsExist(value);
        return this;
    }

    @Override
    public ViewWwWordRecord value18(Long value) {
        setMinDsOrderBy(value);
        return this;
    }

    @Override
    public ViewWwWordRecord values(Long value1, String value2, String value3, String value4, String value5, Long value6, Integer value7, String value8, String[] value9, String value10, String value11, String value12, TypeLangComplexityRecord[] value13, TypeMeaningWordRecord[] value14, TypeDefinitionRecord[] value15, String[] value16, Boolean value17, Long value18) {
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
        value16(value16);
        value17(value17);
        value18(value18);
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
    public ViewWwWordRecord(Long wordId, String word, String wordPrese, String asWord, String lang, Long langOrderBy, Integer homonymNr, String wordClass, String[] wordTypeCodes, String morphCode, String displayMorphCode, String aspectCode, TypeLangComplexityRecord[] langComplexities, TypeMeaningWordRecord[] meaningWords, TypeDefinitionRecord[] definitions, String[] odWordRecommendations, Boolean formsExist, Long minDsOrderBy) {
        super(ViewWwWord.VIEW_WW_WORD);

        set(0, wordId);
        set(1, word);
        set(2, wordPrese);
        set(3, asWord);
        set(4, lang);
        set(5, langOrderBy);
        set(6, homonymNr);
        set(7, wordClass);
        set(8, wordTypeCodes);
        set(9, morphCode);
        set(10, displayMorphCode);
        set(11, aspectCode);
        set(12, langComplexities);
        set(13, meaningWords);
        set(14, definitions);
        set(15, odWordRecommendations);
        set(16, formsExist);
        set(17, minDsOrderBy);
    }
}
