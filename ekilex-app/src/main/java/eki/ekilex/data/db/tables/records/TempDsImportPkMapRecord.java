/*
 * This file is generated by jOOQ.
 */
package eki.ekilex.data.db.tables.records;


import eki.ekilex.data.db.tables.TempDsImportPkMap;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


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
public class TempDsImportPkMapRecord extends UpdatableRecordImpl<TempDsImportPkMapRecord> implements Record6<Long, String, Timestamp, String, Long, Long> {

    private static final long serialVersionUID = 1056640118;

    /**
     * Setter for <code>public.temp_ds_import_pk_map.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.temp_ds_import_pk_map.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.temp_ds_import_pk_map.import_code</code>.
     */
    public void setImportCode(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.temp_ds_import_pk_map.import_code</code>.
     */
    public String getImportCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.temp_ds_import_pk_map.created_on</code>.
     */
    public void setCreatedOn(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.temp_ds_import_pk_map.created_on</code>.
     */
    public Timestamp getCreatedOn() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>public.temp_ds_import_pk_map.table_name</code>.
     */
    public void setTableName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.temp_ds_import_pk_map.table_name</code>.
     */
    public String getTableName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.temp_ds_import_pk_map.source_pk</code>.
     */
    public void setSourcePk(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.temp_ds_import_pk_map.source_pk</code>.
     */
    public Long getSourcePk() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>public.temp_ds_import_pk_map.target_pk</code>.
     */
    public void setTargetPk(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.temp_ds_import_pk_map.target_pk</code>.
     */
    public Long getTargetPk() {
        return (Long) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Long, String, Timestamp, String, Long, Long> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Long, String, Timestamp, String, Long, Long> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return TempDsImportPkMap.TEMP_DS_IMPORT_PK_MAP.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TempDsImportPkMap.TEMP_DS_IMPORT_PK_MAP.IMPORT_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return TempDsImportPkMap.TEMP_DS_IMPORT_PK_MAP.CREATED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TempDsImportPkMap.TEMP_DS_IMPORT_PK_MAP.TABLE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return TempDsImportPkMap.TEMP_DS_IMPORT_PK_MAP.SOURCE_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field6() {
        return TempDsImportPkMap.TEMP_DS_IMPORT_PK_MAP.TARGET_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getImportCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component3() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getTableName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component5() {
        return getSourcePk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component6() {
        return getTargetPk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getImportCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getTableName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value5() {
        return getSourcePk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value6() {
        return getTargetPk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TempDsImportPkMapRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TempDsImportPkMapRecord value2(String value) {
        setImportCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TempDsImportPkMapRecord value3(Timestamp value) {
        setCreatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TempDsImportPkMapRecord value4(String value) {
        setTableName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TempDsImportPkMapRecord value5(Long value) {
        setSourcePk(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TempDsImportPkMapRecord value6(Long value) {
        setTargetPk(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TempDsImportPkMapRecord values(Long value1, String value2, Timestamp value3, String value4, Long value5, Long value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TempDsImportPkMapRecord
     */
    public TempDsImportPkMapRecord() {
        super(TempDsImportPkMap.TEMP_DS_IMPORT_PK_MAP);
    }

    /**
     * Create a detached, initialised TempDsImportPkMapRecord
     */
    public TempDsImportPkMapRecord(Long id, String importCode, Timestamp createdOn, String tableName, Long sourcePk, Long targetPk) {
        super(TempDsImportPkMap.TEMP_DS_IMPORT_PK_MAP);

        set(0, id);
        set(1, importCode);
        set(2, createdOn);
        set(3, tableName);
        set(4, sourcePk);
        set(5, targetPk);
    }
}