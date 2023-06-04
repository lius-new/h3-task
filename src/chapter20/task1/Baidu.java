package chapter20.task1;

public class Baidu implements Observer{
    @Override
    public void update() {
        System.out.println("Baidu收到更新天气");
    }
}
