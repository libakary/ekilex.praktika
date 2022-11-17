/*
 * This file is generated by jOOQ.
 */
package eki.ekilex.data.db.tables.records;


import eki.ekilex.data.db.tables.ViewWwLexemeFreeformSourceLink;

import org.jooq.Field;
import org.jooq.JSON;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewWwLexemeFreeformSourceLinkRecord extends TableRecordImpl<ViewWwLexemeFreeformSourceLinkRecord> implements Record2<Long, JSON> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.view_ww_lexeme_freeform_source_link.lexeme_id</code>.
     */
    public void setLexemeId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.view_ww_lexeme_freeform_source_link.lexeme_id</code>.
     */
    public Long getLexemeId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.view_ww_lexeme_freeform_source_link.source_links</code>.
     */
    public void setSourceLinks(JSON value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.view_ww_lexeme_freeform_source_link.source_links</code>.
     */
    public JSON getSourceLinks() {
        return (JSON) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<Long, JSON> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<Long, JSON> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return ViewWwLexemeFreeformSourceLink.VIEW_WW_LEXEME_FREEFORM_SOURCE_LINK.LEXEME_ID;
    }

    @Override
    public Field<JSON> field2() {
        return ViewWwLexemeFreeformSourceLink.VIEW_WW_LEXEME_FREEFORM_SOURCE_LINK.SOURCE_LINKS;
    }

    @Override
    public Long component1() {
        return getLexemeId();
    }

    @Override
    public JSON component2() {
        return getSourceLinks();
    }

    @Override
    public Long value1() {
        return getLexemeId();
    }

    @Override
    public JSON value2() {
        return getSourceLinks();
    }

    @Override
    public ViewWwLexemeFreeformSourceLinkRecord value1(Long value) {
        setLexemeId(value);
        return this;
    }

    @Override
    public ViewWwLexemeFreeformSourceLinkRecord value2(JSON value) {
        setSourceLinks(value);
        return this;
    }

    @Override
    public ViewWwLexemeFreeformSourceLinkRecord values(Long value1, JSON value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ViewWwLexemeFreeformSourceLinkRecord
     */
    public ViewWwLexemeFreeformSourceLinkRecord() {
        super(ViewWwLexemeFreeformSourceLink.VIEW_WW_LEXEME_FREEFORM_SOURCE_LINK);
    }

    /**
     * Create a detached, initialised ViewWwLexemeFreeformSourceLinkRecord
     */
    public ViewWwLexemeFreeformSourceLinkRecord(Long lexemeId, JSON sourceLinks) {
        super(ViewWwLexemeFreeformSourceLink.VIEW_WW_LEXEME_FREEFORM_SOURCE_LINK);

        setLexemeId(lexemeId);
        setSourceLinks(sourceLinks);
    }
}
