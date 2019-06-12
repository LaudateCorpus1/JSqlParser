/*-
 * #%L
 * JSQLParser library
 * %%
 * Copyright (C) 2004 - 2019 JSQLParser
 * %%
 * Dual licensed under GNU LGPL 2.1 or Apache License 2.0
 * #L%
 */
package net.sf.jsqlparser.expression.operators.relational;

import net.sf.jsqlparser.expression.Expression;
import net.sf.jsqlparser.expression.ExpressionVisitor;
import net.sf.jsqlparser.parser.ASTNodeAccessImpl;

public class IsFalseExpression extends ASTNodeAccessImpl implements Expression {

  private Expression leftExpression;
  private boolean not = false;
  private boolean useIsFalse = false;

  public Expression getLeftExpression() {
    return leftExpression;
  }

  public boolean isNot() {
    return not;
  }

  public void setLeftExpression(Expression expression) {
    leftExpression = expression;
  }

  public void setNot(boolean b) {
    not = b;
  }

  public boolean isUseIsFalse() {
    return useIsFalse;
  }

  public void setUseIsFalse(boolean useIsFalse) {
    this.useIsFalse = useIsFalse;
  }

  @Override
  public void accept(ExpressionVisitor expressionVisitor) {
    expressionVisitor.visit(this);
  }

  @Override
  public String toString() {
    if (isUseIsFalse()) {
      return leftExpression + (not ? " NOT" : "") + " IS FALSE";
    } else {
      return leftExpression + " IS " + (not ? "NOT " : "") + "FALSE";
    }
  }
}
