package day5_abstract_factory.order;

import day5_abstract_factory.pizza.BJCheesePizza;
import day5_abstract_factory.pizza.BJPepperPizza;
import day5_abstract_factory.pizza.Pizza;

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
