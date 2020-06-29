package day02_singleton.p3_thread_unsafe;

/**
 * 懒汉式1线程不安全，在实际开发中不能用这种方式
 * 优点：起到了懒加载的效果，但只能在单线程下使用
 * 缺点：在多线程下，如果一个线程进入if (instance == null)判断语句块然后另一个线程开始执行，这时就会产生多个实例
 */
public class ThreadUnsafe {
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
     */
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
