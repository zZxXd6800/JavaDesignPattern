package day24_strategy;

import day24_strategy.context.Duck;
import day24_strategy.context.ToyDuck;
import day24_strategy.context.WildDuck;

/**
 * 策略：定义了一系列算法，并将每个算法封装起来，使它们可以相互替换，且算法的变化不会影响使用算法的客户
 *  通过对算法进行封装，把使用算法的责任和算法的实现分割开来，并委派给不同的对象对这些算法进行管理
 *  策略模式的重心不是如何实现算法，而是如何组织这些算法，从而让程序结构更加灵活，具有更好的维护性和扩展性
 *  源码：Arrays, Collection
 */
public interface Strategy {
    public static void main(String[] args) {
        Duck wild = new WildDuck();
        wild.display();

        Duck toy = new ToyDuck();
        toy.display();
    }
}
