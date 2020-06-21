package day17_visitor.visitor;

import day17_visitor.element.Man;
import day17_visitor.element.Woman;

/**
 * @author zhuxu
 * @date 2020/6/19 16:51
 */
public abstract class Action {
    public abstract void getManResult(Man man);
    public abstract void getWomanResult(Woman woman);
}
