package day05_abstract_factory.order;

import day05_abstract_factory.pizza.BJCheesePizza;
import day05_abstract_factory.pizza.BJPepperPizza;
import day05_abstract_factory.pizza.Pizza;

public class BJFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;

        if (orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }

        return pizza;
    }
}
