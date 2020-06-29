package day07_builder.p1_builder;

public class HighBuilding extends HouseBuilder {
    @Override
    public void buildBasic() {
        house.setBasic("high building basic");
        System.out.println("High Building build basic...");
    }

    @Override
    public void buildWalls() {
        house.setWalls("high building walls");
        System.out.println("High Building build walls...");
    }

    @Override
    public void roofed() {
        house.setRoofed("high building roofed");
        System.out.println("High Building roofed...");
    }
}
