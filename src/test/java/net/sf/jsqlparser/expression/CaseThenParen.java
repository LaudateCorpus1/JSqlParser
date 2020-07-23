/*-
 * #%L
 * JSQLParser library
 * %%
 * Copyright (C) 2004 - 2019 JSQLParser
 * %%
 * Dual licensed under GNU LGPL 2.1 or Apache License 2.0
 * #L%
 */
package net.sf.jsqlparser.expression;

import net.sf.jsqlparser.JSQLParserException;
import net.sf.jsqlparser.parser.CCJSqlParserUtil;
import net.sf.jsqlparser.statement.Statements;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 *
 * @author tw
 */
public class CaseThenParen {

    @Test
    public void caseThenParen() throws JSQLParserException {
        Statements expr = CCJSqlParserUtil.parseStatements("select * from y where CASE WHEN z THEN (x OR y) END");
        assertNotNull(expr);
    }
}
