package day5_abstract_factory.pizza;

public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("BJCheesePizza");
        System.out.println("prepare for Beijing Cheese Pizza...");
    }
}
