package day10_decorator;

import day10_decorator.component.LongBlack;
import day10_decorator.decorator.Chocolate;
import day10_decorator.decorator.Milk;
import day10_decorator.decorator.Soy;

/**
 * 装饰者模式：动态地将新功能附加到对象上，在对象功能拓展方面，比继承更有弹性，体现了开闭原则
 * 若需要增加一种新式咖啡，只需要继承Coffee即可，其他代码并不需要修改，拓展性好
 */
public class Client {
    public static void main(String[] args) {
        Drink drink = new LongBlack();
        System.out.println(drink.getDes() + "=" + drink.cost());
        System.out.println("----------------------------------------");

        drink = new Milk(drink);
        System.out.println(drink.getDes() + "=" + drink.cost());
        System.out.println("----------------------------------------");

        drink = new Chocolate(drink);
        System.out.println(drink.getDes() + "=" + drink.cost());
        System.out.println("----------------------------------------");

        drink = new Chocolate(drink);
        System.out.println(drink.getDes() + "=" + drink.cost());
        System.out.println("----------------------------------------");

        drink = new Soy(drink);
        System.out.println(drink.getDes() + "=" + drink.cost());
    }
}
