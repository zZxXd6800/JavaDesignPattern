package day19_observer.p1_observer;

/**
 * 观察者接口
 * @author zhuxu
 * @date 2020/6/20 10:38
 */
public interface Observer {
    void update(float temperature, float pressure, float humidity);
}
