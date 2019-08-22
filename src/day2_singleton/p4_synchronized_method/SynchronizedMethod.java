package day2_singleton.p4_synchronized_method;

/**
 * 懒汉式2同步方法，线程安全，在实际开发中效率太低，不推荐使用
 * 优点：解决了线程安全问题
 * 缺点：效率太低，每个线程在执行getInstance方法获取实例时都需要同步，
 *      而实例化的代码其实只用执行一次，后面想获取示例时直接return就行了
 */
public class SynchronizedMethod {
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
    private static Singleton instance;

    private Singleton() {}

    /**
     * 提供一个静态的公有方法，当调用到该方法时才去创建instance
     * 加入synchronized关键字解决线程安全问题
     */
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}