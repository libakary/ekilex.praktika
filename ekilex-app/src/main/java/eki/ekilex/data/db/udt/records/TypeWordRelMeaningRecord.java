/*
 * This file is generated by jOOQ.
 */
package eki.ekilex.data.db.udt.records;


import eki.ekilex.data.db.udt.TypeWordRelMeaning;

import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UDTRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TypeWordRelMeaningRecord extends UDTRecordImpl<TypeWordRelMeaningRecord> implements Record6<Long, Long, String[], String[], String[], String[]> {

    private static final long serialVersionUID = 1074243244;

    /**
     * Setter for <code>public.type_word_rel_meaning.meaning_id</code>.
     */
    public void setMeaningId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.type_word_rel_meaning.meaning_id</code>.
     */
    public Long getMeaningId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.type_word_rel_meaning.lexeme_id</code>.
     */
    public void setLexemeId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.type_word_rel_meaning.lexeme_id</code>.
     */
    public Long getLexemeId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>public.type_word_rel_meaning.definition_values</code>.
     */
    public void setDefinitionValues(String[] value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.type_word_rel_meaning.definition_values</code>.
     */
    public String[] getDefinitionValues() {
        return (String[]) get(2);
    }

    /**
     * Setter for <code>public.type_word_rel_meaning.usage_values</code>.
     */
    public void setUsageValues(String[] value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.type_word_rel_meaning.usage_values</code>.
     */
    public String[] getUsageValues() {
        return (String[]) get(3);
    }

    /**
     * Setter for <code>public.type_word_rel_meaning.lex_register_codes</code>.
     */
    public void setLexRegisterCodes(String[] value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.type_word_rel_meaning.lex_register_codes</code>.
     */
    public String[] getLexRegisterCodes() {
        return (String[]) get(4);
    }

    /**
     * Setter for <code>public.type_word_rel_meaning.lex_pos_codes</code>.
     */
    public void setLexPosCodes(String[] value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.type_word_rel_meaning.lex_pos_codes</code>.
     */
    public String[] getLexPosCodes() {
        return (String[]) get(5);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<Long, Long, String[], String[], String[], String[]> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<Long, Long, String[], String[], String[], String[]> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return TypeWordRelMeaning.MEANING_ID;
    }

    @Override
    public Field<Long> field2() {
        return TypeWordRelMeaning.LEXEME_ID;
    }

    @Override
    public Field<String[]> field3() {
        return TypeWordRelMeaning.DEFINITION_VALUES;
    }

    @Override
    public Field<String[]> field4() {
        return TypeWordRelMeaning.USAGE_VALUES;
    }

    @Override
    public Field<String[]> field5() {
        return TypeWordRelMeaning.LEX_REGISTER_CODES;
    }

    @Override
    public Field<String[]> field6() {
        return TypeWordRelMeaning.LEX_POS_CODES;
    }

    @Override
    public Long component1() {
        return getMeaningId();
    }

    @Override
    public Long component2() {
        return getLexemeId();
    }

    @Override
    public String[] component3() {
        return getDefinitionValues();
    }

    @Override
    public String[] component4() {
        return getUsageValues();
    }

    @Override
    public String[] component5() {
        return getLexRegisterCodes();
    }

    @Override
    public String[] component6() {
        return getLexPosCodes();
    }

    @Override
    public Long value1() {
        return getMeaningId();
    }

    @Override
    public Long value2() {
        return getLexemeId();
    }

    @Override
    public String[] value3() {
        return getDefinitionValues();
    }

    @Override
    public String[] value4() {
        return getUsageValues();
    }

    @Override
    public String[] value5() {
        return getLexRegisterCodes();
    }

    @Override
    public String[] value6() {
        return getLexPosCodes();
    }

    @Override
    public TypeWordRelMeaningRecord value1(Long value) {
        setMeaningId(value);
        return this;
    }

    @Override
    public TypeWordRelMeaningRecord value2(Long value) {
        setLexemeId(value);
        return this;
    }

    @Override
    public TypeWordRelMeaningRecord value3(String[] value) {
        setDefinitionValues(value);
        return this;
    }

    @Override
    public TypeWordRelMeaningRecord value4(String[] value) {
        setUsageValues(value);
        return this;
    }

    @Override
    public TypeWordRelMeaningRecord value5(String[] value) {
        setLexRegisterCodes(value);
        return this;
    }

    @Override
    public TypeWordRelMeaningRecord value6(String[] value) {
        setLexPosCodes(value);
        return this;
    }

    @Override
    public TypeWordRelMeaningRecord values(Long value1, Long value2, String[] value3, String[] value4, String[] value5, String[] value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TypeWordRelMeaningRecord
     */
    public TypeWordRelMeaningRecord() {
        super(TypeWordRelMeaning.TYPE_WORD_REL_MEANING);
    }

    /**
     * Create a detached, initialised TypeWordRelMeaningRecord
     */
    public TypeWordRelMeaningRecord(Long meaningId, Long lexemeId, String[] definitionValues, String[] usageValues, String[] lexRegisterCodes, String[] lexPosCodes) {
        super(TypeWordRelMeaning.TYPE_WORD_REL_MEANING);

        set(0, meaningId);
        set(1, lexemeId);
        set(2, definitionValues);
        set(3, usageValues);
        set(4, lexRegisterCodes);
        set(5, lexPosCodes);
    }
}
