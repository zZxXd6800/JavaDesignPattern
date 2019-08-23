package day3_simple_factory.pizza;

public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("prepare for Cheese pizza...");
    }
}
