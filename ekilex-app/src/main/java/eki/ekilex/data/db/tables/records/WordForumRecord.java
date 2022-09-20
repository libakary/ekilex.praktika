/*
 * This file is generated by jOOQ.
 */
package eki.ekilex.data.db.tables.records;


import eki.ekilex.data.db.tables.WordForum;

import java.sql.Timestamp;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class WordForumRecord extends UpdatableRecordImpl<WordForumRecord> implements Record10<Long, Long, String, String, Long, String, Timestamp, String, Timestamp, Long> {

    private static final long serialVersionUID = -358164589;

    /**
     * Setter for <code>public.word_forum.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.word_forum.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.word_forum.word_id</code>.
     */
    public void setWordId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.word_forum.word_id</code>.
     */
    public Long getWordId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>public.word_forum.value</code>.
     */
    public void setValue(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.word_forum.value</code>.
     */
    public String getValue() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.word_forum.value_prese</code>.
     */
    public void setValuePrese(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.word_forum.value_prese</code>.
     */
    public String getValuePrese() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.word_forum.creator_id</code>.
     */
    public void setCreatorId(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.word_forum.creator_id</code>.
     */
    public Long getCreatorId() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>public.word_forum.created_by</code>.
     */
    public void setCreatedBy(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.word_forum.created_by</code>.
     */
    public String getCreatedBy() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.word_forum.created_on</code>.
     */
    public void setCreatedOn(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.word_forum.created_on</code>.
     */
    public Timestamp getCreatedOn() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>public.word_forum.modified_by</code>.
     */
    public void setModifiedBy(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.word_forum.modified_by</code>.
     */
    public String getModifiedBy() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.word_forum.modified_on</code>.
     */
    public void setModifiedOn(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.word_forum.modified_on</code>.
     */
    public Timestamp getModifiedOn() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>public.word_forum.order_by</code>.
     */
    public void setOrderBy(Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.word_forum.order_by</code>.
     */
    public Long getOrderBy() {
        return (Long) get(9);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row10<Long, Long, String, String, Long, String, Timestamp, String, Timestamp, Long> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    @Override
    public Row10<Long, Long, String, String, Long, String, Timestamp, String, Timestamp, Long> valuesRow() {
        return (Row10) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return WordForum.WORD_FORUM.ID;
    }

    @Override
    public Field<Long> field2() {
        return WordForum.WORD_FORUM.WORD_ID;
    }

    @Override
    public Field<String> field3() {
        return WordForum.WORD_FORUM.VALUE;
    }

    @Override
    public Field<String> field4() {
        return WordForum.WORD_FORUM.VALUE_PRESE;
    }

    @Override
    public Field<Long> field5() {
        return WordForum.WORD_FORUM.CREATOR_ID;
    }

    @Override
    public Field<String> field6() {
        return WordForum.WORD_FORUM.CREATED_BY;
    }

    @Override
    public Field<Timestamp> field7() {
        return WordForum.WORD_FORUM.CREATED_ON;
    }

    @Override
    public Field<String> field8() {
        return WordForum.WORD_FORUM.MODIFIED_BY;
    }

    @Override
    public Field<Timestamp> field9() {
        return WordForum.WORD_FORUM.MODIFIED_ON;
    }

    @Override
    public Field<Long> field10() {
        return WordForum.WORD_FORUM.ORDER_BY;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public Long component2() {
        return getWordId();
    }

    @Override
    public String component3() {
        return getValue();
    }

    @Override
    public String component4() {
        return getValuePrese();
    }

    @Override
    public Long component5() {
        return getCreatorId();
    }

    @Override
    public String component6() {
        return getCreatedBy();
    }

    @Override
    public Timestamp component7() {
        return getCreatedOn();
    }

    @Override
    public String component8() {
        return getModifiedBy();
    }

    @Override
    public Timestamp component9() {
        return getModifiedOn();
    }

    @Override
    public Long component10() {
        return getOrderBy();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public Long value2() {
        return getWordId();
    }

    @Override
    public String value3() {
        return getValue();
    }

    @Override
    public String value4() {
        return getValuePrese();
    }

    @Override
    public Long value5() {
        return getCreatorId();
    }

    @Override
    public String value6() {
        return getCreatedBy();
    }

    @Override
    public Timestamp value7() {
        return getCreatedOn();
    }

    @Override
    public String value8() {
        return getModifiedBy();
    }

    @Override
    public Timestamp value9() {
        return getModifiedOn();
    }

    @Override
    public Long value10() {
        return getOrderBy();
    }

    @Override
    public WordForumRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public WordForumRecord value2(Long value) {
        setWordId(value);
        return this;
    }

    @Override
    public WordForumRecord value3(String value) {
        setValue(value);
        return this;
    }

    @Override
    public WordForumRecord value4(String value) {
        setValuePrese(value);
        return this;
    }

    @Override
    public WordForumRecord value5(Long value) {
        setCreatorId(value);
        return this;
    }

    @Override
    public WordForumRecord value6(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public WordForumRecord value7(Timestamp value) {
        setCreatedOn(value);
        return this;
    }

    @Override
    public WordForumRecord value8(String value) {
        setModifiedBy(value);
        return this;
    }

    @Override
    public WordForumRecord value9(Timestamp value) {
        setModifiedOn(value);
        return this;
    }

    @Override
    public WordForumRecord value10(Long value) {
        setOrderBy(value);
        return this;
    }

    @Override
    public WordForumRecord values(Long value1, Long value2, String value3, String value4, Long value5, String value6, Timestamp value7, String value8, Timestamp value9, Long value10) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached WordForumRecord
     */
    public WordForumRecord() {
        super(WordForum.WORD_FORUM);
    }

    /**
     * Create a detached, initialised WordForumRecord
     */
    public WordForumRecord(Long id, Long wordId, String value, String valuePrese, Long creatorId, String createdBy, Timestamp createdOn, String modifiedBy, Timestamp modifiedOn, Long orderBy) {
        super(WordForum.WORD_FORUM);

        set(0, id);
        set(1, wordId);
        set(2, value);
        set(3, valuePrese);
        set(4, creatorId);
        set(5, createdBy);
        set(6, createdOn);
        set(7, modifiedBy);
        set(8, modifiedOn);
        set(9, orderBy);
    }
}
