package day4_factory_method.pizza;

public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("BJCheesePizza");
        System.out.println("prepare for Beijing Cheese Pizza...");
    }
}
