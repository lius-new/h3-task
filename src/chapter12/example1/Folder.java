package chapter12.example1;

import java.util.ArrayList;
import java.util.List;

public class Folder extends AbstractFile {

    private String name;
    private final List<AbstractFile> abstractFiles = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    @Override
    protected void add(AbstractFile file) {
        abstractFiles.add(file);
    }

    @Override
    void remove(AbstractFile file) {
        abstractFiles.remove(file);
    }

    @Override
    AbstractFile getChild(int i) {
        return abstractFiles.get(i);
    }

    @Override
    void killVirus() {
        for (AbstractFile abstractFile : abstractFiles) {
            abstractFile.killVirus();
        }
    }
}
