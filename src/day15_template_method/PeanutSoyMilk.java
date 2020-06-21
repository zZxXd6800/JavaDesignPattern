package day15_template_method;

/**
 * 具体子类2，实现子类2特有的方法
 */
public class PeanutSoyMilk extends SoyMilk {
    @Override
    protected void add() {
        System.out.println("step2: add peanut...");
    }
}
