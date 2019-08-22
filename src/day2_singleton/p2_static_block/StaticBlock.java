package day2_singleton.p2_static_block;

/**
 * 饿汉式2静态代码块
 * 步骤：
 *      1.构造器私有化，防止通过new得到对象实例
 *      2.在静态代码块中创建对象
 *      3.向外暴露一个静态的公共方法getInstance
 * 优点：
 *      1.写法简单
 *      2.在类装载的时候就完成实例化，避免了线程同步问题
 * 缺点：
 *      在类装载的时候就完成实例化，没有达到懒加载（Lazy Loading）的效果，如果自始至终从未使用这个实例，就会造成内存的浪费
 *      （如果是调用getInstance时导致类装载则OK，但也有可能是通过其他的静态方法导致类装载）
 *
 * 将类实例化的过程放在了静态代码块中，当类加载的时候就会执行静态代码块中的代码完成类的实例化
 */
public class StaticBlock {
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
     * 2.在静态代码块中创建对象
     */
    private static final Singleton instance;

    static {
        instance = new Singleton();
    }

    /**
     * 1.构造器私有化
     */
    private Singleton() {}

    /**
     * 3.提供一个公有的静态方法返回对象实例
     * @return 对象实例
     */
    public static Singleton getInstance() {
        return instance;
    }
}