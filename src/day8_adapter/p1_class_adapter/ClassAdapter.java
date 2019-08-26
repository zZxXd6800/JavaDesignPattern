package day8_adapter.p1_class_adapter;

/**
 * 类适配器：通过继承被适配类，实现目标类的接口
 *      example：220V标准电压（被适配类src） ---> 电源适配器（adapter） ---> 5V工作电压（目标类dst）
 * 注意事项：
 *      1.Java是单继承机制，所以类适配器必须继承被适配类，并且实现目标接口，有一定局限性
 *      2.src类的方法在adapter中会暴露出来，增加了使用的成本
 *      3.由于adapter继承了src，所以可以重写src的方法，增强了adapter的灵活性
 */
public class ClassAdapter {
    public static void main(String[] args) {
        System.out.println("---Class Adapter---");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }
}
