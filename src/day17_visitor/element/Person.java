package day17_visitor.element;

import day17_visitor.visitor.Action;

/**
 * @author zhuxu
 * @date 2020/6/19 16:51
 */
public abstract class Person {
    private String name;

    public abstract void accept(Action action);

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
