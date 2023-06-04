package chapter17.example1;

public class OpenCommand extends AbstractCommand{
    private Television television;

    public OpenCommand(Television television) {
        this.television = television;
    }

    @Override
    void execute() {
        television.open();
    }
}
