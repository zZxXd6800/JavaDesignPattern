package day04_factory_method.pizza;

public class SHCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("SHCheesePizza");
        System.out.println("prepare for Shanghai Cheese Pizza...");
    }
}
