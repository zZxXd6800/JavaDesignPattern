package day03_simple_factory.pizza;

public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("prepare for Greek pizza...");
    }
}
