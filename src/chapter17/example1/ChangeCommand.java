package chapter17.example1;

public class ChangeCommand extends AbstractCommand{
    private Television television;

    public ChangeCommand(Television television) {
        this.television = television;
    }

    @Override
    void execute() {
        television.change();
    }
}
