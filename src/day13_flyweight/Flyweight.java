package day13_flyweight;

/**
 * 享元模式：也叫蝇量模式，运用共享技术有效的支持大量细粒度的对象，常用于系统低层开发，解决系统的性能问题（jdk中Integer.valueOf()）
 * 可以解决重复对象浪费内存的问题，当系统中有大量相似对象需要缓冲池时，不需要总是创建新的对象，可以直接从缓冲池中获取，降低系统内存提高效率
 * String常量池、数据库连接池、缓冲池等都是享元模式的应用
 *
 * 内部状态：指对象共享出来的信息，存储在享元对象内部，且不会随环境的改变而改变
 * 外部状态：指对象得以依赖的一个标记，是随环境改变而变化的、不可共享的信息
 */
public class Flyweight {
    public static void main(String[] args) {
        WebsiteFactory factory = new WebsiteFactory();

        Website website1 = factory.getWebsite("news");
        website1.use(new WebsiteUser().setName("CCTV"));

        Website website2 = factory.getWebsite("blog");
        website2.use(new WebsiteUser().setName("weibo"));

        Website website3 = factory.getWebsite("news");
        website3.use(new WebsiteUser().setName("xinlang"));

        System.out.println("Website Count: " + factory.getWebsiteCount());
    }
}
