package chapter23.task1;

public class APlayer extends Template {

    @Override
    void grab() {
        System.out.println("A球员抢球失败");
    }

    @Override
    boolean runState() {
        return false;
    }
}
