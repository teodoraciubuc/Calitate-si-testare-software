package observer.antivirus;

import observer.Observable;

public class BackgroundScanner extends ObserverScanner {
    public void virusDetected(int severity) {
        System.out.println("Virus detectat cu severitatea: " + severity);
        notifyHandlers(severity);
    }
}
