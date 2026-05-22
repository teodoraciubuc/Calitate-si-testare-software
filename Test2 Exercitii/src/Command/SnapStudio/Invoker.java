package Command.SnapStudio;

import java.util.Stack;

public class Invoker {
    private Stack<Command> comenzi = new Stack<>();

    public void adaugaComanda(Command command) {
        comenzi.push(command);
    }

    public void executaComenzi() {
        while (!comenzi.isEmpty()) {
            comenzi.pop().execute();
        }
    }
}
