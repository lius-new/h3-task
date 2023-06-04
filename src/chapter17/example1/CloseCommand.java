package chapter17.example1;

public class CloseCommand extends AbstractCommand{
    private Television television;

    public CloseCommand(Television television) {
        this.television = television;
    }

    @Override
    void execute() {
        television.close();
    }
}
