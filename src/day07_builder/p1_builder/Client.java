package day07_builder.p1_builder;

public class Client {
    public static void main(String[] args) {
        HouseDirector director1 = new HouseDirector(new CommonHouse());
        House common = director1.constructorHouse();
        System.out.println(common);

        HouseDirector director2 = new HouseDirector(new HighBuilding());
        House highBuilding = director2.constructorHouse();
        System.out.println(highBuilding);
    }
}
