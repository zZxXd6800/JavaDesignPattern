package day15_template_method;

/**
 * 具体子类1，实现子类1特有的方法
 */
public class RedBeanSoyMilk extends SoyMilk {
    @Override
    protected void add() {
        System.out.println("step2: add red bean...");
    }
}
