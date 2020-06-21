package day24_strategy.context;

import day24_strategy.strategy.GoodFly;

/**
 * @author zhuxu
 * @date 2020/6/21 17:14
 */
public class WildDuck extends Duck {
    public WildDuck() {
        super(new GoodFly());
    }

    @Override
    public void display() {
        System.out.print("wild duck -- ");
        fly();
    }
}
