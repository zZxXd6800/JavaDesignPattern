package day8_adapter.p1_class_adapter;

/**
 * 适配器类
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V {
    @Override
    public int output5V() {
        int src = output220V();
        System.out.println("adapter voltage from 220V to 5V...");
        int dst = src / 44;
        return dst;
    }
}
