/*
 * This file is generated by jOOQ.
 */
package eki.wordweb.data.db.tables;


import eki.wordweb.data.db.Public;
import eki.wordweb.data.db.tables.records.MviewWwLexemeRelationRecord;

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
public class MviewWwLexemeRelation extends TableImpl<MviewWwLexemeRelationRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.mview_ww_lexeme_relation</code>
     */
    public static final MviewWwLexemeRelation MVIEW_WW_LEXEME_RELATION = new MviewWwLexemeRelation();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MviewWwLexemeRelationRecord> getRecordType() {
        return MviewWwLexemeRelationRecord.class;
    }

    /**
     * The column <code>public.mview_ww_lexeme_relation.lexeme_id</code>.
     */
    public final TableField<MviewWwLexemeRelationRecord, Long> LEXEME_ID = createField(DSL.name("lexeme_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.mview_ww_lexeme_relation.related_lexemes</code>.
     */
    public final TableField<MviewWwLexemeRelationRecord, JSON> RELATED_LEXEMES = createField(DSL.name("related_lexemes"), SQLDataType.JSON, this, "");

    private MviewWwLexemeRelation(Name alias, Table<MviewWwLexemeRelationRecord> aliased) {
        this(alias, aliased, null);
    }

    private MviewWwLexemeRelation(Name alias, Table<MviewWwLexemeRelationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.materializedView());
    }

    /**
     * Create an aliased <code>public.mview_ww_lexeme_relation</code> table reference
     */
    public MviewWwLexemeRelation(String alias) {
        this(DSL.name(alias), MVIEW_WW_LEXEME_RELATION);
    }

    /**
     * Create an aliased <code>public.mview_ww_lexeme_relation</code> table reference
     */
    public MviewWwLexemeRelation(Name alias) {
        this(alias, MVIEW_WW_LEXEME_RELATION);
    }

    /**
     * Create a <code>public.mview_ww_lexeme_relation</code> table reference
     */
    public MviewWwLexemeRelation() {
        this(DSL.name("mview_ww_lexeme_relation"), null);
    }

    public <O extends Record> MviewWwLexemeRelation(Table<O> child, ForeignKey<O, MviewWwLexemeRelationRecord> key) {
        super(child, key, MVIEW_WW_LEXEME_RELATION);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public MviewWwLexemeRelation as(String alias) {
        return new MviewWwLexemeRelation(DSL.name(alias), this);
    }

    @Override
    public MviewWwLexemeRelation as(Name alias) {
        return new MviewWwLexemeRelation(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MviewWwLexemeRelation rename(String name) {
        return new MviewWwLexemeRelation(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MviewWwLexemeRelation rename(Name name) {
        return new MviewWwLexemeRelation(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Long, JSON> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}
