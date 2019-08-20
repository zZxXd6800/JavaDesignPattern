package day1_design_principles.p4_liskov_substitution;

public class LiskovSubstitution2 {
    public static void main(String[] args) {
        A2 a = new A2();
        System.out.println("11 - 3 = "+ a.fun1(11, 3));
        System.out.println("1 - 8 = "+ a.fun1(1, 8));

        System.out.println("--------------------");

        B2 b = new B2();
        System.out.println("11 + 3 = "+ b.fun1(11, 3));
        System.out.println("1 + 8 = "+ b.fun1(1, 8));
        System.out.println("11 + 3 + 9 = "+ b.fun2(11, 3));

        //通过组合使B类仍然可以使用到A类的方法
        System.out.println("11 - 3 = " + b.fun3(11, 3));
    }
}

/**
 * 创建一个更加基础的Base类
 * 把更加基础的成员和方法写在Base类中
 */
class Base {
}

class A2 extends Base {
    public int fun1(int num1, int num2) {
        return num1- num2;
    }
}

class B2 extends Base {
    /**
     * 如果B类需要使用A类的方法，可以使用组合的方式
     */
    private A2 a = new A2();

    public int fun1(int num1, int num2) {
        return num1 + num2;
    }

    public int fun2(int num1, int num2) {
        return fun1(num1, num2) + 9;
    }

    public int fun3(int num1, int num2) {
        return a.fun1(num1, num2);
    }
}