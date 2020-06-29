package day04_factory_method.pizza;

public class BJPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("BJPepperPizza");
        System.out.println("prepare for Beijing Pepper Pizza...");
    }
}
