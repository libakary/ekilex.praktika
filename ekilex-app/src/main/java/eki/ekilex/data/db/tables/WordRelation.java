/*
 * This file is generated by jOOQ.
*/
package eki.ekilex.data.db.tables;


import eki.ekilex.data.db.Indexes;
import eki.ekilex.data.db.Keys;
import eki.ekilex.data.db.Public;
import eki.ekilex.data.db.tables.records.WordRelationRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
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
        "jOOQ version:3.10.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class WordRelation extends TableImpl<WordRelationRecord> {

    private static final long serialVersionUID = 1085110002;

    /**
     * The reference instance of <code>public.word_relation</code>
     */
    public static final WordRelation WORD_RELATION = new WordRelation();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<WordRelationRecord> getRecordType() {
        return WordRelationRecord.class;
    }

    /**
     * The column <code>public.word_relation.id</code>.
     */
    public final TableField<WordRelationRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('word_relation_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.word_relation.word1_id</code>.
     */
    public final TableField<WordRelationRecord, Long> WORD1_ID = createField("word1_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.word_relation.word2_id</code>.
     */
    public final TableField<WordRelationRecord, Long> WORD2_ID = createField("word2_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.word_relation.word_rel_type_code</code>.
     */
    public final TableField<WordRelationRecord, String> WORD_REL_TYPE_CODE = createField("word_rel_type_code", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>public.word_relation.order_by</code>.
     */
    public final TableField<WordRelationRecord, Long> ORDER_BY = createField("order_by", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('word_relation_order_by_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>public.word_relation</code> table reference
     */
    public WordRelation() {
        this(DSL.name("word_relation"), null);
    }

    /**
     * Create an aliased <code>public.word_relation</code> table reference
     */
    public WordRelation(String alias) {
        this(DSL.name(alias), WORD_RELATION);
    }

    /**
     * Create an aliased <code>public.word_relation</code> table reference
     */
    public WordRelation(Name alias) {
        this(alias, WORD_RELATION);
    }

    private WordRelation(Name alias, Table<WordRelationRecord> aliased) {
        this(alias, aliased, null);
    }

    private WordRelation(Name alias, Table<WordRelationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
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
        return Arrays.<Index>asList(Indexes.WORD_RELATION_PKEY, Indexes.WORD_RELATION_WORD1_ID_IDX, Indexes.WORD_RELATION_WORD1_ID_WORD2_ID_WORD_REL_TYPE_CODE_KEY, Indexes.WORD_RELATION_WORD2_ID_IDX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<WordRelationRecord, Long> getIdentity() {
        return Keys.IDENTITY_WORD_RELATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<WordRelationRecord> getPrimaryKey() {
        return Keys.WORD_RELATION_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<WordRelationRecord>> getKeys() {
        return Arrays.<UniqueKey<WordRelationRecord>>asList(Keys.WORD_RELATION_PKEY, Keys.WORD_RELATION_WORD1_ID_WORD2_ID_WORD_REL_TYPE_CODE_KEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<WordRelationRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<WordRelationRecord, ?>>asList(Keys.WORD_RELATION__WORD_RELATION_WORD1_ID_FKEY, Keys.WORD_RELATION__WORD_RELATION_WORD2_ID_FKEY, Keys.WORD_RELATION__WORD_RELATION_WORD_REL_TYPE_CODE_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WordRelation as(String alias) {
        return new WordRelation(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WordRelation as(Name alias) {
        return new WordRelation(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public WordRelation rename(String name) {
        return new WordRelation(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public WordRelation rename(Name name) {
        return new WordRelation(name, null);
    }
}
