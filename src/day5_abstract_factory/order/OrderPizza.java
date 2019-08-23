package day5_abstract_factory.order;

import day5_abstract_factory.pizza.Pizza;

import static day5_abstract_factory.AbstractFactory.getType;

public class OrderPizza {

    public OrderPizza(AbsFactory factory) {
        System.out.println("Abstract Factory:");
        Pizza pizza;
        do {
            //抽象方法，由工厂子类完成
            pizza = factory.createPizza(getType());

            if (pizza == null) {
                System.out.println("no such pizza");
                break;
            } else {
                //输出Pizza制作过程
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }
        } while (true);
    }
}
