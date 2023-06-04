package chapter13.task1;

/**
 * 在计算机主机（Mainframe）中，只需要按下主机的开机按钮(on()),
 * 即可以调用其他硬件设备和软件的启动方法，如内存（Memory）的自检(check()),CPU的运行（run()）,硬盘(HardDisk)的读取（read()）,操作系统（OS）的载入（load()）等，
 * 如果某一过程发生错误则计算机启动失败。使用外观模式模拟该过程，并编程实现。
 */
public class Main {
    public static void main(String[] args) throws Exception {
        GeneralMainFrameSwitch generalMainFrameSwitch = new GeneralMainFrameSwitch();
        generalMainFrameSwitch.on();
    }
}
