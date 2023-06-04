package chapter17.example1;

public class RemoteController {
    AbstractCommand openCommand, closeCommand, changeCommand;

    public RemoteController() {
        Television television = new Television();
        this.openCommand = new OpenCommand(television);
        this.closeCommand = new CloseCommand(television);
        this.changeCommand = new ChangeCommand(television);
    }

    public void open(){
        this.openCommand.execute();
    }
    public void close(){
        this.closeCommand.execute();
    }
    public void change(){
        this.changeCommand.execute();
    }
}
