package chapter7;

public class SimplificationModelVideoBuilder extends VideoBuilder {
    @Override
    void buildMainWindow() {
        videoPlay.setMainWindow("主窗口");
    }

    @Override
    void buildMenu() {
//        videoPlay.setMenu("显示菜单");
    }

    @Override
    void buildList() {
//        videoPlay.setList("播放列表");
    }

    @Override
    void buildControlLine() {
        videoPlay.setControlLine("控制条");
    }
}
