package day4_factory_method.pizza;

public class SHPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("SHPepperPizza");
        System.out.println("prepare for Shanghai Pepper Pizza...");
    }
}
