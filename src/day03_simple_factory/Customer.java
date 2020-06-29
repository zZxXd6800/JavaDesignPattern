package day03_simple_factory;

import day03_simple_factory.p0_example.OrderPizza1;
import day03_simple_factory.p1_simple_factory.OrderPizza2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Customer {
    public static void main(String[] args) {
        //example
        new OrderPizza1();

        //简单工厂模式
        new OrderPizza2();
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
