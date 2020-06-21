package day17_visitor.visitor;

import day17_visitor.element.Man;
import day17_visitor.element.Woman;

/**
 * @author zhuxu
 * @date 2020/6/19 17:10
 */
public class Wait extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println(man.getName() + " with wait...");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println(woman.getName() + " with wait...");
    }
}
