package observer;

import observer.analizator.Aplicatia;
import observer.analizator.Code;
import observer.antivirus.BackgroundScanner;
import observer.antivirus.MainAntivirusProcess;

public class Main {
    public static void main(String[] args) {
        Tren tren = new Tren("IR 1622", "Brasov", 1);

        Passager ana = new Passager("Ana");
        Passager maria = new Passager("Maria");
        Passager ion = new Passager("Ion");

        tren.subscribe(ana);
        tren.subscribe(maria);
        tren.subscribe(ion);

        tren.modificaPeron(3);
        tren.seteazaIntarziere(20);

        tren.unsubscribe(maria);

        tren.modificaPeron(5);
        //aplicatia asincron

//        Aplicatia a=new Aplicatia();

        Code c=new Code();
        Aplicatia a=new Aplicatia();

        c.notificare();

            BackgroundScanner scanner = new BackgroundScanner();
            MainAntivirusProcess antivirus = new MainAntivirusProcess();
            scanner.addHandler(antivirus);
            scanner.virusDetected(2);

    }
}