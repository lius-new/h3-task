package chapter15.task1;

/**
 *  应用软件所提供的桌面快捷方式是快速启动应用程序的代理。
 *  桌面的快捷方式一般用一张小图片（Picture）来表示，
 *  通过调用快捷方式的run()方法将调用应用软件（Application）的run()方法。使用代理模式模拟该过程
 */
public class Main {
    public static void main(String[] args) {
        // 通过快捷方式代理来打开
        FastMethodApp fastMethodApp = new FastMethodApp();
        fastMethodApp.run();

        // 通过点击应用启动程序打开
        // new QQApp().run();

    }
}
