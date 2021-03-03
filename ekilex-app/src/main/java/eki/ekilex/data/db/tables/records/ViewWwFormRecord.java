/*
 * This file is generated by jOOQ.
 */
package eki.ekilex.data.db.tables.records;


import eki.ekilex.data.db.tables.ViewWwForm;

import java.math.BigDecimal;

import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewWwFormRecord extends TableRecordImpl<ViewWwFormRecord> {

    private static final long serialVersionUID = 1480479056;

    /**
     * Setter for <code>public.view_ww_form.word_id</code>.
     */
    public void setWordId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.view_ww_form.word_id</code>.
     */
    public Long getWordId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.view_ww_form.word_class</code>.
     */
    public void setWordClass(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.view_ww_form.word_class</code>.
     */
    public String getWordClass() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.view_ww_form.word</code>.
     */
    public void setWord(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.view_ww_form.word</code>.
     */
    public String getWord() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.view_ww_form.lang</code>.
     */
    public void setLang(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.view_ww_form.lang</code>.
     */
    public String getLang() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.view_ww_form.paradigm_id</code>.
     */
    public void setParadigmId(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.view_ww_form.paradigm_id</code>.
     */
    public Long getParadigmId() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>public.view_ww_form.paradigm_comment</code>.
     */
    public void setParadigmComment(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.view_ww_form.paradigm_comment</code>.
     */
    public String getParadigmComment() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.view_ww_form.inflection_type</code>.
     */
    public void setInflectionType(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.view_ww_form.inflection_type</code>.
     */
    public String getInflectionType() {
        return (String) get(6);
    }

    /**
     * Setter for <code>public.view_ww_form.form_id</code>.
     */
    public void setFormId(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.view_ww_form.form_id</code>.
     */
    public Long getFormId() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>public.view_ww_form.mode</code>.
     */
    public void setMode(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.view_ww_form.mode</code>.
     */
    public String getMode() {
        return (String) get(8);
    }

    /**
     * Setter for <code>public.view_ww_form.morph_group1</code>.
     */
    public void setMorphGroup1(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.view_ww_form.morph_group1</code>.
     */
    public String getMorphGroup1() {
        return (String) get(9);
    }

    /**
     * Setter for <code>public.view_ww_form.morph_group2</code>.
     */
    public void setMorphGroup2(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.view_ww_form.morph_group2</code>.
     */
    public String getMorphGroup2() {
        return (String) get(10);
    }

    /**
     * Setter for <code>public.view_ww_form.morph_group3</code>.
     */
    public void setMorphGroup3(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>public.view_ww_form.morph_group3</code>.
     */
    public String getMorphGroup3() {
        return (String) get(11);
    }

    /**
     * Setter for <code>public.view_ww_form.display_level</code>.
     */
    public void setDisplayLevel(Integer value) {
        set(12, value);
    }

    /**
     * Getter for <code>public.view_ww_form.display_level</code>.
     */
    public Integer getDisplayLevel() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>public.view_ww_form.morph_code</code>.
     */
    public void setMorphCode(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>public.view_ww_form.morph_code</code>.
     */
    public String getMorphCode() {
        return (String) get(13);
    }

    /**
     * Setter for <code>public.view_ww_form.morph_exists</code>.
     */
    public void setMorphExists(Boolean value) {
        set(14, value);
    }

    /**
     * Getter for <code>public.view_ww_form.morph_exists</code>.
     */
    public Boolean getMorphExists() {
        return (Boolean) get(14);
    }

    /**
     * Setter for <code>public.view_ww_form.is_questionable</code>.
     */
    public void setIsQuestionable(Boolean value) {
        set(15, value);
    }

    /**
     * Getter for <code>public.view_ww_form.is_questionable</code>.
     */
    public Boolean getIsQuestionable() {
        return (Boolean) get(15);
    }

    /**
     * Setter for <code>public.view_ww_form.value</code>.
     */
    public void setValue(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>public.view_ww_form.value</code>.
     */
    public String getValue() {
        return (String) get(16);
    }

    /**
     * Setter for <code>public.view_ww_form.value_prese</code>.
     */
    public void setValuePrese(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>public.view_ww_form.value_prese</code>.
     */
    public String getValuePrese() {
        return (String) get(17);
    }

    /**
     * Setter for <code>public.view_ww_form.components</code>.
     */
    public void setComponents(String[] value) {
        set(18, value);
    }

    /**
     * Getter for <code>public.view_ww_form.components</code>.
     */
    public String[] getComponents() {
        return (String[]) get(18);
    }

    /**
     * Setter for <code>public.view_ww_form.display_form</code>.
     */
    public void setDisplayForm(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>public.view_ww_form.display_form</code>.
     */
    public String getDisplayForm() {
        return (String) get(19);
    }

    /**
     * Setter for <code>public.view_ww_form.audio_file</code>.
     */
    public void setAudioFile(String value) {
        set(20, value);
    }

    /**
     * Getter for <code>public.view_ww_form.audio_file</code>.
     */
    public String getAudioFile() {
        return (String) get(20);
    }

    /**
     * Setter for <code>public.view_ww_form.order_by</code>.
     */
    public void setOrderBy(Long value) {
        set(21, value);
    }

    /**
     * Getter for <code>public.view_ww_form.order_by</code>.
     */
    public Long getOrderBy() {
        return (Long) get(21);
    }

    /**
     * Setter for <code>public.view_ww_form.form_freq_value</code>.
     */
    public void setFormFreqValue(BigDecimal value) {
        set(22, value);
    }

    /**
     * Getter for <code>public.view_ww_form.form_freq_value</code>.
     */
    public BigDecimal getFormFreqValue() {
        return (BigDecimal) get(22);
    }

    /**
     * Setter for <code>public.view_ww_form.form_freq_rank</code>.
     */
    public void setFormFreqRank(Long value) {
        set(23, value);
    }

    /**
     * Getter for <code>public.view_ww_form.form_freq_rank</code>.
     */
    public Long getFormFreqRank() {
        return (Long) get(23);
    }

    /**
     * Setter for <code>public.view_ww_form.form_freq_rank_max</code>.
     */
    public void setFormFreqRankMax(Long value) {
        set(24, value);
    }

    /**
     * Getter for <code>public.view_ww_form.form_freq_rank_max</code>.
     */
    public Long getFormFreqRankMax() {
        return (Long) get(24);
    }

    /**
     * Setter for <code>public.view_ww_form.morph_freq_value</code>.
     */
    public void setMorphFreqValue(BigDecimal value) {
        set(25, value);
    }

    /**
     * Getter for <code>public.view_ww_form.morph_freq_value</code>.
     */
    public BigDecimal getMorphFreqValue() {
        return (BigDecimal) get(25);
    }

    /**
     * Setter for <code>public.view_ww_form.morph_freq_rank</code>.
     */
    public void setMorphFreqRank(Long value) {
        set(26, value);
    }

    /**
     * Getter for <code>public.view_ww_form.morph_freq_rank</code>.
     */
    public Long getMorphFreqRank() {
        return (Long) get(26);
    }

    /**
     * Setter for <code>public.view_ww_form.morph_freq_rank_max</code>.
     */
    public void setMorphFreqRankMax(Long value) {
        set(27, value);
    }

    /**
     * Getter for <code>public.view_ww_form.morph_freq_rank_max</code>.
     */
    public Long getMorphFreqRankMax() {
        return (Long) get(27);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ViewWwFormRecord
     */
    public ViewWwFormRecord() {
        super(ViewWwForm.VIEW_WW_FORM);
    }

    /**
     * Create a detached, initialised ViewWwFormRecord
     */
    public ViewWwFormRecord(Long wordId, String wordClass, String word, String lang, Long paradigmId, String paradigmComment, String inflectionType, Long formId, String mode, String morphGroup1, String morphGroup2, String morphGroup3, Integer displayLevel, String morphCode, Boolean morphExists, Boolean isQuestionable, String value, String valuePrese, String[] components, String displayForm, String audioFile, Long orderBy, BigDecimal formFreqValue, Long formFreqRank, Long formFreqRankMax, BigDecimal morphFreqValue, Long morphFreqRank, Long morphFreqRankMax) {
        super(ViewWwForm.VIEW_WW_FORM);

        set(0, wordId);
        set(1, wordClass);
        set(2, word);
        set(3, lang);
        set(4, paradigmId);
        set(5, paradigmComment);
        set(6, inflectionType);
        set(7, formId);
        set(8, mode);
        set(9, morphGroup1);
        set(10, morphGroup2);
        set(11, morphGroup3);
        set(12, displayLevel);
        set(13, morphCode);
        set(14, morphExists);
        set(15, isQuestionable);
        set(16, value);
        set(17, valuePrese);
        set(18, components);
        set(19, displayForm);
        set(20, audioFile);
        set(21, orderBy);
        set(22, formFreqValue);
        set(23, formFreqRank);
        set(24, formFreqRankMax);
        set(25, morphFreqValue);
        set(26, morphFreqRank);
        set(27, morphFreqRankMax);
    }
}
