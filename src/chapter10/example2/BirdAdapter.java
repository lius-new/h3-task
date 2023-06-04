package chapter10.example2;

import chapter10.example1.Robot;

public class BirdAdapter implements Robot {

    private Bird bird = new Bird();

    @Override
    public void cry() {
        System.out.print("机器人模仿: ");
        bird.wang();
    }

    @Override
    public void move() {
        System.out.print("机器人模仿: ");
        bird.run();
    }
}
