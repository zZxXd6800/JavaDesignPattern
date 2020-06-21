package day15_template_method;

/**
 * 抽象类，实现了子类共有的方法
 */
public abstract class SoyMilk {
    /**
     * 模板方法，定义了豆浆的制作流程
     * 声明为final方法，防止子类重写该方法
     */
    public final void make() {
        select();
        if (addCondiments()) {
            add();
        }
        soak();
        beat();
    }

    // 钩子方法，判断是否需要添加配料
    protected boolean addCondiments() {
        return true;
    }

    protected void select() {
        System.out.println("step1: select soy...");
    }

    protected abstract void add();

    protected void soak() {
        System.out.println("step3: soak soy...");
    }

    protected void beat() {
        System.out.println("step4: beat soy...");
    }
}
