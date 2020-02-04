/*
 * This file is generated by jOOQ.
 */
package eki.wordweb.data.db.tables.records;


import eki.wordweb.data.db.tables.MviewWwFreeformSourceLink;
import eki.wordweb.data.db.udt.records.TypeSourceLinkRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MviewWwFreeformSourceLinkRecord extends TableRecordImpl<MviewWwFreeformSourceLinkRecord> implements Record2<Long, TypeSourceLinkRecord[]> {

    private static final long serialVersionUID = -442274758;

    /**
     * Setter for <code>public.mview_ww_freeform_source_link.word_id</code>.
     */
    public void setWordId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.mview_ww_freeform_source_link.word_id</code>.
     */
    public Long getWordId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.mview_ww_freeform_source_link.source_links</code>.
     */
    public void setSourceLinks(TypeSourceLinkRecord... value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.mview_ww_freeform_source_link.source_links</code>.
     */
    public TypeSourceLinkRecord[] getSourceLinks() {
        return (TypeSourceLinkRecord[]) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Long, TypeSourceLinkRecord[]> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Long, TypeSourceLinkRecord[]> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return MviewWwFreeformSourceLink.MVIEW_WW_FREEFORM_SOURCE_LINK.WORD_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<TypeSourceLinkRecord[]> field2() {
        return MviewWwFreeformSourceLink.MVIEW_WW_FREEFORM_SOURCE_LINK.SOURCE_LINKS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getWordId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeSourceLinkRecord[] component2() {
        return getSourceLinks();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getWordId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeSourceLinkRecord[] value2() {
        return getSourceLinks();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwFreeformSourceLinkRecord value1(Long value) {
        setWordId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwFreeformSourceLinkRecord value2(TypeSourceLinkRecord... value) {
        setSourceLinks(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwFreeformSourceLinkRecord values(Long value1, TypeSourceLinkRecord[] value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MviewWwFreeformSourceLinkRecord
     */
    public MviewWwFreeformSourceLinkRecord() {
        super(MviewWwFreeformSourceLink.MVIEW_WW_FREEFORM_SOURCE_LINK);
    }

    /**
     * Create a detached, initialised MviewWwFreeformSourceLinkRecord
     */
    public MviewWwFreeformSourceLinkRecord(Long wordId, TypeSourceLinkRecord[] sourceLinks) {
        super(MviewWwFreeformSourceLink.MVIEW_WW_FREEFORM_SOURCE_LINK);

        set(0, wordId);
        set(1, sourceLinks);
    }
}