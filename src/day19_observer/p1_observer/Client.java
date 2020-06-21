package day19_observer.p1_observer;

/**
 * 观察者：
 * 源码：jdk(Obserable)
 * @author zhuxu
 * @date 2020/6/19 19:47
 */
public class Client {
    public static void main(String[] args) {
        WeatherData observable = new WeatherData();
        observable.registerObserver(new Sina());
        observable.setData(30, 150, 40);
        System.out.println("-----新增观察者-----");
        // 新增观察者
        observable.registerObserver(new Baidu());
        observable.setData(28, 140, 50);
    }
}
