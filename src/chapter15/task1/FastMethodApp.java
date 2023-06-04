package chapter15.task1;

public class FastMethodApp extends AbstractApp {
    QQApp qqApp = new QQApp();

    @Override
    void run() {
        System.out.print("快捷方式: ");
        qqApp.run();
    }
}
