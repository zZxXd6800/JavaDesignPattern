package day8_adapter.p3_interface_adapter;

/**
 * 接口适配器模式：也叫缺省适配器模式(default adapter pattern)，当不需要全部实现接口的方法时，可以先设计一个抽象类实现接口
 * 并为该接口中每一个方法提供一个默认实现（空方法），那么该抽象类的子类可以选择性的覆盖父类的某些方法来实现需求
 */
public class InterfaceAdapter {
    public static void main(String[] args) {
        /**
         * 只关心method1方法，覆盖掉父类的method1()即可
         */
        AbsAdapter adapter = new AbsAdapter(){
            @Override
            public void method1() {
                System.out.println("override method 1...");
            }
        };

        adapter.method1();
        adapter.method2();
        adapter.method3();
        adapter.method4();
    }
}
