package day01_design_principle.p4_liskov_substitution;

public class LiskovSubstitution1 {
    public static void main(String[] args) {
        A1 a = new A1();
        System.out.println("11 - 3 = "+ a.fun1(11, 3));
        System.out.println("1 - 8 = "+ a.fun1(1, 8));

        System.out.println("--------------------");

        B1 b = new B1();
        System.out.println("11 - 3 = "+ b.fun1(11, 3));
        System.out.println("1 - 8 = "+ b.fun1(1, 8));
        System.out.println("11 + 3 + 9 = "+ b.fun2(11, 3));
    }
}

class A1 {
    public int fun1(int num1, int num2) {
        return num1- num2;
    }
}

class B1 extends A1 {
    /**
     * 重写了父类中的方法
     */
    @Override
    public int fun1(int num1, int num2) {
        return num1 + num2;
    }

    /**
     * 子类中新增的方法
     */
    public int fun2(int num1, int num2) {
        return fun1(num1, num2) + 9;
    }
}