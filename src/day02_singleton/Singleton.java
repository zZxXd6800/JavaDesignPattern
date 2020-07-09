package day02_singleton;

/**
 * 采取一定的方法，保证在整个软件系统中，对某个类只能存在一个对象实例，并且该类只提供一个取得其对象实例的方法（静态方法）
 * 8种写法：
 *      a.饿汉式：静态常量（可用，jdk中的Runtime使用的方式）/静态代码块（可用）
 *      b.懒汉式：线程不安全（不可用）/同步方法（不推荐）/同步代码块（不可用）
 *      c.双重检查（推荐）
 *      d.静态内部类（推荐）
 *      e.枚举（推荐）
 * 使用场景：
 *      a.需要频繁进行创建和销毁的对象；
 *      b.创建时耗时或耗费资源过多但又经常用到的对象（工具类对象/频繁访问数据库或文件的对象）；
 */
public class Singleton {
    /**
     * 1.保证系统内存中该类的对象实例只存在一个，节省了系统资源
     * 2.对于需要频繁创建和销毁的对象，使用单例可以提高系统性能
     * 3.需要实例化一个单例类的时候，必须使用相应的获取类的方法，而不是new
     */
}