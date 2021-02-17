/*
 * This file is generated by jOOQ.
 */
package eki.ekilex.data.db.tables;


import eki.ekilex.data.db.Public;
import eki.ekilex.data.db.tables.records.ViewWwMeaningRelationRecord;
import eki.ekilex.data.db.udt.records.TypeMeaningRelationRecord;

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
public class ViewWwMeaningRelation extends TableImpl<ViewWwMeaningRelationRecord> {

    private static final long serialVersionUID = -513264070;

    /**
     * The reference instance of <code>public.view_ww_meaning_relation</code>
     */
    public static final ViewWwMeaningRelation VIEW_WW_MEANING_RELATION = new ViewWwMeaningRelation();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewWwMeaningRelationRecord> getRecordType() {
        return ViewWwMeaningRelationRecord.class;
    }

    /**
     * The column <code>public.view_ww_meaning_relation.meaning_id</code>.
     */
    public final TableField<ViewWwMeaningRelationRecord, Long> MEANING_ID = createField(DSL.name("meaning_id"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.view_ww_meaning_relation.related_meanings</code>.
     */
    public final TableField<ViewWwMeaningRelationRecord, TypeMeaningRelationRecord[]> RELATED_MEANINGS = createField(DSL.name("related_meanings"), eki.ekilex.data.db.udt.TypeMeaningRelation.TYPE_MEANING_RELATION.getDataType().getArrayDataType(), this, "");

    /**
     * Create a <code>public.view_ww_meaning_relation</code> table reference
     */
    public ViewWwMeaningRelation() {
        this(DSL.name("view_ww_meaning_relation"), null);
    }

    /**
     * Create an aliased <code>public.view_ww_meaning_relation</code> table reference
     */
    public ViewWwMeaningRelation(String alias) {
        this(DSL.name(alias), VIEW_WW_MEANING_RELATION);
    }

    /**
     * Create an aliased <code>public.view_ww_meaning_relation</code> table reference
     */
    public ViewWwMeaningRelation(Name alias) {
        this(alias, VIEW_WW_MEANING_RELATION);
    }

    private ViewWwMeaningRelation(Name alias, Table<ViewWwMeaningRelationRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewWwMeaningRelation(Name alias, Table<ViewWwMeaningRelationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("create view \"view_ww_meaning_relation\" as  SELECT r.m1_id AS meaning_id,\n    array_agg(ROW(r.m2_id, r.word_id, (' '::text || r.word), (' '::text || r.word_prese), r.homonym_nr, r.word_lang, r.aspect_code, (r.word_type_codes)::character varying(100)[], r.complexity, r.weight, (r.lex_value_state_codes)::character varying(100)[], (r.lex_register_codes)::character varying(100)[], r.lex_government_values, r.meaning_rel_type_code)::type_meaning_relation ORDER BY r.order_by, r.lex_order_by) AS related_meanings\n   FROM ( SELECT mr.meaning1_id AS m1_id,\n            mr.meaning2_id AS m2_id,\n            w.id AS word_id,\n            w.value AS word,\n            w.value_prese AS word_prese,\n            w.homonym_nr,\n            w.lang AS word_lang,\n            w.aspect_code,\n            l.complexity,\n            mr.weight,\n            ( SELECT array_agg(wt.word_type_code) AS array_agg\n                   FROM word_word_type wt\n                  WHERE (wt.word_id = w.id)\n                  GROUP BY w.id) AS word_type_codes,\n            ( SELECT array_agg(DISTINCT l_1.value_state_code) AS array_agg\n                   FROM lexeme l_1,\n                    dataset l_ds_1\n                  WHERE ((l_1.meaning_id = m.id) AND (l_1.word_id = w.id) AND (l_1.is_public = true) AND ((l_ds_1.code)::text = (l_1.dataset_code)::text) AND (l_ds_1.is_public = true) AND (l_1.value_state_code IS NOT NULL))\n                  GROUP BY l_1.word_id, l_1.meaning_id) AS lex_value_state_codes,\n            ( SELECT array_agg(DISTINCT lr.register_code) AS array_agg\n                   FROM lexeme_register lr,\n                    lexeme l_1,\n                    dataset l_ds_1\n                  WHERE ((l_1.meaning_id = m.id) AND (l_1.word_id = w.id) AND (lr.lexeme_id = l_1.id) AND (l_1.is_public = true) AND ((l_ds_1.code)::text = (l_1.dataset_code)::text) AND (l_ds_1.is_public = true))\n                  GROUP BY l_1.word_id, l_1.meaning_id) AS lex_register_codes,\n            ( SELECT array_agg(ff.value_text) AS array_agg\n                   FROM freeform ff,\n                    lexeme_freeform lff,\n                    lexeme l_1,\n                    dataset l_ds_1\n                  WHERE ((l_1.meaning_id = m.id) AND (l_1.word_id = w.id) AND (l_1.is_public = true) AND ((l_ds_1.code)::text = (l_1.dataset_code)::text) AND (l_ds_1.is_public = true) AND (lff.lexeme_id = l_1.id) AND (ff.id = lff.freeform_id) AND ((ff.type)::text = 'GOVERNMENT'::text))\n                  GROUP BY l_1.word_id, l_1.meaning_id) AS lex_government_values,\n            l.order_by AS lex_order_by,\n            mr.meaning_rel_type_code,\n            mr.order_by\n           FROM ((((meaning_relation mr\n             JOIN meaning m ON ((m.id = mr.meaning2_id)))\n             JOIN lexeme l ON (((l.meaning_id = m.id) AND (l.is_public = true))))\n             JOIN word w ON ((w.id = l.word_id)))\n             JOIN dataset l_ds ON ((((l_ds.code)::text = (l.dataset_code)::text) AND (l_ds.is_public = true))))\n          WHERE (EXISTS ( SELECT lex.id\n                   FROM lexeme lex,\n                    dataset lex_ds\n                  WHERE ((lex.meaning_id = mr.meaning1_id) AND (lex.is_public = true) AND ((lex_ds.code)::text = (lex.dataset_code)::text) AND (lex_ds.is_public = true))))\n          GROUP BY m.id, mr.id, w.id, l.id) r\n  GROUP BY r.m1_id;"));
    }

    public <O extends Record> ViewWwMeaningRelation(Table<O> child, ForeignKey<O, ViewWwMeaningRelationRecord> key) {
        super(child, key, VIEW_WW_MEANING_RELATION);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public ViewWwMeaningRelation as(String alias) {
        return new ViewWwMeaningRelation(DSL.name(alias), this);
    }

    @Override
    public ViewWwMeaningRelation as(Name alias) {
        return new ViewWwMeaningRelation(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewWwMeaningRelation rename(String name) {
        return new ViewWwMeaningRelation(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewWwMeaningRelation rename(Name name) {
        return new ViewWwMeaningRelation(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Long, TypeMeaningRelationRecord[]> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}
