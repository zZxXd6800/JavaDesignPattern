package day5_abstract_factory.pizza;

public abstract class Pizza {
    protected String name;

    /**
     * 准备原材料，不同的Pizza需要的原材料不同
     */
    public abstract void prepare();

    /**
     * 烘焙
     */
    public void bake() {
        System.out.println(name + " baking...");
    }

    /**
     * 切割成块
     */
    public void cut() {
        System.out.println(name + " cutting...");
    }

    /**
     * 打包
     */
    public void box() {
        System.out.println(name + " boxing...");
    }

    public void setName(String name) {
        this.name = name;
    }
}
