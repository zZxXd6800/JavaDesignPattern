package day3_simple_factory.p0_example;

import day3_simple_factory.pizza.CheesePizza;
import day3_simple_factory.pizza.GreekPizza;
import day3_simple_factory.pizza.PepperPizza;
import day3_simple_factory.pizza.Pizza;

import static day3_simple_factory.Customer.getType;

/**
 * 当需要增加一个PepperPizza类时，需要对所有初始化Pizza的地方都进行修改（所有的OrderPizza），违反了开闭原则
 * 改进：把创建Pizza对象封装到一个类中，当需要增加Pizza种类时只用修改该类即可，其他创建Pizza对象的代码不需要修改（简单工厂模式）
 */
public class OrderPizza1 {
    public OrderPizza1() {
        System.out.println("Example:");
        Pizza pizza;
        do {
            String orderType = getType();

            if (orderType.equals("cheese")) {
                pizza = new CheesePizza();
                pizza.setName("Cheese Pizza");
            } else if (orderType.equals("greek")) {
                pizza = new GreekPizza();
                pizza.setName("Greek Pizza");
            } else if (orderType.equals("pepper")) {
                //新增PepperPizza
                pizza = new PepperPizza();
                pizza.setName("Pepper Pizza");
            } else {
                System.out.println("no such pizza");
                break;
            }

            //输出Pizza制作过程
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
    }
}
