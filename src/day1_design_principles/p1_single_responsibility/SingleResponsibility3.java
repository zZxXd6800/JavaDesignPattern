package day1_design_principles.p1_single_responsibility;

/**
 * 方式3仅增加新的方法，在方法级别遵守单一职责原则
 */
public class SingleResponsibility3 {
    public static void main(String[] args) {
        Vehicle3 vehicle = new Vehicle3();
        vehicle.runRoad("Car");
        vehicle.runAir("Airplane");
        vehicle.runWater("Ship");
    }
}

/**
 * 交通工具类
 */
class Vehicle3 {
    public void runRoad(String vehicle) {
        System.out.println(vehicle + " run on the road.");
    }

    public void runAir(String vehicle) {
        System.out.println(vehicle + " run in the air.");
    }

    public void runWater(String vehicle) {
        System.out.println(vehicle + " run on the water.");
    }
}