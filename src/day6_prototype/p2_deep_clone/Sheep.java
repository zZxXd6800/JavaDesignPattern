package day6_prototype.p2_deep_clone;

import java.io.*;

public class Sheep implements Serializable, Cloneable {
    private int age;
    private String name;
    private String color;

    /**
     * 引用传递
     */
    private Friend friend;

    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Friend getFriend() {
        return friend;
    }

    public void setFriend(Friend friend) {
        this.friend = friend;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", friend=" + friend +
                '}';
    }

    /**
     * 深拷贝 - 方式1 使用clone()方法
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        //先完成对基本数据类型和String的拷贝
        Object obj = null;
        obj = super.clone();

        //引用数据类型的属性单独处理
        Sheep sheep = (Sheep) obj;
        sheep.setFriend((Friend) friend.clone());
        return sheep;
    }

    /**
     * 深拷贝 - 方式2 使用对象序列化
     */
    public Object deepClone() {
        //创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            Sheep sheep = (Sheep) ois.readObject();

            return sheep;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            //关闭流
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
