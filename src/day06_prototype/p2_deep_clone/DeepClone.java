package day06_prototype.p2_deep_clone;

/**
 * 深拷贝：
 *      1.复制对象的所有基本数据类型的成员变量值
 *      2.为所有引用数据类型的成员变量申请存储空间，并复制每个引用数据类型的成员变量所引用的对象，直到该对象可达的所有对象，即对整个对象进行拷贝
 *      3.方式一重写clone()方法
 *      4.方式二对象序列化
 */
public class DeepClone {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom", 1, "white", new Friend("jack"));

        //方式1 - clone()
        Sheep sheep2 = null;
        try {
            sheep2 = (Sheep) sheep.clone();

            //对sheep2对象进行修改时并不会影响到sheep对象
            sheep2.setFriend(new Friend("rose"));

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        //方式2 - 对象序列化
        Sheep sheep3 = (Sheep) sheep.deepClone();
        sheep3.setName("john");

        System.out.println("sheep 1 friend hashcode = " + sheep.getFriend().hashCode());
        System.out.println("sheep 2 friend hashcode = " + sheep2.getFriend().hashCode());
        System.out.println("sheep 3 friend hashcode = " + sheep3.getFriend().hashCode());

        System.out.println("sheep 1 name hashcode: " + sheep.getName().hashCode());
        System.out.println("sheep 2 name hashcode: " + sheep2.getName().hashCode());
        System.out.println("sheep 3 name hashcode: " + sheep3.getName().hashCode());

        System.out.println(sheep + "sheep 1 hashcode: " + sheep.hashCode());
        System.out.println(sheep2 + "sheep 2 hashcode: " + sheep2.hashCode());
        System.out.println(sheep3 + "sheep 3 hashcode: " + sheep3.hashCode());
    }
}
