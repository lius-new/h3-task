package chapter20.task1;

public class Sina implements Observer{
    @Override
    public void update() {
        System.out.println("Sina 收到更新天气");
    }
}
