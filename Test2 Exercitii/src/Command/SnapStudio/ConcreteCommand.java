package Command.SnapStudio;

public class ConcreteCommand implements Command{
    private Receiver reciver;
    @Override
    public void execute() {
        reciver.aplicaLuminozitate();
        reciver.aplicaSaturatie();
    }
}
