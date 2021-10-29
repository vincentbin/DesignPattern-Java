package interfaces;

/**
 * 事件源
 */
public interface Subject {

    /**
     * 订阅事件
     * @param o observer
     */
    void registerObserver(Observer o);

    /**
     * 移除观察
     * @param o observer
     */
    void removeObserver(Observer o);

    /**
     * 变化时通知观察者
     */
    void notifyObservers();
}
