/*
 * This file is generated by jOOQ.
 */
package eki.wordweb.data.db.tables.records;


import eki.wordweb.data.db.tables.MviewWwClassifier;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record7;
import org.jooq.Row7;
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
public class MviewWwClassifierRecord extends TableRecordImpl<MviewWwClassifierRecord> implements Record7<String, String, String, String, String, String, Long> {

    private static final long serialVersionUID = -1234063231;

    /**
     * Setter for <code>public.mview_ww_classifier.name</code>.
     */
    public void setName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.mview_ww_classifier.name</code>.
     */
    public String getName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.mview_ww_classifier.origin</code>.
     */
    public void setOrigin(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.mview_ww_classifier.origin</code>.
     */
    public String getOrigin() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.mview_ww_classifier.code</code>.
     */
    public void setCode(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.mview_ww_classifier.code</code>.
     */
    public String getCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.mview_ww_classifier.value</code>.
     */
    public void setValue(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.mview_ww_classifier.value</code>.
     */
    public String getValue() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.mview_ww_classifier.lang</code>.
     */
    public void setLang(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.mview_ww_classifier.lang</code>.
     */
    public String getLang() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.mview_ww_classifier.type</code>.
     */
    public void setType(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.mview_ww_classifier.type</code>.
     */
    public String getType() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.mview_ww_classifier.order_by</code>.
     */
    public void setOrderBy(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.mview_ww_classifier.order_by</code>.
     */
    public Long getOrderBy() {
        return (Long) get(6);
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, String, String, String, String, String, Long> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, String, String, String, String, String, Long> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return MviewWwClassifier.MVIEW_WW_CLASSIFIER.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return MviewWwClassifier.MVIEW_WW_CLASSIFIER.ORIGIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return MviewWwClassifier.MVIEW_WW_CLASSIFIER.CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return MviewWwClassifier.MVIEW_WW_CLASSIFIER.VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return MviewWwClassifier.MVIEW_WW_CLASSIFIER.LANG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return MviewWwClassifier.MVIEW_WW_CLASSIFIER.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field7() {
        return MviewWwClassifier.MVIEW_WW_CLASSIFIER.ORDER_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getOrigin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getLang();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component7() {
        return getOrderBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getOrigin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getLang();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value7() {
        return getOrderBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwClassifierRecord value1(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwClassifierRecord value2(String value) {
        setOrigin(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwClassifierRecord value3(String value) {
        setCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwClassifierRecord value4(String value) {
        setValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwClassifierRecord value5(String value) {
        setLang(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwClassifierRecord value6(String value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwClassifierRecord value7(Long value) {
        setOrderBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwClassifierRecord values(String value1, String value2, String value3, String value4, String value5, String value6, Long value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MviewWwClassifierRecord
     */
    public MviewWwClassifierRecord() {
        super(MviewWwClassifier.MVIEW_WW_CLASSIFIER);
    }

    /**
     * Create a detached, initialised MviewWwClassifierRecord
     */
    public MviewWwClassifierRecord(String name, String origin, String code, String value, String lang, String type, Long orderBy) {
        super(MviewWwClassifier.MVIEW_WW_CLASSIFIER);

        set(0, name);
        set(1, origin);
        set(2, code);
        set(3, value);
        set(4, lang);
        set(5, type);
        set(6, orderBy);
    }
}
