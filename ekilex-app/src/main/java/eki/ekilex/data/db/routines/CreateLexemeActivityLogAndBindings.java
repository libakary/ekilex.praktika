/*
 * This file is generated by jOOQ.
 */
package eki.ekilex.data.db.routines;


import eki.ekilex.data.db.Public;

import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CreateLexemeActivityLogAndBindings extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 1435604104;

    /**
     * The parameter <code>public.create_lexeme_activity_log_and_bindings.owner_lexeme_id</code>.
     */
    public static final Parameter<Long> OWNER_LEXEME_ID = Internal.createParameter("owner_lexeme_id", org.jooq.impl.SQLDataType.BIGINT, false, false);

    /**
     * The parameter <code>public.create_lexeme_activity_log_and_bindings.activity_log_id</code>.
     */
    public static final Parameter<Long> ACTIVITY_LOG_ID = Internal.createParameter("activity_log_id", org.jooq.impl.SQLDataType.BIGINT, false, false);

    /**
     * Create a new routine call instance
     */
    public CreateLexemeActivityLogAndBindings() {
        super("create_lexeme_activity_log_and_bindings", Public.PUBLIC);

        addInParameter(OWNER_LEXEME_ID);
        addInParameter(ACTIVITY_LOG_ID);
    }

    /**
     * Set the <code>owner_lexeme_id</code> parameter IN value to the routine
     */
    public void setOwnerLexemeId(Long value) {
        setValue(OWNER_LEXEME_ID, value);
    }

    /**
     * Set the <code>activity_log_id</code> parameter IN value to the routine
     */
    public void setActivityLogId(Long value) {
        setValue(ACTIVITY_LOG_ID, value);
    }
}