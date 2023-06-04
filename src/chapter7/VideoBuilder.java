package chapter7;

public abstract class VideoBuilder {
     VideoPlay videoPlay = new VideoPlay();

    abstract void buildMainWindow();

    abstract void buildMenu();

    abstract void buildList();

    abstract void buildControlLine();


    public VideoPlay getVideoPlay() {
        return videoPlay;
    }
}
