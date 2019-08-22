package day1_design_principle.p2_interface_segregation;

/**
 * 类A通过接口Interface依赖类B，类C通过接口Interface依赖类D，
 * 但Interface对于A和C来说不是最小接口，B和D必须实现他们不需要的方法
 */
public class InterfaceSegregation1 {
    public static void main(String[] args) {
        A1 a = new A1();
        Interface i = new B1();
        a.depend1(i);
        a.depend2(i);
        a.depend3(i);

        C1 c = new C1();
        i = new D1();
        c.depend1(i);
        c.depend4(i);
        c.depend5(i);
    }
}

/**
 * 接口
 */
interface Interface {
    void operation1();
    void operation2();
    void operation3();
    void operation4();
    void operation5();
}

class B1 implements Interface {

    @Override
    public void operation1() {
        System.out.println("B implements operation1");
    }

    @Override
    public void operation2() {
        System.out.println("B implements operation2");
    }

    @Override
    public void operation3() {
        System.out.println("B implements operation3");
    }

    @Override
    public void operation4() {
        System.out.println("B implements operation4");
    }

    @Override
    public void operation5() {
        System.out.println("B implements operation5");
    }
}

class D1 implements Interface {

    @Override
    public void operation1() {
        System.out.println("D implements operation1");
    }

    @Override
    public void operation2() {
        System.out.println("D implements operation2");
    }

    @Override
    public void operation3() {
        System.out.println("D implements operation3");
    }

    @Override
    public void operation4() {
        System.out.println("D implements operation4");
    }

    @Override
    public void operation5() {
        System.out.println("D implements operation5");
    }
}

/**
 * A类通过接口Interface1依赖（使用）B类，但是只会用到1、2、3方法
 */
class A1 {
    public void depend1(Interface i) {
        i.operation1();
    }

    public void depend2(Interface i) {
        i.operation2();
    }

    public void depend3(Interface i) {
        i.operation3();
    }
}

/**
 * C类通过接口Interface1依赖（使用）D类，但是只会用到1、4、5方法
 */
class C1 {
    public void depend1(Interface i) {
        i.operation1();
    }

    public void depend4(Interface i) {
        i.operation4();
    }

    public void depend5(Interface i) {
        i.operation5();
    }
}
