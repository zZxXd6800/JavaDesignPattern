package day22_interpreter;

import java.util.HashMap;

/**
 * 终结符表达式：
 */
public class VarExpression extends Expression {
    private String key;

    public VarExpression(String key) {
        this.key = key;
    }

    @Override
    public int interpret(HashMap<String, Integer> var) {
        return var.get(key);
    }
}
