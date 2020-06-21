package day22_interpreter;

import java.util.HashMap;

/**
 * @author zhuxu
 * @date 2020/6/21 14:00
 */
public class SubExpression extends SymbolExpression {
    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpret(HashMap<String, Integer> var) {
        return left.interpret(var) - right.interpret(var);
    }
}
