/*
 * This file is generated by jOOQ.
*/
package eki.wordweb.data.db.tables;


import eki.wordweb.data.db.Indexes;
import eki.wordweb.data.db.Public;
import eki.wordweb.data.db.tables.records.MviewWwWordRelationRecord;
import eki.wordweb.data.db.udt.records.TypeWordRelationRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MviewWwWordRelation extends TableImpl<MviewWwWordRelationRecord> {

    private static final long serialVersionUID = 54566575;

    /**
     * The reference instance of <code>public.mview_ww_word_relation</code>
     */
    public static final MviewWwWordRelation MVIEW_WW_WORD_RELATION = new MviewWwWordRelation();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MviewWwWordRelationRecord> getRecordType() {
        return MviewWwWordRelationRecord.class;
    }

    /**
     * The column <code>public.mview_ww_word_relation.word_id</code>.
     */
    public final TableField<MviewWwWordRelationRecord, Long> WORD_ID = createField("word_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.mview_ww_word_relation.related_words</code>.
     */
    public final TableField<MviewWwWordRelationRecord, TypeWordRelationRecord[]> RELATED_WORDS = createField("related_words", eki.wordweb.data.db.udt.TypeWordRelation.TYPE_WORD_RELATION.getDataType().getArrayDataType(), this, "");

    /**
     * Create a <code>public.mview_ww_word_relation</code> table reference
     */
    public MviewWwWordRelation() {
        this(DSL.name("mview_ww_word_relation"), null);
    }

    /**
     * Create an aliased <code>public.mview_ww_word_relation</code> table reference
     */
    public MviewWwWordRelation(String alias) {
        this(DSL.name(alias), MVIEW_WW_WORD_RELATION);
    }

    /**
     * Create an aliased <code>public.mview_ww_word_relation</code> table reference
     */
    public MviewWwWordRelation(Name alias) {
        this(alias, MVIEW_WW_WORD_RELATION);
    }

    private MviewWwWordRelation(Name alias, Table<MviewWwWordRelationRecord> aliased) {
        this(alias, aliased, null);
    }

    private MviewWwWordRelation(Name alias, Table<MviewWwWordRelationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
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
        return Arrays.<Index>asList(Indexes.MVIEW_WW_WORD_RELATION_WORD_ID_IDX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwWordRelation as(String alias) {
        return new MviewWwWordRelation(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwWordRelation as(Name alias) {
        return new MviewWwWordRelation(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MviewWwWordRelation rename(String name) {
        return new MviewWwWordRelation(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MviewWwWordRelation rename(Name name) {
        return new MviewWwWordRelation(name, null);
    }
}