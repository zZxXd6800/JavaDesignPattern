package day7_builder.p1_builder;

public class CommonHouse extends HouseBuilder {
    @Override
    void buildBasic() {
        house.setBasic("common house basic");
        System.out.println("Common House build basic...");
    }

    @Override
    void buildWalls() {
        house.setWalls("common house walls");
        System.out.println("Common House build walls...");
    }

    @Override
    void roofed() {
        house.setRoofed("common house roofed");
        System.out.println("Common House roofed...");
    }
}
