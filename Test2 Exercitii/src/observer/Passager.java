package observer;

public class Passager implements Observer {
    private String name;

    public Passager(String name) {
        this.name = name;
    }

    @Override
    public void receiveNotification(String message) {
        System.out.println(name + " a primit notificarea: " + message);
    }
}