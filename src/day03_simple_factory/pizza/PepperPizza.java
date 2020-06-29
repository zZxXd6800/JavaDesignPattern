package day03_simple_factory.pizza;

public class PepperPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("prepare for Pepper pizza...");
    }
}
