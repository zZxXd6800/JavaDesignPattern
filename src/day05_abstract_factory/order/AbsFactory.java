package day05_abstract_factory.order;

import day05_abstract_factory.pizza.Pizza;

public interface AbsFactory {
    /**
     * 由工厂子类提供具体的实现
     */
    Pizza createPizza(String orderType);
}
