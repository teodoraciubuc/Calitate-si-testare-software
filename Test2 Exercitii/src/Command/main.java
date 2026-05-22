package Command.SnapStudio;

public class main {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();

        Command c1 = new LuminozitateCommand(receiver);
        Command c2 = new SaturatieCommand(receiver);

        Invoker invoker = new Invoker();

        invoker.adaugaComanda(c1);
        invoker.adaugaComanda(c2);
//        invoker.adaugaComanda(c3);

        invoker.executaComenzi();
    }
}