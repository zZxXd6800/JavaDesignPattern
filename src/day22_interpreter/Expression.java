package day22_interpreter;

import java.util.HashMap;

/**
 * 抽象表达式：通过 HashMap 获取变量的值
 */
public abstract class Expression {
    public abstract int interpret(HashMap<String, Integer> var);
}
