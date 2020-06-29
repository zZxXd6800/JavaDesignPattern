package day01_design_principle.p2_interface_segregation;

/**
 * 根据接口隔离原则，将接口Interface拆分成几个接口，类A和C分别与他们需要的接口建立依赖关系
 */
public class InterfaceSegregation2 {
    public static void main(String[] args) {
        A2 a = new A2();
        B2 b= new B2();
        a.depend1(b);
        a.depend2(b);
        a.depend3(b);

        C2 c = new C2();
        D2 d = new D2();
        c.depend1(d);
        c.depend4(d);
        c.depend5(d);
    }
}

/**
 * 接口1
 */
interface Interface1 {
    void operation1();
}

/**
 * 接口2
 */
interface Interface2 {
    void operation2();
    void operation3();
}

/**
 * 接口3
 */
interface Interface3 {
    void operation4();
    void operation5();
}

class B2 implements Interface1, Interface2 {

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
}

class D2 implements Interface1, Interface3 {

    @Override
    public void operation1() {
        System.out.println("D implements operation1");
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
 * A类通过接口Interface1和Interface2依赖（使用）B类
 */
class A2 {
    public void depend1(Interface1 i) {
        i.operation1();
    }

    public void depend2(Interface2 i) {
        i.operation2();
    }

    public void depend3(Interface2 i) {
        i.operation3();
    }
}

/**
 * C类通过接口Interface1和Interface3依赖（使用）D类
 */
class C2 {
    public void depend1(Interface1 i) {
        i.operation1();
    }

    public void depend4(Interface3 i) {
        i.operation4();
    }

    public void depend5(Interface3 i) {
        i.operation5();
    }
}