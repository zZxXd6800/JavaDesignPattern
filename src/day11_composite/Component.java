package day11_composite;

/**
 * 抽象父类 (Component)
 */
public abstract class Component {
    private String name;
    private String des;

    public Component(String name, String des) {
        this.name = name;
        this.des = des;
    }

    /**
     * 叶子节点不需要重写add()和remove()方法，因此提供一个默认实现
     */
    protected void add(Component component) {
        throw new UnsupportedOperationException();
    }

    protected void remove(Component component) {
        throw new UnsupportedOperationException();
    }

    /**
     * 打印方法所有子类都要实现，因此写成抽象方法
     */
    protected abstract void print();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
