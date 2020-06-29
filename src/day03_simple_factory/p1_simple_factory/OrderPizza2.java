package day03_simple_factory.p1_simple_factory;

import day03_simple_factory.pizza.Pizza;

import static day03_simple_factory.Customer.getType;

public class OrderPizza2 {
    public OrderPizza2() {
        System.out.println("SimpleFactory:");
        Pizza pizza;
        do {
            pizza = SimpleFactory.createPizza(getType());

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
