package observer.analizator;

public class Aplicatia implements C {

    @Override
    public void receiveNotification(String message) {
        System.out.println("notificare primita");
    }
}
