package day19_observer.p1_observer;

/**
 * 具体观察者2
 * @author zhuxu
 * @date 2020/6/20 10:35
 */
public class Baidu implements Observer {
    @Override
    public void update(float temperature, float pressure, float humidity) {
        System.out.println("today's weather: baidu");
        System.out.println("\t|---temperature: " + temperature);
        System.out.println("\t|---pressure: " + pressure);
        System.out.println("\t|---humidity: " + humidity);
    }
}
