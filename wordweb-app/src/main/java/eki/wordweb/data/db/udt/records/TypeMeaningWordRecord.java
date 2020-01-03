/*
 * This file is generated by jOOQ.
 */
package eki.wordweb.data.db.udt.records;


import eki.wordweb.data.db.udt.TypeMeaningWord;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record13;
import org.jooq.Row13;
import org.jooq.impl.UDTRecordImpl;


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
public class TypeMeaningWordRecord extends UDTRecordImpl<TypeMeaningWordRecord> implements Record13<Long, Long, Long, String, BigDecimal, TypeGovernmentRecord[], String[], Long, String, Integer, String, String[], String> {

    private static final long serialVersionUID = 1857631325;

    /**
     * Setter for <code>public.type_meaning_word.lexeme_id</code>.
     */
    public void setLexemeId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.type_meaning_word.lexeme_id</code>.
     */
    public Long getLexemeId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.type_meaning_word.meaning_id</code>.
     */
    public void setMeaningId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.type_meaning_word.meaning_id</code>.
     */
    public Long getMeaningId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>public.type_meaning_word.mw_lexeme_id</code>.
     */
    public void setMwLexemeId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.type_meaning_word.mw_lexeme_id</code>.
     */
    public Long getMwLexemeId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>public.type_meaning_word.mw_lex_complexity</code>.
     */
    public void setMwLexComplexity(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.type_meaning_word.mw_lex_complexity</code>.
     */
    public String getMwLexComplexity() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.type_meaning_word.mw_lex_weight</code>.
     */
    public void setMwLexWeight(BigDecimal value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.type_meaning_word.mw_lex_weight</code>.
     */
    public BigDecimal getMwLexWeight() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>public.type_meaning_word.mw_lex_governments</code>.
     */
    public void setMwLexGovernments(TypeGovernmentRecord... value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.type_meaning_word.mw_lex_governments</code>.
     */
    public TypeGovernmentRecord[] getMwLexGovernments() {
        return (TypeGovernmentRecord[]) get(5);
    }

    /**
     * Setter for <code>public.type_meaning_word.mw_lex_register_codes</code>.
     */
    public void setMwLexRegisterCodes(String... value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.type_meaning_word.mw_lex_register_codes</code>.
     */
    public String[] getMwLexRegisterCodes() {
        return (String[]) get(6);
    }

    /**
     * Setter for <code>public.type_meaning_word.word_id</code>.
     */
    public void setWordId(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.type_meaning_word.word_id</code>.
     */
    public Long getWordId() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>public.type_meaning_word.word</code>.
     */
    public void setWord(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.type_meaning_word.word</code>.
     */
    public String getWord() {
        return (String) get(8);
    }

    /**
     * Setter for <code>public.type_meaning_word.homonym_nr</code>.
     */
    public void setHomonymNr(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.type_meaning_word.homonym_nr</code>.
     */
    public Integer getHomonymNr() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>public.type_meaning_word.lang</code>.
     */
    public void setLang(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.type_meaning_word.lang</code>.
     */
    public String getLang() {
        return (String) get(10);
    }

    /**
     * Setter for <code>public.type_meaning_word.word_type_codes</code>.
     */
    public void setWordTypeCodes(String... value) {
        set(11, value);
    }

    /**
     * Getter for <code>public.type_meaning_word.word_type_codes</code>.
     */
    public String[] getWordTypeCodes() {
        return (String[]) get(11);
    }

    /**
     * Setter for <code>public.type_meaning_word.aspect_code</code>.
     */
    public void setAspectCode(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>public.type_meaning_word.aspect_code</code>.
     */
    public String getAspectCode() {
        return (String) get(12);
    }

    // -------------------------------------------------------------------------
    // Record13 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Long, Long, Long, String, BigDecimal, TypeGovernmentRecord[], String[], Long, String, Integer, String, String[], String> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Long, Long, Long, String, BigDecimal, TypeGovernmentRecord[], String[], Long, String, Integer, String, String[], String> valuesRow() {
        return (Row13) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return TypeMeaningWord.LEXEME_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return TypeMeaningWord.MEANING_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return TypeMeaningWord.MW_LEXEME_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TypeMeaningWord.MW_LEX_COMPLEXITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field5() {
        return TypeMeaningWord.MW_LEX_WEIGHT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<TypeGovernmentRecord[]> field6() {
        return TypeMeaningWord.MW_LEX_GOVERNMENTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String[]> field7() {
        return TypeMeaningWord.MW_LEX_REGISTER_CODES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field8() {
        return TypeMeaningWord.WORD_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return TypeMeaningWord.WORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return TypeMeaningWord.HOMONYM_NR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return TypeMeaningWord.LANG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String[]> field12() {
        return TypeMeaningWord.WORD_TYPE_CODES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return TypeMeaningWord.ASPECT_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getLexemeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getMeaningId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getMwLexemeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getMwLexComplexity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component5() {
        return getMwLexWeight();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeGovernmentRecord[] component6() {
        return getMwLexGovernments();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] component7() {
        return getMwLexRegisterCodes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component8() {
        return getWordId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getWord();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component10() {
        return getHomonymNr();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getLang();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] component12() {
        return getWordTypeCodes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getAspectCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getLexemeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getMeaningId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getMwLexemeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getMwLexComplexity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value5() {
        return getMwLexWeight();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeGovernmentRecord[] value6() {
        return getMwLexGovernments();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] value7() {
        return getMwLexRegisterCodes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value8() {
        return getWordId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getWord();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getHomonymNr();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getLang();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] value12() {
        return getWordTypeCodes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getAspectCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeMeaningWordRecord value1(Long value) {
        setLexemeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeMeaningWordRecord value2(Long value) {
        setMeaningId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeMeaningWordRecord value3(Long value) {
        setMwLexemeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeMeaningWordRecord value4(String value) {
        setMwLexComplexity(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeMeaningWordRecord value5(BigDecimal value) {
        setMwLexWeight(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeMeaningWordRecord value6(TypeGovernmentRecord... value) {
        setMwLexGovernments(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeMeaningWordRecord value7(String... value) {
        setMwLexRegisterCodes(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeMeaningWordRecord value8(Long value) {
        setWordId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeMeaningWordRecord value9(String value) {
        setWord(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeMeaningWordRecord value10(Integer value) {
        setHomonymNr(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeMeaningWordRecord value11(String value) {
        setLang(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeMeaningWordRecord value12(String... value) {
        setWordTypeCodes(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeMeaningWordRecord value13(String value) {
        setAspectCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeMeaningWordRecord values(Long value1, Long value2, Long value3, String value4, BigDecimal value5, TypeGovernmentRecord[] value6, String[] value7, Long value8, String value9, Integer value10, String value11, String[] value12, String value13) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TypeMeaningWordRecord
     */
    public TypeMeaningWordRecord() {
        super(TypeMeaningWord.TYPE_MEANING_WORD);
    }

    /**
     * Create a detached, initialised TypeMeaningWordRecord
     */
    public TypeMeaningWordRecord(Long lexemeId, Long meaningId, Long mwLexemeId, String mwLexComplexity, BigDecimal mwLexWeight, TypeGovernmentRecord[] mwLexGovernments, String[] mwLexRegisterCodes, Long wordId, String word, Integer homonymNr, String lang, String[] wordTypeCodes, String aspectCode) {
        super(TypeMeaningWord.TYPE_MEANING_WORD);

        set(0, lexemeId);
        set(1, meaningId);
        set(2, mwLexemeId);
        set(3, mwLexComplexity);
        set(4, mwLexWeight);
        set(5, mwLexGovernments);
        set(6, mwLexRegisterCodes);
        set(7, wordId);
        set(8, word);
        set(9, homonymNr);
        set(10, lang);
        set(11, wordTypeCodes);
        set(12, aspectCode);
    }
}
