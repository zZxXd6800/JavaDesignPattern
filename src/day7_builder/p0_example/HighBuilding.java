package day7_builder.p0_example;

public class HighBuilding extends AbstractHouse {
    @Override
    public void buildBasic() {
        System.out.println("High Building build basic...");
    }

    @Override
    public void buildWalls() {
        System.out.println("High Building build walls...");
    }

    @Override
    public void roofed() {
        System.out.println("High Building roofed...");
    }
}
