package day08_adapter;

/**
 * 被适配类
 */
public class Voltage220V {
    //输出220V标准电压
    public int output220V() {
        int src = 220;
        System.out.println("Voltage = " + src + "V");
        return src;
    }
}
