package observer.antivirus;

import java.util.ArrayList;
import java.util.List;

public class ObserverScanner {
    protected List<VirusHandler> handlers = new ArrayList<>();

    public void addHandler(VirusHandler handler) {
        handlers.add(handler);
    }

    public void removeHandler(VirusHandler handler) {
        handlers.remove(handler);
    }

    public void notifyHandlers(int severity) {
        for (VirusHandler handler : handlers) {
            handler.handleVirus(severity);
        }
    }
}
