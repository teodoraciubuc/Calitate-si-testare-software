package Command.SnapStudio;

public class SaturatieCommand implements Command {
    private Receiver receiver;

    public SaturatieCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.aplicaSaturatie();
    }
}