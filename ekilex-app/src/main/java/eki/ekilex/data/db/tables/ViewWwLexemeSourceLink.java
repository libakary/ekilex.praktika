/*
 * This file is generated by jOOQ.
 */
package eki.ekilex.data.db.tables;


import eki.ekilex.data.db.Public;
import eki.ekilex.data.db.tables.records.ViewWwLexemeSourceLinkRecord;
import eki.ekilex.data.db.udt.records.TypeSourceLinkRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row2;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewWwLexemeSourceLink extends TableImpl<ViewWwLexemeSourceLinkRecord> {

    private static final long serialVersionUID = -2102909850;

    /**
     * The reference instance of <code>public.view_ww_lexeme_source_link</code>
     */
    public static final ViewWwLexemeSourceLink VIEW_WW_LEXEME_SOURCE_LINK = new ViewWwLexemeSourceLink();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewWwLexemeSourceLinkRecord> getRecordType() {
        return ViewWwLexemeSourceLinkRecord.class;
    }

    /**
     * The column <code>public.view_ww_lexeme_source_link.lexeme_id</code>.
     */
    public final TableField<ViewWwLexemeSourceLinkRecord, Long> LEXEME_ID = createField(DSL.name("lexeme_id"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.view_ww_lexeme_source_link.source_links</code>.
     */
    public final TableField<ViewWwLexemeSourceLinkRecord, TypeSourceLinkRecord[]> SOURCE_LINKS = createField(DSL.name("source_links"), eki.ekilex.data.db.udt.TypeSourceLink.TYPE_SOURCE_LINK.getDataType().getArrayDataType(), this, "");

    /**
     * Create a <code>public.view_ww_lexeme_source_link</code> table reference
     */
    public ViewWwLexemeSourceLink() {
        this(DSL.name("view_ww_lexeme_source_link"), null);
    }

    /**
     * Create an aliased <code>public.view_ww_lexeme_source_link</code> table reference
     */
    public ViewWwLexemeSourceLink(String alias) {
        this(DSL.name(alias), VIEW_WW_LEXEME_SOURCE_LINK);
    }

    /**
     * Create an aliased <code>public.view_ww_lexeme_source_link</code> table reference
     */
    public ViewWwLexemeSourceLink(Name alias) {
        this(alias, VIEW_WW_LEXEME_SOURCE_LINK);
    }

    private ViewWwLexemeSourceLink(Name alias, Table<ViewWwLexemeSourceLinkRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewWwLexemeSourceLink(Name alias, Table<ViewWwLexemeSourceLinkRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("create view \"view_ww_lexeme_source_link\" as  SELECT l.id AS lexeme_id,\n    array_agg(ROW('LEXEME'::character varying(100), l.id, lsl.id, lsl.type, lsl.name, lsl.value, lsl.order_by, s.source_id, s.source_props)::type_source_link ORDER BY l.id, lsl.order_by) AS source_links\n   FROM lexeme l,\n    dataset ds,\n    lexeme_source_link lsl,\n    ( SELECT s_1.id AS source_id,\n            array_agg(encode_text(ff.value_prese) ORDER BY ff.order_by) AS source_props\n           FROM source s_1,\n            source_freeform sff,\n            freeform ff\n          WHERE ((sff.source_id = s_1.id) AND (sff.freeform_id = ff.id) AND ((ff.type)::text <> ALL ((ARRAY['SOURCE_FILE'::character varying, 'EXTERNAL_SOURCE_ID'::character varying])::text[])))\n          GROUP BY s_1.id) s\n  WHERE ((l.is_public = true) AND (lsl.lexeme_id = l.id) AND (lsl.source_id = s.source_id) AND ((ds.code)::text = (l.dataset_code)::text) AND (ds.is_public = true))\n  GROUP BY l.id\n  ORDER BY l.id;"));
    }

    public <O extends Record> ViewWwLexemeSourceLink(Table<O> child, ForeignKey<O, ViewWwLexemeSourceLinkRecord> key) {
        super(child, key, VIEW_WW_LEXEME_SOURCE_LINK);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public ViewWwLexemeSourceLink as(String alias) {
        return new ViewWwLexemeSourceLink(DSL.name(alias), this);
    }

    @Override
    public ViewWwLexemeSourceLink as(Name alias) {
        return new ViewWwLexemeSourceLink(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewWwLexemeSourceLink rename(String name) {
        return new ViewWwLexemeSourceLink(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewWwLexemeSourceLink rename(Name name) {
        return new ViewWwLexemeSourceLink(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Long, TypeSourceLinkRecord[]> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}
