package day10_decorator.decorator;

import day10_decorator.Drink;

public class Milk extends Decorator {
    public Milk(Drink obj) {
        super(obj);
        setDes("Milk");
        setPrice(2.0f);
    }
}
