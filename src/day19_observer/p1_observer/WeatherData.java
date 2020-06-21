package day19_observer.p1_observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体被观察者
 * @author zhuxu
 * @date 2020/6/20 10:33
 */
public class WeatherData implements Observable {
    private float temperature;
    private float pressure;
    private float humidity;
    private List<Observer> observers;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if (observers.contains(observer)){
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(getTemperature(), getPressure(), getHumidity());
        }
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
        notifyObservers();
    }
}
