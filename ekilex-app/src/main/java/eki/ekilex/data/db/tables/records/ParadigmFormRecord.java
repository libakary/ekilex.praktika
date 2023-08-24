/*
 * This file is generated by jOOQ.
 */
package eki.ekilex.data.db.tables.records;


import eki.ekilex.data.db.tables.ParadigmForm;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ParadigmFormRecord extends UpdatableRecordImpl<ParadigmFormRecord> implements Record4<Long, Long, Long, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.paradigm_form.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.paradigm_form.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.paradigm_form.paradigm_id</code>.
     */
    public void setParadigmId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.paradigm_form.paradigm_id</code>.
     */
    public Long getParadigmId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>public.paradigm_form.form_id</code>.
     */
    public void setFormId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.paradigm_form.form_id</code>.
     */
    public Long getFormId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>public.paradigm_form.order_by</code>.
     */
    public void setOrderBy(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.paradigm_form.order_by</code>.
     */
    public Long getOrderBy() {
        return (Long) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Long, Long, Long, Long> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Long, Long, Long, Long> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return ParadigmForm.PARADIGM_FORM.ID;
    }

    @Override
    public Field<Long> field2() {
        return ParadigmForm.PARADIGM_FORM.PARADIGM_ID;
    }

    @Override
    public Field<Long> field3() {
        return ParadigmForm.PARADIGM_FORM.FORM_ID;
    }

    @Override
    public Field<Long> field4() {
        return ParadigmForm.PARADIGM_FORM.ORDER_BY;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public Long component2() {
        return getParadigmId();
    }

    @Override
    public Long component3() {
        return getFormId();
    }

    @Override
    public Long component4() {
        return getOrderBy();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public Long value2() {
        return getParadigmId();
    }

    @Override
    public Long value3() {
        return getFormId();
    }

    @Override
    public Long value4() {
        return getOrderBy();
    }

    @Override
    public ParadigmFormRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public ParadigmFormRecord value2(Long value) {
        setParadigmId(value);
        return this;
    }

    @Override
    public ParadigmFormRecord value3(Long value) {
        setFormId(value);
        return this;
    }

    @Override
    public ParadigmFormRecord value4(Long value) {
        setOrderBy(value);
        return this;
    }

    @Override
    public ParadigmFormRecord values(Long value1, Long value2, Long value3, Long value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ParadigmFormRecord
     */
    public ParadigmFormRecord() {
        super(ParadigmForm.PARADIGM_FORM);
    }

    /**
     * Create a detached, initialised ParadigmFormRecord
     */
    public ParadigmFormRecord(Long id, Long paradigmId, Long formId, Long orderBy) {
        super(ParadigmForm.PARADIGM_FORM);

        setId(id);
        setParadigmId(paradigmId);
        setFormId(formId);
        setOrderBy(orderBy);
    }
}
