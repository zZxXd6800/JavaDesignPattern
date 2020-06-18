package day7_builder.p1_builder;

public class HouseDirector {
    private HouseBuilder builder = null;

    public HouseDirector(HouseBuilder builder) {
        this.builder = builder;
    }

    public HouseBuilder getBuilder() {
        return builder;
    }

    public void setBuilder(HouseBuilder builder) {
        this.builder = builder;
    }

    public House constructorHouse() {
        builder.buildBasic();
        builder.buildWalls();
        builder.roofed();
        return builder.build();
    }
}
