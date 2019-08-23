package day5_abstract_factory.order;

import day5_abstract_factory.pizza.Pizza;

public interface AbsFactory {
    /**
     * 由工厂子类提供具体的实现
     */
    Pizza createPizza(String orderType);
}
