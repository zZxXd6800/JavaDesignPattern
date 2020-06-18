package day7_builder.p1_builder;

/**
 * 抽象的建造者
 */
public abstract class HouseBuilder {
    protected House house = new House();

    abstract void buildBasic();
    abstract void buildWalls();
    abstract void roofed();

    public House build() {
        return house;
    }
}
