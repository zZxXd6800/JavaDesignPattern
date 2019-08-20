package day1_design_principles.p3_dependency_inversion.transitive_dependency;

/**
 * 通过接口传递依赖
 */
public class ByInterface {
    public static void main(String[] args) {
        OpenAndClose1 oc1 = new OpenAndClose1();
        oc1.open(new OneTV1());
    }
}

interface IOpenAndClose1 {
    void open(ITV1 tv);
}

interface ITV1 {
    void play();
}

class OpenAndClose1 implements IOpenAndClose1 {
    @Override
    public void open(ITV1 tv) {
        tv.play();
    }
}

class OneTV1 implements ITV1 {
    @Override
    public void play() {
        System.out.println("OneTV1 open.");
    }
}