package day6_prototype.p0_example;

/**
 * 问题：
 *      1.在创建对象时，总是需要获取到原始对象的属性，当创建的对象比较复杂时效率低下
 *      2.总是需要重新初始化对象，而不是动态的获得对象运行时的状态，不够灵活
 * 改进：
 *      让Sheep实现Cloneable接口，并重写clone()方法 ---> 原型模式
 */
public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom", 1, "white");

        Sheep sheep2 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep3 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep4 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep5 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        //...

        System.out.println(sheep);
        System.out.println(sheep2);
        System.out.println(sheep3);
        System.out.println(sheep4);
        System.out.println(sheep5);
        //...
    }
}
