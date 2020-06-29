package day06_prototype.p2_deep_clone;

import java.io.Serializable;

public class Friend implements Serializable, Cloneable {
    private String name;

    public Friend(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "name='" + name + '\'' +
                '}';
    }

    /**
     * 默认的clone()方法可以对基本数据类型和String类型完成拷贝
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
