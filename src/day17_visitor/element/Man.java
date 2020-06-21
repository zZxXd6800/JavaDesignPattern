package day17_visitor.element;

import day17_visitor.visitor.Action;

/**
 * @author zhuxu
 * @date 2020/6/19 16:52
 */
public class Man extends Person {
    public Man(String name) {
        super(name);
    }

    /**
     * 双分派：
     *  - 首先在客户端程序中，将具体状态作为参数传递给Man
     *  - Man类对象调用作为参数的具体方法 action.getManResult(Man man), 将自己this作为参数传递给该方法
     */
    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }
}
