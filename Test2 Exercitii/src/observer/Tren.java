package observer;

public class Tren extends Observable {
    private String numarTren;
    private String destinatie;
    private int peron;
    private int minuteIntarziere;

    public Tren(String numarTren, String destinatie, int peron) {
        this.numarTren = numarTren;
        this.destinatie = destinatie;
        this.peron = peron;
        this.minuteIntarziere = 0;
    }

    public void modificaPeron(int peronNou) {
        this.peron = peronNou;
        notifyObservers("Trenul " + numarTren + " spre " + destinatie +
                " pleaca de la peronul " + peron + ".");
    }

    public void seteazaIntarziere(int minuteIntarziere) {
        this.minuteIntarziere = minuteIntarziere;
        notifyObservers("Trenul " + numarTren + " spre " + destinatie +
                " are intarziere de " + this.minuteIntarziere + " minute.");
    }
}