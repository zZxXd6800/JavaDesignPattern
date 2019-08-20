package day1_design_principles.p1_single_responsibility;

/**
 * 在方式1中违反了单一职责原则，应该根据交通工具运行方式的不同，将交通工具类分解为不同的类
 */
public class SingleResponsibility1 {
    public static void main(String[] args) {
        Vehicle1 vehicle = new Vehicle1();
        vehicle.run("Car");
        vehicle.run("Ship");
        vehicle.run("Airplane");
    }
}

/**
 * 交通工具类
 */
class Vehicle1 {
    public void run(String vehicle) {
        System.out.println(vehicle + " run on the road.");
    }
}
