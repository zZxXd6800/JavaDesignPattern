package day21_memento;

/**
 * 备忘录：在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态，以便以后当需要时能将该对象恢复到原先保存的状态
 *  - 给用户提供了一种可以恢复状态的机制，使用户可以比较方便地回到某个历史的状态
 *  - 实现了信息的封装，用户不需要关心状态的保存细节
 *  - 如果类的成员变量过多会占用较大的资源，每一次保存都会消耗一定的内存；为了节约内存可以和原型模式配合使用
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
