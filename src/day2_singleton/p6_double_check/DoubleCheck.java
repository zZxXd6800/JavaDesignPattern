package day2_singleton.p6_double_check;

/**
 * 双重检查：线程安全、延迟加载、效率高，推荐使用
 *
 */
public class DoubleCheck {
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
    /**
     * volatile关键字使对instance的修改可以立即更新到主存
     */
    private static volatile Singleton instance;

    private Singleton() {}

    /**
     * 双重检查解决线程安全和懒加载问题，同时保证效率
     */
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}