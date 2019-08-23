package day4_factory_method.order;

import day4_factory_method.pizza.Pizza;
import day4_factory_method.pizza.SHCheesePizza;
import day4_factory_method.pizza.SHPepperPizza;

public class SHOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;

        if (orderType.equals("cheese")) {
            pizza = new SHCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new SHPepperPizza();
        }

        return pizza;
    }
}
