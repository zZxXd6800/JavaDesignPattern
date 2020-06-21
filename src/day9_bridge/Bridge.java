package day9_bridge;

import day9_bridge.Brand.Vivo;
import day9_bridge.Brand.XiaoMi;
import day9_bridge.Phone.FoldedPhone;
import day9_bridge.Phone.Phone;
import day9_bridge.Phone.UpRightPhone;

/**
 * 桥接模式：将实现和抽象放在两个不同的层次中，使两个层次可以独立改变
 * 基于类的最小设计原则，通过使用封装、聚合和继承让不同的类承担不同的职责
 * 主要特点是把抽象与行为实现分离，从而可以保证各部分的独立性以及应对他们的功能扩展
 * 注意事项：
 *      1.实现了抽象和实现的分离，提高了系统的灵活性，让抽象部分和实现部分相互独立，有助于系统的分层设计，从而产生更好的结构化系统
 *      2.对于系统的高层部分，只需要知道抽象部分和实现部分的接口就行了，其他部分由具体业务来完成
 *      3.桥接模式替代多层继承方案，可以减少子类的个数，降低系统的管理和维护成本
 *      4.桥接模式的引入增加了系统的理解和设计难度，由于聚合关系建立在抽象层，要求开发者针对抽象进行设计和编程
 *      5.要正确识别出系统中两个独立变化的维度，因此其使用有一定程度的局限性，即需要有这样的应用场景：例如不需要使用继承或因多层继承导致系统类的个数急剧增加时，桥接模式尤为适用
 */
public class Bridge {
    public static void main(String[] args) {
        Phone phone = new FoldedPhone(new XiaoMi());
        phone.open();
        phone.call();
        phone.close();

        Phone phone1 = new UpRightPhone(new Vivo());
        phone1.open();
        phone1.call();
        phone1.close();
    }
}
