/*
 * This file is generated by jOOQ.
 */
package eki.ekilex.data.db.udt;


import eki.ekilex.data.db.Public;
import eki.ekilex.data.db.udt.records.TypeWordRelMeaningRecord;

import org.jooq.Schema;
import org.jooq.UDTField;
import org.jooq.impl.DSL;
import org.jooq.impl.SchemaImpl;
import org.jooq.impl.UDTImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TypeWordRelMeaning extends UDTImpl<TypeWordRelMeaningRecord> {

    private static final long serialVersionUID = 1390365399;

    /**
     * The reference instance of <code>public.type_word_rel_meaning</code>
     */
    public static final TypeWordRelMeaning TYPE_WORD_REL_MEANING = new TypeWordRelMeaning();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TypeWordRelMeaningRecord> getRecordType() {
        return TypeWordRelMeaningRecord.class;
    }

    /**
     * The attribute <code>public.type_word_rel_meaning.meaning_id</code>.
     */
    public static final UDTField<TypeWordRelMeaningRecord, Long> MEANING_ID = createField(DSL.name("meaning_id"), org.jooq.impl.SQLDataType.BIGINT, TYPE_WORD_REL_MEANING, "");

    /**
     * The attribute <code>public.type_word_rel_meaning.definitions</code>.
     */
    public static final UDTField<TypeWordRelMeaningRecord, String[]> DEFINITIONS = createField(DSL.name("definitions"), org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), TYPE_WORD_REL_MEANING, "");

    /**
     * No further instances allowed
     */
    private TypeWordRelMeaning() {
        super("type_word_rel_meaning", null, null, false);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC != null ? Public.PUBLIC : new SchemaImpl(DSL.name("public"));
    }
}