package day15_template_method;

/**
 * 具体子类3，不需要添加配料
 */
public class PureSoyMilk extends SoyMilk {
    @Override
    protected void add() {
        // 空实现
    }

    @Override
    protected boolean addCondiments() {
        return false;
    }
}
