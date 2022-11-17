/*
 * This file is generated by jOOQ.
 */
package eki.wordweb.data.db.tables;


import eki.wordweb.data.db.Public;
import eki.wordweb.data.db.tables.records.MviewWwMeaningRelationRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.JSON;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row2;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MviewWwMeaningRelation extends TableImpl<MviewWwMeaningRelationRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.mview_ww_meaning_relation</code>
     */
    public static final MviewWwMeaningRelation MVIEW_WW_MEANING_RELATION = new MviewWwMeaningRelation();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MviewWwMeaningRelationRecord> getRecordType() {
        return MviewWwMeaningRelationRecord.class;
    }

    /**
     * The column <code>public.mview_ww_meaning_relation.meaning_id</code>.
     */
    public final TableField<MviewWwMeaningRelationRecord, Long> MEANING_ID = createField(DSL.name("meaning_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.mview_ww_meaning_relation.related_meanings</code>.
     */
    public final TableField<MviewWwMeaningRelationRecord, JSON> RELATED_MEANINGS = createField(DSL.name("related_meanings"), SQLDataType.JSON, this, "");

    private MviewWwMeaningRelation(Name alias, Table<MviewWwMeaningRelationRecord> aliased) {
        this(alias, aliased, null);
    }

    private MviewWwMeaningRelation(Name alias, Table<MviewWwMeaningRelationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.materializedView());
    }

    /**
     * Create an aliased <code>public.mview_ww_meaning_relation</code> table reference
     */
    public MviewWwMeaningRelation(String alias) {
        this(DSL.name(alias), MVIEW_WW_MEANING_RELATION);
    }

    /**
     * Create an aliased <code>public.mview_ww_meaning_relation</code> table reference
     */
    public MviewWwMeaningRelation(Name alias) {
        this(alias, MVIEW_WW_MEANING_RELATION);
    }

    /**
     * Create a <code>public.mview_ww_meaning_relation</code> table reference
     */
    public MviewWwMeaningRelation() {
        this(DSL.name("mview_ww_meaning_relation"), null);
    }

    public <O extends Record> MviewWwMeaningRelation(Table<O> child, ForeignKey<O, MviewWwMeaningRelationRecord> key) {
        super(child, key, MVIEW_WW_MEANING_RELATION);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public MviewWwMeaningRelation as(String alias) {
        return new MviewWwMeaningRelation(DSL.name(alias), this);
    }

    @Override
    public MviewWwMeaningRelation as(Name alias) {
        return new MviewWwMeaningRelation(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MviewWwMeaningRelation rename(String name) {
        return new MviewWwMeaningRelation(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MviewWwMeaningRelation rename(Name name) {
        return new MviewWwMeaningRelation(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Long, JSON> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}
