package chapter17.example2;

public abstract class AbstractOperateCommand {
    abstract int execute(int i);
    abstract int undo();
}
