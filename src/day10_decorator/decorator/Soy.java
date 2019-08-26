package day10_decorator.decorator;

import day10_decorator.Drink;

public class Soy extends Decorator {
    public Soy(Drink obj) {
        super(obj);
        setDes("Soy");
        setPrice(1.5f);
    }
}
