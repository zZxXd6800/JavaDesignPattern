package day08_adapter.p3_interface_adapter;

public abstract class AbsAdapter implements IInterface {
    @Override
    public void method1() {
        System.out.println("default method 1...");
    }

    @Override
    public void method2() {
        System.out.println("default method 2...");
    }

    @Override
    public void method3() {
        System.out.println("default method 3...");
    }

    @Override
    public void method4() {
        System.out.println("default method 4...");
    }
}
