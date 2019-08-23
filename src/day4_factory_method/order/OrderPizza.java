package day4_factory_method.order;

import day4_factory_method.pizza.Pizza;

import static day4_factory_method.FactoryMethod.getType;

public abstract class OrderPizza {

    /**
     * 定义一个抽象方法createPizza(String orderType)让各个工厂子类实现
     */
    abstract Pizza createPizza(String orderType);

    public OrderPizza() {
        System.out.println("Factory Method:");
        Pizza pizza;
        do {
            //抽象方法，由工厂子类完成
            pizza = createPizza(getType());

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
