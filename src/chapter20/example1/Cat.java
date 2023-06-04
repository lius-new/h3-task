package chapter20.example1;

public class Cat extends MySubject {
    @Override
    public void notify_() {
        System.out.println("猫喵喵叫 : ");
        for (MyObserver o :
                observers) {
            o.response();
        }

    }
}


