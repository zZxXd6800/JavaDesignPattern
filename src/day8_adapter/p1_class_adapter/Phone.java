package day8_adapter.p1_class_adapter;

public class Phone {
    public void charging(IVoltage5V i) {
        if (i.output5V() == 5) {
            System.out.println("Voltage is 5V, charging..." );
        } else {
            System.out.println("Can not charge...");
        }
    }
}
