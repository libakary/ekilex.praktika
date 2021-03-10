/*
 * This file is generated by jOOQ.
 */
package eki.ekilex.data.db.tables;


import eki.ekilex.data.db.Indexes;
import eki.ekilex.data.db.Keys;
import eki.ekilex.data.db.Public;
import eki.ekilex.data.db.tables.records.WordLastActivityLogRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class WordLastActivityLog extends TableImpl<WordLastActivityLogRecord> {

    private static final long serialVersionUID = 1479428124;

    /**
     * The reference instance of <code>public.word_last_activity_log</code>
     */
    public static final WordLastActivityLog WORD_LAST_ACTIVITY_LOG = new WordLastActivityLog();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<WordLastActivityLogRecord> getRecordType() {
        return WordLastActivityLogRecord.class;
    }

    /**
     * The column <code>public.word_last_activity_log.id</code>.
     */
    public final TableField<WordLastActivityLogRecord, Long> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('word_last_activity_log_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.word_last_activity_log.word_id</code>.
     */
    public final TableField<WordLastActivityLogRecord, Long> WORD_ID = createField(DSL.name("word_id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.word_last_activity_log.activity_log_id</code>.
     */
    public final TableField<WordLastActivityLogRecord, Long> ACTIVITY_LOG_ID = createField(DSL.name("activity_log_id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>public.word_last_activity_log</code> table reference
     */
    public WordLastActivityLog() {
        this(DSL.name("word_last_activity_log"), null);
    }

    /**
     * Create an aliased <code>public.word_last_activity_log</code> table reference
     */
    public WordLastActivityLog(String alias) {
        this(DSL.name(alias), WORD_LAST_ACTIVITY_LOG);
    }

    /**
     * Create an aliased <code>public.word_last_activity_log</code> table reference
     */
    public WordLastActivityLog(Name alias) {
        this(alias, WORD_LAST_ACTIVITY_LOG);
    }

    private WordLastActivityLog(Name alias, Table<WordLastActivityLogRecord> aliased) {
        this(alias, aliased, null);
    }

    private WordLastActivityLog(Name alias, Table<WordLastActivityLogRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> WordLastActivityLog(Table<O> child, ForeignKey<O, WordLastActivityLogRecord> key) {
        super(child, key, WORD_LAST_ACTIVITY_LOG);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.WORD_LAST_ACTIVITY_LOG_LOG_ID_IDX, Indexes.WORD_LAST_ACTIVITY_LOG_WORD_ID_IDX);
    }

    @Override
    public Identity<WordLastActivityLogRecord, Long> getIdentity() {
        return Keys.IDENTITY_WORD_LAST_ACTIVITY_LOG;
    }

    @Override
    public UniqueKey<WordLastActivityLogRecord> getPrimaryKey() {
        return Keys.WORD_LAST_ACTIVITY_LOG_PKEY;
    }

    @Override
    public List<UniqueKey<WordLastActivityLogRecord>> getKeys() {
        return Arrays.<UniqueKey<WordLastActivityLogRecord>>asList(Keys.WORD_LAST_ACTIVITY_LOG_PKEY, Keys.WORD_LAST_ACTIVITY_LOG_WORD_ID_KEY);
    }

    @Override
    public List<ForeignKey<WordLastActivityLogRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<WordLastActivityLogRecord, ?>>asList(Keys.WORD_LAST_ACTIVITY_LOG__WORD_LAST_ACTIVITY_LOG_WORD_ID_FKEY, Keys.WORD_LAST_ACTIVITY_LOG__WORD_LAST_ACTIVITY_LOG_ACTIVITY_LOG_ID_FKEY);
    }

    public Word word() {
        return new Word(this, Keys.WORD_LAST_ACTIVITY_LOG__WORD_LAST_ACTIVITY_LOG_WORD_ID_FKEY);
    }

    public ActivityLog activityLog() {
        return new ActivityLog(this, Keys.WORD_LAST_ACTIVITY_LOG__WORD_LAST_ACTIVITY_LOG_ACTIVITY_LOG_ID_FKEY);
    }

    @Override
    public WordLastActivityLog as(String alias) {
        return new WordLastActivityLog(DSL.name(alias), this);
    }

    @Override
    public WordLastActivityLog as(Name alias) {
        return new WordLastActivityLog(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public WordLastActivityLog rename(String name) {
        return new WordLastActivityLog(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public WordLastActivityLog rename(Name name) {
        return new WordLastActivityLog(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Long, Long, Long> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
