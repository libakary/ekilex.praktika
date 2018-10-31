/*
 * This file is generated by jOOQ.
 */
package eki.ekilex.data.db.tables;


import eki.ekilex.data.db.Indexes;
import eki.ekilex.data.db.Keys;
import eki.ekilex.data.db.Public;
import eki.ekilex.data.db.tables.records.FormRelTypeLabelRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class FormRelTypeLabel extends TableImpl<FormRelTypeLabelRecord> {

    private static final long serialVersionUID = 956847663;

    /**
     * The reference instance of <code>public.form_rel_type_label</code>
     */
    public static final FormRelTypeLabel FORM_REL_TYPE_LABEL = new FormRelTypeLabel();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FormRelTypeLabelRecord> getRecordType() {
        return FormRelTypeLabelRecord.class;
    }

    /**
     * The column <code>public.form_rel_type_label.code</code>.
     */
    public final TableField<FormRelTypeLabelRecord, String> CODE = createField("code", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>public.form_rel_type_label.value</code>.
     */
    public final TableField<FormRelTypeLabelRecord, String> VALUE = createField("value", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.form_rel_type_label.lang</code>.
     */
    public final TableField<FormRelTypeLabelRecord, String> LANG = createField("lang", org.jooq.impl.SQLDataType.CHAR(3).nullable(false), this, "");

    /**
     * The column <code>public.form_rel_type_label.type</code>.
     */
    public final TableField<FormRelTypeLabelRecord, String> TYPE = createField("type", org.jooq.impl.SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * Create a <code>public.form_rel_type_label</code> table reference
     */
    public FormRelTypeLabel() {
        this(DSL.name("form_rel_type_label"), null);
    }

    /**
     * Create an aliased <code>public.form_rel_type_label</code> table reference
     */
    public FormRelTypeLabel(String alias) {
        this(DSL.name(alias), FORM_REL_TYPE_LABEL);
    }

    /**
     * Create an aliased <code>public.form_rel_type_label</code> table reference
     */
    public FormRelTypeLabel(Name alias) {
        this(alias, FORM_REL_TYPE_LABEL);
    }

    private FormRelTypeLabel(Name alias, Table<FormRelTypeLabelRecord> aliased) {
        this(alias, aliased, null);
    }

    private FormRelTypeLabel(Name alias, Table<FormRelTypeLabelRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> FormRelTypeLabel(Table<O> child, ForeignKey<O, FormRelTypeLabelRecord> key) {
        super(child, key, FORM_REL_TYPE_LABEL);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.FORM_REL_TYPE_LABEL_CODE_LANG_TYPE_KEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<FormRelTypeLabelRecord>> getKeys() {
        return Arrays.<UniqueKey<FormRelTypeLabelRecord>>asList(Keys.FORM_REL_TYPE_LABEL_CODE_LANG_TYPE_KEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<FormRelTypeLabelRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<FormRelTypeLabelRecord, ?>>asList(Keys.FORM_REL_TYPE_LABEL__FORM_REL_TYPE_LABEL_CODE_FKEY, Keys.FORM_REL_TYPE_LABEL__FORM_REL_TYPE_LABEL_LANG_FKEY, Keys.FORM_REL_TYPE_LABEL__FORM_REL_TYPE_LABEL_TYPE_FKEY);
    }

    public FormRelType formRelType() {
        return new FormRelType(this, Keys.FORM_REL_TYPE_LABEL__FORM_REL_TYPE_LABEL_CODE_FKEY);
    }

    public Lang lang() {
        return new Lang(this, Keys.FORM_REL_TYPE_LABEL__FORM_REL_TYPE_LABEL_LANG_FKEY);
    }

    public LabelType labelType() {
        return new LabelType(this, Keys.FORM_REL_TYPE_LABEL__FORM_REL_TYPE_LABEL_TYPE_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FormRelTypeLabel as(String alias) {
        return new FormRelTypeLabel(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FormRelTypeLabel as(Name alias) {
        return new FormRelTypeLabel(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public FormRelTypeLabel rename(String name) {
        return new FormRelTypeLabel(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FormRelTypeLabel rename(Name name) {
        return new FormRelTypeLabel(name, null);
    }
}
