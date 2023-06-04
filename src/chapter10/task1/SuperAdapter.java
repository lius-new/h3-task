package chapter10.task1;

public class SuperAdapter implements Robot {

    private Dog dog = new Dog();
    private Bird bird = new Bird();
    @Override
    public void say() {
        System.out.print("机器人模仿: ");
        bird.say();
    }

    @Override
    public void run() {
        System.out.print("机器人模仿: ");
        dog.run();
    }
}
