package chapter20.example1;

public class Mouse implements MyObserver {
    @Override
    public void response() {
        System.out.println("老鼠快跑");
    }
}
