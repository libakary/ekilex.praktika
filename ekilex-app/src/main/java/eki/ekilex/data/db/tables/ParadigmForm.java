/*
 * This file is generated by jOOQ.
 */
package eki.ekilex.data.db.tables;


import eki.ekilex.data.db.Keys;
import eki.ekilex.data.db.Public;
import eki.ekilex.data.db.tables.records.ParadigmFormRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ParadigmForm extends TableImpl<ParadigmFormRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.paradigm_form</code>
     */
    public static final ParadigmForm PARADIGM_FORM = new ParadigmForm();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ParadigmFormRecord> getRecordType() {
        return ParadigmFormRecord.class;
    }

    /**
     * The column <code>public.paradigm_form.id</code>.
     */
    public final TableField<ParadigmFormRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.paradigm_form.paradigm_id</code>.
     */
    public final TableField<ParadigmFormRecord, Long> PARADIGM_ID = createField(DSL.name("paradigm_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.paradigm_form.form_id</code>.
     */
    public final TableField<ParadigmFormRecord, Long> FORM_ID = createField(DSL.name("form_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.paradigm_form.order_by</code>.
     */
    public final TableField<ParadigmFormRecord, Long> ORDER_BY = createField(DSL.name("order_by"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    private ParadigmForm(Name alias, Table<ParadigmFormRecord> aliased) {
        this(alias, aliased, null);
    }

    private ParadigmForm(Name alias, Table<ParadigmFormRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.paradigm_form</code> table reference
     */
    public ParadigmForm(String alias) {
        this(DSL.name(alias), PARADIGM_FORM);
    }

    /**
     * Create an aliased <code>public.paradigm_form</code> table reference
     */
    public ParadigmForm(Name alias) {
        this(alias, PARADIGM_FORM);
    }

    /**
     * Create a <code>public.paradigm_form</code> table reference
     */
    public ParadigmForm() {
        this(DSL.name("paradigm_form"), null);
    }

    public <O extends Record> ParadigmForm(Table<O> child, ForeignKey<O, ParadigmFormRecord> key) {
        super(child, key, PARADIGM_FORM);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public Identity<ParadigmFormRecord, Long> getIdentity() {
        return (Identity<ParadigmFormRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<ParadigmFormRecord> getPrimaryKey() {
        return Keys.PARADIGM_FORM_PKEY;
    }

    @Override
    public List<UniqueKey<ParadigmFormRecord>> getKeys() {
        return Arrays.<UniqueKey<ParadigmFormRecord>>asList(Keys.PARADIGM_FORM_PKEY);
    }

    @Override
    public List<ForeignKey<ParadigmFormRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ParadigmFormRecord, ?>>asList(Keys.PARADIGM_FORM__PARADIGM_FORM_PARADIGM_ID_FKEY, Keys.PARADIGM_FORM__PARADIGM_FORM_FORM_ID_FKEY);
    }

    private transient Paradigm _paradigm;
    private transient Form _form;

    public Paradigm paradigm() {
        if (_paradigm == null)
            _paradigm = new Paradigm(this, Keys.PARADIGM_FORM__PARADIGM_FORM_PARADIGM_ID_FKEY);

        return _paradigm;
    }

    public Form form() {
        if (_form == null)
            _form = new Form(this, Keys.PARADIGM_FORM__PARADIGM_FORM_FORM_ID_FKEY);

        return _form;
    }

    @Override
    public ParadigmForm as(String alias) {
        return new ParadigmForm(DSL.name(alias), this);
    }

    @Override
    public ParadigmForm as(Name alias) {
        return new ParadigmForm(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ParadigmForm rename(String name) {
        return new ParadigmForm(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ParadigmForm rename(Name name) {
        return new ParadigmForm(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Long, Long, Long, Long> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}