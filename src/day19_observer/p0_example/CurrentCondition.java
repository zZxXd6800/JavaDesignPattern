package day19_observer.p0_example;

/**
 * 接受方(天气查询网站)
 * @author zhuxu
 * @date 2020/6/20 10:12
 */
public class CurrentCondition {
    // 温度
    private float temperature;
    // 气压
    private float pressure;
    // 湿度
    private float humidity;

    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    private void display() {
        System.out.println("today's weather:");
        System.out.println("\t|---temperature: " + temperature);
        System.out.println("\t|---pressure: " + pressure);
        System.out.println("\t|---humidity: " + humidity);
    }
}
