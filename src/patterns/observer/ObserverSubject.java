package patterns.observer;

public interface ObserverSubject {
    void register(Observer obj);
    void unregister(Observer obj);
    void notifyObservers(String message);
}