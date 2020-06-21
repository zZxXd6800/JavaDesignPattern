package day19_observer.p0_example;

/**
 * 每增加一个第三方都需要在WeatherData中添加一个对象，不利于维护(违反开闭原则)
 */
public class Client {
    public static void main(String[] args) {
        CurrentCondition current = new CurrentCondition();
        WeatherData weatherData = new WeatherData(current);
        weatherData.setData(30, 150, 40);
    }
}
