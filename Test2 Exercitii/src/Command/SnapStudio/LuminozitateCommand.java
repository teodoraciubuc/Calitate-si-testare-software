package Command.SnapStudio;

public class LuminozitateCommand implements Command {
    private Receiver receiver;

    public LuminozitateCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.aplicaLuminozitate();
    }
}