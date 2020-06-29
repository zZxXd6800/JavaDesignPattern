package day05_abstract_factory;

import day05_abstract_factory.order.BJFactory;
import day05_abstract_factory.order.OrderPizza;
import day05_abstract_factory.order.SHFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 抽象工厂模式：定义一个接口用于创建相关的或有依赖关系的对象簇而无需指明具体的类
 * 将工厂抽象成两层，即抽象工厂AbsFactory和具体实现的工厂子类FactoryImpl，根据要创建的对象类型选择对应的工厂子类
 * 将单个的简单工厂变成了工厂簇，更利于代码的维护和拓展
 */
public class AbstractFactory {
    public static void main(String[] args) {
        System.out.println("Beijing");
        new OrderPizza(new BJFactory());

        System.out.println("Shanghai");
        new OrderPizza(new SHFactory());
    }

    public static String getType() {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza category: ");
            String str = in.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
