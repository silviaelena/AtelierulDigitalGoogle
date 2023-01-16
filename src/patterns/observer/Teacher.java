package patterns.observer;

import java.util.ArrayList;
import java.util.List;

class Teacher implements ObserverSubject {
    List<Observer> observers;

    public Teacher() {
        observers = new ArrayList<>();
    }

    @Override
    public void register(Observer obj) {
        observers.add(obj);
    }

    @Override
    public void unregister(Observer obj) {
        observers.remove(obj);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void teach(String message) {
        notifyObservers(message);
    }
}
