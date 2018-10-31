/*
 * This file is generated by jOOQ.
 */
package eki.ekilex.data.db.tables;


import eki.ekilex.data.db.Indexes;
import eki.ekilex.data.db.Keys;
import eki.ekilex.data.db.Public;
import eki.ekilex.data.db.tables.records.MeaningLifecycleLogRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MeaningLifecycleLog extends TableImpl<MeaningLifecycleLogRecord> {

    private static final long serialVersionUID = -1176954730;

    /**
     * The reference instance of <code>public.meaning_lifecycle_log</code>
     */
    public static final MeaningLifecycleLog MEANING_LIFECYCLE_LOG = new MeaningLifecycleLog();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MeaningLifecycleLogRecord> getRecordType() {
        return MeaningLifecycleLogRecord.class;
    }

    /**
     * The column <code>public.meaning_lifecycle_log.id</code>.
     */
    public final TableField<MeaningLifecycleLogRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('meaning_lifecycle_log_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.meaning_lifecycle_log.meaning_id</code>.
     */
    public final TableField<MeaningLifecycleLogRecord, Long> MEANING_ID = createField("meaning_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.meaning_lifecycle_log.lifecycle_log_id</code>.
     */
    public final TableField<MeaningLifecycleLogRecord, Long> LIFECYCLE_LOG_ID = createField("lifecycle_log_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>public.meaning_lifecycle_log</code> table reference
     */
    public MeaningLifecycleLog() {
        this(DSL.name("meaning_lifecycle_log"), null);
    }

    /**
     * Create an aliased <code>public.meaning_lifecycle_log</code> table reference
     */
    public MeaningLifecycleLog(String alias) {
        this(DSL.name(alias), MEANING_LIFECYCLE_LOG);
    }

    /**
     * Create an aliased <code>public.meaning_lifecycle_log</code> table reference
     */
    public MeaningLifecycleLog(Name alias) {
        this(alias, MEANING_LIFECYCLE_LOG);
    }

    private MeaningLifecycleLog(Name alias, Table<MeaningLifecycleLogRecord> aliased) {
        this(alias, aliased, null);
    }

    private MeaningLifecycleLog(Name alias, Table<MeaningLifecycleLogRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> MeaningLifecycleLog(Table<O> child, ForeignKey<O, MeaningLifecycleLogRecord> key) {
        super(child, key, MEANING_LIFECYCLE_LOG);
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
        return Arrays.<Index>asList(Indexes.MEANING_LIFECYCLE_LOG_LOG_ID_IDX, Indexes.MEANING_LIFECYCLE_LOG_MEANING_ID_IDX, Indexes.MEANING_LIFECYCLE_LOG_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<MeaningLifecycleLogRecord, Long> getIdentity() {
        return Keys.IDENTITY_MEANING_LIFECYCLE_LOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MeaningLifecycleLogRecord> getPrimaryKey() {
        return Keys.MEANING_LIFECYCLE_LOG_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MeaningLifecycleLogRecord>> getKeys() {
        return Arrays.<UniqueKey<MeaningLifecycleLogRecord>>asList(Keys.MEANING_LIFECYCLE_LOG_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<MeaningLifecycleLogRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<MeaningLifecycleLogRecord, ?>>asList(Keys.MEANING_LIFECYCLE_LOG__MEANING_LIFECYCLE_LOG_MEANING_ID_FKEY, Keys.MEANING_LIFECYCLE_LOG__MEANING_LIFECYCLE_LOG_LIFECYCLE_LOG_ID_FKEY);
    }

    public Meaning meaning() {
        return new Meaning(this, Keys.MEANING_LIFECYCLE_LOG__MEANING_LIFECYCLE_LOG_MEANING_ID_FKEY);
    }

    public LifecycleLog lifecycleLog() {
        return new LifecycleLog(this, Keys.MEANING_LIFECYCLE_LOG__MEANING_LIFECYCLE_LOG_LIFECYCLE_LOG_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MeaningLifecycleLog as(String alias) {
        return new MeaningLifecycleLog(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MeaningLifecycleLog as(Name alias) {
        return new MeaningLifecycleLog(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MeaningLifecycleLog rename(String name) {
        return new MeaningLifecycleLog(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MeaningLifecycleLog rename(Name name) {
        return new MeaningLifecycleLog(name, null);
    }
}
