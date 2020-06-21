package day19_observer.p1_observer;

/**
 * 被观察者接口
 * @author zhuxu
 * @date 2020/6/20 10:32
 */
public interface Observable {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
