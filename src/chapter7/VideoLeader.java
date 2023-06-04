package chapter7;

public class VideoLeader {
    private VideoBuilder videoBuilder;

    public void setVideoBuilder(VideoBuilder videoBuilder) {
        this.videoBuilder = videoBuilder;
    }

    public VideoPlay construct() {
        videoBuilder.buildMainWindow();
        videoBuilder.buildList();
        videoBuilder.buildControlLine();
        ;
        videoBuilder.buildMenu();
        return videoBuilder.getVideoPlay();
    }
}
