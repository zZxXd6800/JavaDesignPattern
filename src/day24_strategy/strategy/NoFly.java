package day24_strategy.strategy;

/**
 * @author zhuxu
 * @date 2020/6/21 17:12
 */
public class NoFly implements Fly {
    @Override
    public void fly() {
        System.out.println("no fly behavior...");
    }
}
