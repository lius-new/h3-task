package chapter23.task1;

public abstract class Template {

    // 开球
    void start() {
        System.out.println("开球");
    }

    // 传球
    void transfer() {
        System.out.println("传球");
    }

    // 抢点
    void grab() {
        System.out.println("抢球");
    }

    // 射门
    void shoot() {
        System.out.println("射门");
    }

    boolean runState() {
        return true;
    }

    public void process() {
        start();
        transfer();
        grab();
        if (runState()) {
            shoot();
        }
    }
}
