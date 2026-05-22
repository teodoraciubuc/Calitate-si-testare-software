package observer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class Observable {
    protected List<Observer> observers = new ArrayList<>();
    public void subscribe(Observer observer) {
        observers.add(observer);
    }
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }
    public void notifyObservers(String message) {
        for(Observer o : observers) {
            o.receiveNotification(message);
        }
    }
}
