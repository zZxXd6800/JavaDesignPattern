package day1_design_principles.p3_dependency_inversion.transitive_dependency;

/**
 * 通过Setter传递依赖
 */
public class BySetter {
    public static void main(String[] args) {
        OpenAndClose3 oc3 = new OpenAndClose3();
        oc3.setTV(new OneTV3());
        oc3.open();
    }
}

interface IOpenAndClose3 {
    void open();
    void setTV(ITV3 tv);
}

interface ITV3 {
    void play();
}

class OpenAndClose3 implements IOpenAndClose3 {
    private ITV3 tv;

    @Override
    public void open() {
        tv.play();
    }

    @Override
    public void setTV(ITV3 tv) {
        this.tv = tv;
    }
}

class OneTV3 implements ITV3 {
    @Override
    public void play() {
        System.out.println("OneTV3 open.");
    }
}