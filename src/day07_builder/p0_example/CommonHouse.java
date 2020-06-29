package day07_builder.p0_example;

public class CommonHouse extends AbstractHouse {
    @Override
    public void buildBasic() {
        System.out.println("Common House build basic...");
    }

    @Override
    public void buildWalls() {
        System.out.println("Common House build walls...");
    }

    @Override
    public void roofed() {
        System.out.println("Common House roofed...");
    }
}
