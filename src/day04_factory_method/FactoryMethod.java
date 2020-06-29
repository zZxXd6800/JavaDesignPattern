package day04_factory_method;

import day04_factory_method.order.BJOrderPizza;
import day04_factory_method.order.SHOrderPizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 定义一个创建对象的抽象方法，由子类决定要实例化哪个类，也就是将对象的实例化推迟到子类中进行
 */
public class FactoryMethod {
    public static void main(String[] args) {
        System.out.println("Beijing");
        new BJOrderPizza();

        System.out.println("Shanghai");
        new SHOrderPizza();
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
