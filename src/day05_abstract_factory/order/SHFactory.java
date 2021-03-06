package day05_abstract_factory.order;

import day05_abstract_factory.pizza.Pizza;
import day05_abstract_factory.pizza.SHCheesePizza;
import day05_abstract_factory.pizza.SHPepperPizza;

public class SHFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;

        if (orderType.equals("cheese")) {
            pizza = new SHCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new SHPepperPizza();
        }

        return pizza;
    }
}
