package day1_design_principles.p1_single_responsibility;

/**
 * 方式2遵守单一职责原则，但类的改动很大，既分解类又修改客户端，可以直接对方式1中的Vehicle类进行修改
 */
public class SingleResponsibility2 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("Car");

        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("Airplane");

        WaterVehicle waterVehicle = new WaterVehicle();
        waterVehicle.run("Ship");
    }
}

/**
 * 陆上交通工具类
 */
class RoadVehicle {
    void run(String vehicle) {
        System.out.println(vehicle + " run on the road.");
    }
}

/**
 * 空中交通工具类
 */
class AirVehicle {
    void run(String vehicle) {
        System.out.println(vehicle + " run in the air.");
    }
}

/**
 * 水上交通工具类
 */
class WaterVehicle {
    void run(String vehicle) {
        System.out.println(vehicle + " run on the water.");
    }
}