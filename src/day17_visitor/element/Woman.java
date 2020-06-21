package day17_visitor.element;

import day17_visitor.visitor.Action;

/**
 * @author zhuxu
 * @date 2020/6/19 16:52
 */
public class Woman extends Person {
    public Woman(String name) {
        super(name);
    }

    @Override
    public void accept(Action action) {
        action.getWomanResult(this);
    }
}
