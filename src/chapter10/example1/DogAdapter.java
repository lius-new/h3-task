package chapter10.example1;

public class DogAdapter extends Dog implements Robot {
    @Override
    public void cry() {
        System.out.println("机器人模仿狗叫");
        super.wang();
    }

    @Override
    public void move() {
        System.out.println("机器人模狗跑");
        super.run();
    }
}
