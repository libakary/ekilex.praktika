/*
 * This file is generated by jOOQ.
 */
package eki.ekilex.data.db.tables.records;


import eki.ekilex.data.db.tables.Meaning;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MeaningRecord extends UpdatableRecordImpl<MeaningRecord> implements Record6<Long, Timestamp, String, Timestamp, String, String> {

    private static final long serialVersionUID = -1536156171;

    /**
     * Setter for <code>public.meaning.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.meaning.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.meaning.created_on</code>.
     */
    public void setCreatedOn(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.meaning.created_on</code>.
     */
    public Timestamp getCreatedOn() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>public.meaning.created_by</code>.
     */
    public void setCreatedBy(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.meaning.created_by</code>.
     */
    public String getCreatedBy() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.meaning.modified_on</code>.
     */
    public void setModifiedOn(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.meaning.modified_on</code>.
     */
    public Timestamp getModifiedOn() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>public.meaning.modified_by</code>.
     */
    public void setModifiedBy(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.meaning.modified_by</code>.
     */
    public String getModifiedBy() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.meaning.process_state_code</code>.
     */
    public void setProcessStateCode(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.meaning.process_state_code</code>.
     */
    public String getProcessStateCode() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Long, Timestamp, String, Timestamp, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Long, Timestamp, String, Timestamp, String, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Meaning.MEANING.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return Meaning.MEANING.CREATED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Meaning.MEANING.CREATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return Meaning.MEANING.MODIFIED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Meaning.MEANING.MODIFIED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Meaning.MEANING.PROCESS_STATE_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component2() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getCreatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
        return getModifiedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getModifiedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getProcessStateCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value2() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getCreatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getModifiedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getModifiedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getProcessStateCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MeaningRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MeaningRecord value2(Timestamp value) {
        setCreatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MeaningRecord value3(String value) {
        setCreatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MeaningRecord value4(Timestamp value) {
        setModifiedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MeaningRecord value5(String value) {
        setModifiedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MeaningRecord value6(String value) {
        setProcessStateCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MeaningRecord values(Long value1, Timestamp value2, String value3, Timestamp value4, String value5, String value6) {
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
     * Create a detached MeaningRecord
     */
    public MeaningRecord() {
        super(Meaning.MEANING);
    }

    /**
     * Create a detached, initialised MeaningRecord
     */
    public MeaningRecord(Long id, Timestamp createdOn, String createdBy, Timestamp modifiedOn, String modifiedBy, String processStateCode) {
        super(Meaning.MEANING);

        set(0, id);
        set(1, createdOn);
        set(2, createdBy);
        set(3, modifiedOn);
        set(4, modifiedBy);
        set(5, processStateCode);
    }
}
