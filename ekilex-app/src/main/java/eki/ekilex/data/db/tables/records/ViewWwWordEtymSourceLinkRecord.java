/*
 * This file is generated by jOOQ.
 */
package eki.ekilex.data.db.tables.records;


import eki.ekilex.data.db.tables.ViewWwWordEtymSourceLink;

import org.jooq.Field;
import org.jooq.JSON;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewWwWordEtymSourceLinkRecord extends TableRecordImpl<ViewWwWordEtymSourceLinkRecord> implements Record2<Long, JSON> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.view_ww_word_etym_source_link.word_id</code>.
     */
    public void setWordId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.view_ww_word_etym_source_link.word_id</code>.
     */
    public Long getWordId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.view_ww_word_etym_source_link.source_links</code>.
     */
    public void setSourceLinks(JSON value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.view_ww_word_etym_source_link.source_links</code>.
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
        return ViewWwWordEtymSourceLink.VIEW_WW_WORD_ETYM_SOURCE_LINK.WORD_ID;
    }

    @Override
    public Field<JSON> field2() {
        return ViewWwWordEtymSourceLink.VIEW_WW_WORD_ETYM_SOURCE_LINK.SOURCE_LINKS;
    }

    @Override
    public Long component1() {
        return getWordId();
    }

    @Override
    public JSON component2() {
        return getSourceLinks();
    }

    @Override
    public Long value1() {
        return getWordId();
    }

    @Override
    public JSON value2() {
        return getSourceLinks();
    }

    @Override
    public ViewWwWordEtymSourceLinkRecord value1(Long value) {
        setWordId(value);
        return this;
    }

    @Override
    public ViewWwWordEtymSourceLinkRecord value2(JSON value) {
        setSourceLinks(value);
        return this;
    }

    @Override
    public ViewWwWordEtymSourceLinkRecord values(Long value1, JSON value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ViewWwWordEtymSourceLinkRecord
     */
    public ViewWwWordEtymSourceLinkRecord() {
        super(ViewWwWordEtymSourceLink.VIEW_WW_WORD_ETYM_SOURCE_LINK);
    }

    /**
     * Create a detached, initialised ViewWwWordEtymSourceLinkRecord
     */
    public ViewWwWordEtymSourceLinkRecord(Long wordId, JSON sourceLinks) {
        super(ViewWwWordEtymSourceLink.VIEW_WW_WORD_ETYM_SOURCE_LINK);

        setWordId(wordId);
        setSourceLinks(sourceLinks);
    }
}
