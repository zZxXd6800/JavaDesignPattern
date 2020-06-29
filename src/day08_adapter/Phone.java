package day08_adapter;

import day08_adapter.IVoltage5V;

public class Phone {
    public void charging(IVoltage5V i) {
        if (i.output5V() == 5) {
            System.out.println("Voltage is 5V, charging..." );
        } else {
            System.out.println("Can not charge...");
        }
    }
}
