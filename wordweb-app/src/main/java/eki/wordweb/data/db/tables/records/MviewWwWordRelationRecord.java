/*
 * This file is generated by jOOQ.
 */
package eki.wordweb.data.db.tables.records;


import eki.wordweb.data.db.tables.MviewWwWordRelation;

import org.jooq.Field;
import org.jooq.JSON;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MviewWwWordRelationRecord extends TableRecordImpl<MviewWwWordRelationRecord> implements Record3<Long, JSON, JSON> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.mview_ww_word_relation.word_id</code>.
     */
    public void setWordId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.mview_ww_word_relation.word_id</code>.
     */
    public Long getWordId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.mview_ww_word_relation.related_words</code>.
     */
    public void setRelatedWords(JSON value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.mview_ww_word_relation.related_words</code>.
     */
    public JSON getRelatedWords() {
        return (JSON) get(1);
    }

    /**
     * Setter for <code>public.mview_ww_word_relation.word_group_members</code>.
     */
    public void setWordGroupMembers(JSON value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.mview_ww_word_relation.word_group_members</code>.
     */
    public JSON getWordGroupMembers() {
        return (JSON) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Long, JSON, JSON> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Long, JSON, JSON> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return MviewWwWordRelation.MVIEW_WW_WORD_RELATION.WORD_ID;
    }

    @Override
    public Field<JSON> field2() {
        return MviewWwWordRelation.MVIEW_WW_WORD_RELATION.RELATED_WORDS;
    }

    @Override
    public Field<JSON> field3() {
        return MviewWwWordRelation.MVIEW_WW_WORD_RELATION.WORD_GROUP_MEMBERS;
    }

    @Override
    public Long component1() {
        return getWordId();
    }

    @Override
    public JSON component2() {
        return getRelatedWords();
    }

    @Override
    public JSON component3() {
        return getWordGroupMembers();
    }

    @Override
    public Long value1() {
        return getWordId();
    }

    @Override
    public JSON value2() {
        return getRelatedWords();
    }

    @Override
    public JSON value3() {
        return getWordGroupMembers();
    }

    @Override
    public MviewWwWordRelationRecord value1(Long value) {
        setWordId(value);
        return this;
    }

    @Override
    public MviewWwWordRelationRecord value2(JSON value) {
        setRelatedWords(value);
        return this;
    }

    @Override
    public MviewWwWordRelationRecord value3(JSON value) {
        setWordGroupMembers(value);
        return this;
    }

    @Override
    public MviewWwWordRelationRecord values(Long value1, JSON value2, JSON value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MviewWwWordRelationRecord
     */
    public MviewWwWordRelationRecord() {
        super(MviewWwWordRelation.MVIEW_WW_WORD_RELATION);
    }

    /**
     * Create a detached, initialised MviewWwWordRelationRecord
     */
    public MviewWwWordRelationRecord(Long wordId, JSON relatedWords, JSON wordGroupMembers) {
        super(MviewWwWordRelation.MVIEW_WW_WORD_RELATION);

        setWordId(wordId);
        setRelatedWords(relatedWords);
        setWordGroupMembers(wordGroupMembers);
    }
}
