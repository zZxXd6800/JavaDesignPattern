package day20_mediator;

/**
 * 中介者：用中介对象封装一系列的对象交互，使各个对象不需要显示地相互引用，使其松耦合从而可以独立地改变他们之间的交互
 * 在MVC中Controller是Model和View的中介者
 * @author zhuxu
 * @date 2020/6/20 21:39
 */
public abstract class Mediator {
    public abstract void register(Colleague colleague);
    public abstract void relay(Colleague colleague);
}
