/*
 * This file is generated by jOOQ.
 */
package eki.wordweb.data.db;


import eki.wordweb.data.db.tables.LexicalDecisionData;
import eki.wordweb.data.db.tables.LexicalDecisionResult;
import eki.wordweb.data.db.tables.records.LexicalDecisionDataRecord;
import eki.wordweb.data.db.tables.records.LexicalDecisionResultRecord;

import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>public</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<LexicalDecisionDataRecord, Long> IDENTITY_LEXICAL_DECISION_DATA = Identities0.IDENTITY_LEXICAL_DECISION_DATA;
    public static final Identity<LexicalDecisionResultRecord, Long> IDENTITY_LEXICAL_DECISION_RESULT = Identities0.IDENTITY_LEXICAL_DECISION_RESULT;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<LexicalDecisionDataRecord> LEXICAL_DECISION_DATA_PKEY = UniqueKeys0.LEXICAL_DECISION_DATA_PKEY;
    public static final UniqueKey<LexicalDecisionResultRecord> LEXICAL_DECISION_RESULT_PKEY = UniqueKeys0.LEXICAL_DECISION_RESULT_PKEY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<LexicalDecisionResultRecord, LexicalDecisionDataRecord> LEXICAL_DECISION_RESULT__LEXICAL_DECISION_RESULT_DATA_ID_FKEY = ForeignKeys0.LEXICAL_DECISION_RESULT__LEXICAL_DECISION_RESULT_DATA_ID_FKEY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<LexicalDecisionDataRecord, Long> IDENTITY_LEXICAL_DECISION_DATA = Internal.createIdentity(LexicalDecisionData.LEXICAL_DECISION_DATA, LexicalDecisionData.LEXICAL_DECISION_DATA.ID);
        public static Identity<LexicalDecisionResultRecord, Long> IDENTITY_LEXICAL_DECISION_RESULT = Internal.createIdentity(LexicalDecisionResult.LEXICAL_DECISION_RESULT, LexicalDecisionResult.LEXICAL_DECISION_RESULT.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<LexicalDecisionDataRecord> LEXICAL_DECISION_DATA_PKEY = Internal.createUniqueKey(LexicalDecisionData.LEXICAL_DECISION_DATA, "lexical_decision_data_pkey", LexicalDecisionData.LEXICAL_DECISION_DATA.ID);
        public static final UniqueKey<LexicalDecisionResultRecord> LEXICAL_DECISION_RESULT_PKEY = Internal.createUniqueKey(LexicalDecisionResult.LEXICAL_DECISION_RESULT, "lexical_decision_result_pkey", LexicalDecisionResult.LEXICAL_DECISION_RESULT.ID);
    }

    private static class ForeignKeys0 {
        public static final ForeignKey<LexicalDecisionResultRecord, LexicalDecisionDataRecord> LEXICAL_DECISION_RESULT__LEXICAL_DECISION_RESULT_DATA_ID_FKEY = Internal.createForeignKey(eki.wordweb.data.db.Keys.LEXICAL_DECISION_DATA_PKEY, LexicalDecisionResult.LEXICAL_DECISION_RESULT, "lexical_decision_result__lexical_decision_result_data_id_fkey", LexicalDecisionResult.LEXICAL_DECISION_RESULT.DATA_ID);
    }
}
