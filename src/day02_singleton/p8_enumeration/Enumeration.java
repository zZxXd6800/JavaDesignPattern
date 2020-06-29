package day02_singleton.p8_enumeration;

/**
 * 利用枚举，不仅能避免多线程同步问题，而且还可以防止反序列化重新创建新的对象
 * 《Effective Java》中推荐使用的方法
 */
public class Enumeration {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.INSTANCE;
        Singleton singleton2 = Singleton.INSTANCE;

        //always true
        System.out.println(singleton1 == singleton2);

        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }
}

enum Singleton {
    INSTANCE
}