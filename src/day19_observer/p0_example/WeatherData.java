package day19_observer.p0_example;

/**
 * 推送方(气象站)
 * @author zhuxu
 * @date 2020/6/20 10:10
 */
public class WeatherData {
    private float temperature;
    private float pressure;
    private float humidity;
    private CurrentCondition condition;

    public WeatherData(CurrentCondition condition) {
        this.condition = condition;
    }

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        // 推送最新的数据
        condition.update(getTemperature(), getPressure(), getHumidity());
    }
}
