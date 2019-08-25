package day7_builder.p0_example;

/**
 * 没有设计缓冲层对象，程序的拓展和维护性不好，应该将产品和产品的建造过程解耦 ---> 建造者模式
 */
public class Client {
    public static void main(String[] args) {
        CommonHouse house1 = new CommonHouse();
        house1.build();

        HighBuilding house2 = new HighBuilding();
        house2.build();
    }
}
