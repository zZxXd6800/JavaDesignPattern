package day05_abstract_factory.pizza;

public class SHCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("SHCheesePizza");
        System.out.println("prepare for Shanghai Cheese Pizza...");
    }
}
