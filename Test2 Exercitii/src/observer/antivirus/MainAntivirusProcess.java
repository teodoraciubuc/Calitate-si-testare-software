package observer.antivirus;

public class MainAntivirusProcess implements VirusHandler{
    @Override
    public void handleVirus(int severity) {
        if (severity <= 3) {
            System.out.println("Virus minor: se pune in carantina.");
        } else if (severity <= 7) {
            System.out.println("Virus mediu: se sterge fisierul infectat.");
        } else {
            System.out.println("Virus grav: se izoleaza sistemul.");
        }
    }
}
