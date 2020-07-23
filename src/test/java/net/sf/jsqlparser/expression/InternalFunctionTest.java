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
public class InternalFunctionTest {

    @Test
    public void leftFn() throws JSQLParserException {
        Statements expr = CCJSqlParserUtil.parseStatements("select BAR('x' in foo) from foo");  // 'x' in foo
        assertNotNull(expr);
    }
}
