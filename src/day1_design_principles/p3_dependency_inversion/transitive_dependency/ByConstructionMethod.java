package day1_design_principles.p3_dependency_inversion.transitive_dependency;

/**
 * 通过构造方法传递依赖
 */
public class ByConstructionMethod {
    public static void main(String[] args) {
        OpenAndClose2 oc2 = new OpenAndClose2(new OneTV2());
        oc2.open();
    }
}

interface IOpenAndClose2 {
    void open();
}

interface ITV2 {
    void play();
}

class OpenAndClose2 implements IOpenAndClose2 {
    private ITV2 tv;

    OpenAndClose2(ITV2 tv) {
        this.tv = tv;
    }

    @Override
    public void open() {
        this.tv.play();
    }
}

class OneTV2 implements ITV2 {
    @Override
    public void play() {
        System.out.println("OneTV2 open.");
    }
}