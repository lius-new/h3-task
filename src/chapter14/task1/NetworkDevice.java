package chapter14.task1;

public abstract class NetworkDevice {
    abstract String getType();

    void use() {
        System.out.println("网络设备: " + this.getType() + "正在使用");
    }
}
