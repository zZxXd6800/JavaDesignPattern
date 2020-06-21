package day24_strategy.context;

import day24_strategy.strategy.NoFly;

/**
 * @author zhuxu
 * @date 2020/6/21 17:13
 */
public class ToyDuck extends Duck {
    public ToyDuck() {
        super(new NoFly());
    }

    @Override
    public void display() {
        System.out.print("toy duck -- ");
        fly();
    }
}
