package day10_decorator.component;

import day10_decorator.Drink;

public class Coffee extends Drink {
    @Override
    public float cost() {
        return super.getPrice();
    }

    @Override
    public String getDes() {
        return super.getDes() + super.getPrice();
    }
}
