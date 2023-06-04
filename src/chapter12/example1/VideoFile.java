package chapter12.example1;

public class VideoFile  extends AbstractFile{
    private String fileName;

    public VideoFile(String fileName) {
        this.fileName = fileName;
    }

    @Override
    protected void add(AbstractFile file) {
        System.out.println("不支持此方法");
    }

    @Override
    void remove(AbstractFile file) {
        System.out.println("不支持此方法");
    }

    @Override
    AbstractFile getChild(int i) {
        System.out.println("不支持此方法");
        return null;
    }

    @Override
    void killVirus() {
        System.out.println("对"+fileName+"进行视频文件杀毒！");
    }
}
