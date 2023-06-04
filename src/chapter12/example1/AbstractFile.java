package chapter12.example1;

public abstract class AbstractFile {
    protected abstract void add(AbstractFile file);

    abstract void remove(AbstractFile file);

    abstract AbstractFile getChild(int i);

    abstract void killVirus();
}
