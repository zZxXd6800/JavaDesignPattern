package day08_adapter.p2_object_adapter;

import day08_adapter.IVoltage5V;
import day08_adapter.Voltage220V;

/**
 * 适配器类：持有src类对象，实现dst接口
 */
public class VoltageAdapter implements IVoltage5V {
    /**
     * 聚合一个src类的实例
     */
    private Voltage220V voltage220;

    public VoltageAdapter(Voltage220V voltage220) {
        this.voltage220 = voltage220;
    }

    @Override
    public int output5V() {
        int src = voltage220.output220V();
        System.out.println("adapter voltage from 220V to 5V...");
        int dst = src / 44;
        return dst;
    }
}
