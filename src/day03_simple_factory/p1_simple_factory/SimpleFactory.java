package day03_simple_factory.p1_simple_factory;

import day03_simple_factory.pizza.CheesePizza;
import day03_simple_factory.pizza.GreekPizza;
import day03_simple_factory.pizza.PepperPizza;
import day03_simple_factory.pizza.Pizza;

/**
 * 简单工厂模式：创建型，属于工厂模式的一种，由一个工厂对象决定创建哪一种产品的实例
 * 当需要大量创建某种、某类或者某批对象时，定义一个创建对象的类，由这个类来封装实例化对象的行为
 */
public class SimpleFactory {

    /**
     * 根据orderType返回对应的Pizza对象
     */
    public static Pizza createPizza(String orderType) {
        Pizza pizza = null;

        if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("Cheese Pizza");
        } else if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("Greek Pizza");
        } else if (orderType.equals("pepper")) {
            //新增PepperPizza
            pizza = new PepperPizza();
            pizza.setName("Pepper Pizza");
        }

        return pizza;
    }
}
