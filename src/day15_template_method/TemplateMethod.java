package day15_template_method;

/**
 * 模板方法：在一个抽象类中公开定义了执行方法的模板，子类按需重写方法的实现，调用以抽象类中定义的方式执行
 * 定义一个操作中算法的框架，将一些步骤延迟到子类中实现，使得子类不改变算法的结构就可以重定义该算法的某些特定步骤
 * 源码：AbstractQueuedSynchronizer(抽象类): acquire(int arg); release(int arg)
 *      ReentrantLock.Sync(具体子类): tryAcquire(int acquires); tryRelease(int releases)
 *      ReentrantLock(客户端): lock(); unlock()
 */
public class TemplateMethod {
    public static void main(String[] args) {
        System.out.println("-----RedBeanSoyMilk-----");
        SoyMilk milk1 = new RedBeanSoyMilk();
        milk1.make();

        System.out.println("-----PeanutSoyMilk-----");
        SoyMilk milk2 = new PeanutSoyMilk();
        milk2.make();

        System.out.println("-----PureSoyMilk-----");
        SoyMilk milk3 = new PureSoyMilk();
        milk3.make();
    }
}
