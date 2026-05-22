package observer.analizator;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {
    protected List<C> observers = new ArrayList<>();
    public void subscribe(C observer) {
        observers.add(observer);
    }
    public void notifyObservers(String message) {
        for(C o : observers) {
            o.receiveNotification(message);
        }
    }
}
