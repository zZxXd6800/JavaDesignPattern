package day10_decorator.decorator;

import day10_decorator.Drink;

public class Chocolate extends Decorator {
    public Chocolate(Drink obj) {
        super(obj);
        setDes("Chocolate");
        setPrice(3.0f);
    }
}
