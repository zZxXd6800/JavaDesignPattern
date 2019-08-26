package day8_adapter.p2_object_adapter;

import day8_adapter.p1_class_adapter.Phone;
import day8_adapter.p1_class_adapter.Voltage220V;

/**
 * 对象适配器：和类适配器模式基本思路相同，只是让adapter类不再继承src类，而是持有src类的实例，已解决兼容性的问题，即持有src类，实现dst接口
 *         根据合成复用原则，尽量使用关联关系替代继承关系
 * 注意事项：
 *      1.根据合成复用原则，使用聚合代替继承，解决了类适配器中adapter必须继承src的局限性问题，也不再要求dst必须是接口
 *      2.使用成本低，更灵活，常用
 */
public class ObjectAdapter {
    public static void main(String[] args) {
        System.out.println("---Object Adapter---");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter(new Voltage220V()));
    }
}
