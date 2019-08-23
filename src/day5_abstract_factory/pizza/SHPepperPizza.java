package day5_abstract_factory.pizza;

public class SHPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("SHPepperPizza");
        System.out.println("prepare for Shanghai Pepper Pizza...");
    }
}
