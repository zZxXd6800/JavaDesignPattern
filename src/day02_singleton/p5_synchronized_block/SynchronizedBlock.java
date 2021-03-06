package day02_singleton.p5_synchronized_block;

/**
 * 懒汉式3同步代码块，线程不安全，在实际开发中不能用这种方式
 * 在多线程下，如果一个线程进入if (instance == null)判断语句块然后另一个线程开始执行，这时就会产生多个实例
 */
public class SynchronizedBlock {
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
     * 用synchronized同步代码块
     */
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                instance = new Singleton();
            }
        }
        return instance;
    }

    /**
     * 类似于懒汉式2同步方法，线程安全，但每个线程在执行getInstance方法获取实例时都需要同步，效率太低
     * 用synchronized代码块包装 if(instance == null) 条件
     */
    public static Singleton getInstance1() {
        synchronized (Singleton.class) {
            if (instance == null) {
                instance = new Singleton();
            }
        }
        return instance;
    }
}