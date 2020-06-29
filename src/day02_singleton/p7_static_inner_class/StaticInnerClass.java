package day02_singleton.p7_static_inner_class;

/**
 * 静态内部类：推荐使用
 *      1.当外部类被装载时，静态内部类并不会被装载，保证懒加载
 *      2.当调用getInstance()方法时SingletonInstance才被装载，且只装载一次，线程安全
 */
public class StaticInnerClass {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        //always true
        System.out.println(singleton1 == singleton2);

        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }
}

class Singleton {

    private Singleton() {}

    /**
     * 静态内部类，包含一个静态成员变量，利用类装载机制保证线程安全和延迟加载
     */
    private static class SingletonInstance{
        private static final Singleton instance = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonInstance.instance;
    }
}