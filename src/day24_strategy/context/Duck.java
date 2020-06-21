package day24_strategy.context;

import day24_strategy.strategy.Fly;

/**
 * @author zhuxu
 * @date 2020/6/21 17:13
 */
public abstract class Duck {
    protected Fly fly;

    public abstract void display();

    public Duck(Fly fly) {
        this.fly = fly;
    }

    public void fly() {
        if (fly != null) {
            fly.fly();
        }
    }
}
