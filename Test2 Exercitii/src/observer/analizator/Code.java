package observer.analizator;
public class Code extends Observable {

    public void notificare() {
        notifyObservers("Notificare trimisa asincron " );
    }


}
