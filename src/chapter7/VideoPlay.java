package chapter7;

public class VideoPlay {

    private String mainWindow;
    private String  menu ;
    private String  list ;
    private String  controlLine ;

    public String getMainWindow() {
        return mainWindow;
    }

    public void setMainWindow(String mainWindow) {
        this.mainWindow = mainWindow;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getList() {
        return list;
    }

    public void setList(String list) {
        this.list = list;
    }

    public String getControlLine() {
        return controlLine;
    }

    public void setControlLine(String controlLine) {
        this.controlLine = controlLine;
    }

    @Override
    public String toString() {
        return "VideoPlay{" +
                "mainWindow='" + mainWindow + '\'' +
                ", menu='" + menu + '\'' +
                ", list='" + list + '\'' +
                ", controlLine='" + controlLine + '\'' +
                '}';
    }
}
