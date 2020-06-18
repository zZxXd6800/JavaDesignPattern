package day6_prototype.p1_prototype;

/**
 * 原型模式：创建型（Spring中原型bean的创建）
 *      1.用原型实例指定创建对象的种类，并通过拷贝这些对象来创建新的对象，即：object.clone();
 *      2.允许一个对象再创建另一个可定制的对象，而且无需知道创建的细节
 * 浅拷贝：
 *      1.对于基本数据类型的成员变量，浅拷贝会直接进行值传递，也就是将该属性值复制一份给要创建的对象
 *      2.对于引用数据类型的成员变量，浅拷贝会进行引用传递，也就是将该属性的引用值（内存地址）复制一份给要创建的对象
 *        因此两个对象的成员变量引用的是同一个实例，在这种情况下，在一个对象中修改该成员变量会影响到另外一个对象成员变量的值
 */
public class Prototype {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom", 1, "white");

        try {
            Sheep sheep2 = (Sheep) sheep.clone();
            Sheep sheep3 = (Sheep) sheep.clone();
            //...

            System.out.println(sheep.hashCode());
            System.out.println(sheep2.hashCode());
            System.out.println(sheep3.hashCode());
            System.out.println(sheep.getName().hashCode());
            System.out.println(sheep2.getName().hashCode());
            System.out.println(sheep3.getName().hashCode());
            //...

            System.out.println(sheep.getName() == sheep2.getName());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
