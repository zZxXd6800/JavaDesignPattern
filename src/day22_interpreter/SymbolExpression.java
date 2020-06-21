package day22_interpreter;

import java.util.HashMap;

/**
 * 非终结符表达式：
 */
public abstract class SymbolExpression extends Expression {
    protected Expression left;
    protected Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public abstract int interpret(HashMap<String, Integer> var);
}
