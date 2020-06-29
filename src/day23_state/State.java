package day23_state;

/**
 * 状态：主要用来解决对象在多种状态转换时需要对外输出不同行为的问题；状态和行为一一对应，状态之间可以相互转换，当一个对象的内在状态改变时允许改变其行为
 * 源码：多线程：New -> Runnable -> Running -> Blocked -> Stop
 */
public interface State {
    // 扣除积分
    void deductMoney();
    // 是否中奖
    boolean raffle();
    // 发放奖品
    void dispensePrize();
}
