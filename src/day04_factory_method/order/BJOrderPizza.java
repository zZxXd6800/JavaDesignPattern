package day04_factory_method.order;

import day04_factory_method.pizza.BJCheesePizza;
import day04_factory_method.pizza.BJPepperPizza;
import day04_factory_method.pizza.Pizza;

public class BJOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;

        if (orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }

        return pizza;
    }
}
