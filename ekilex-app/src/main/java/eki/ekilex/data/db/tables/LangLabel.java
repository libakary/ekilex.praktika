/*
 * This file is generated by jOOQ.
 */
package eki.ekilex.data.db.tables;


import eki.ekilex.data.db.Indexes;
import eki.ekilex.data.db.Keys;
import eki.ekilex.data.db.Public;
import eki.ekilex.data.db.tables.records.LangLabelRecord;

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
public class LangLabel extends TableImpl<LangLabelRecord> {

    private static final long serialVersionUID = 948770807;

    /**
     * The reference instance of <code>public.lang_label</code>
     */
    public static final LangLabel LANG_LABEL = new LangLabel();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LangLabelRecord> getRecordType() {
        return LangLabelRecord.class;
    }

    /**
     * The column <code>public.lang_label.code</code>.
     */
    public final TableField<LangLabelRecord, String> CODE = createField("code", org.jooq.impl.SQLDataType.CHAR(3).nullable(false), this, "");

    /**
     * The column <code>public.lang_label.value</code>.
     */
    public final TableField<LangLabelRecord, String> VALUE = createField("value", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.lang_label.lang</code>.
     */
    public final TableField<LangLabelRecord, String> LANG = createField("lang", org.jooq.impl.SQLDataType.CHAR(3).nullable(false), this, "");

    /**
     * The column <code>public.lang_label.type</code>.
     */
    public final TableField<LangLabelRecord, String> TYPE = createField("type", org.jooq.impl.SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * Create a <code>public.lang_label</code> table reference
     */
    public LangLabel() {
        this(DSL.name("lang_label"), null);
    }

    /**
     * Create an aliased <code>public.lang_label</code> table reference
     */
    public LangLabel(String alias) {
        this(DSL.name(alias), LANG_LABEL);
    }

    /**
     * Create an aliased <code>public.lang_label</code> table reference
     */
    public LangLabel(Name alias) {
        this(alias, LANG_LABEL);
    }

    private LangLabel(Name alias, Table<LangLabelRecord> aliased) {
        this(alias, aliased, null);
    }

    private LangLabel(Name alias, Table<LangLabelRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> LangLabel(Table<O> child, ForeignKey<O, LangLabelRecord> key) {
        super(child, key, LANG_LABEL);
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
        return Arrays.<Index>asList(Indexes.LANG_LABEL_CODE_LANG_TYPE_KEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<LangLabelRecord>> getKeys() {
        return Arrays.<UniqueKey<LangLabelRecord>>asList(Keys.LANG_LABEL_CODE_LANG_TYPE_KEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<LangLabelRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<LangLabelRecord, ?>>asList(Keys.LANG_LABEL__LANG_LABEL_CODE_FKEY, Keys.LANG_LABEL__LANG_LABEL_LANG_FKEY, Keys.LANG_LABEL__LANG_LABEL_TYPE_FKEY);
    }

    public Lang langLabel_LangLabelCodeFkey() {
        return new Lang(this, Keys.LANG_LABEL__LANG_LABEL_CODE_FKEY);
    }

    public Lang langLabel_LangLabelLangFkey() {
        return new Lang(this, Keys.LANG_LABEL__LANG_LABEL_LANG_FKEY);
    }

    public LabelType labelType() {
        return new LabelType(this, Keys.LANG_LABEL__LANG_LABEL_TYPE_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LangLabel as(String alias) {
        return new LangLabel(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LangLabel as(Name alias) {
        return new LangLabel(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public LangLabel rename(String name) {
        return new LangLabel(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public LangLabel rename(Name name) {
        return new LangLabel(name, null);
    }
}
