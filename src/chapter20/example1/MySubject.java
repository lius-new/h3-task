package chapter20.example1;

import java.util.ArrayList;

public abstract class MySubject {

    protected ArrayList<MyObserver> observers = new ArrayList<>();

    public void attach(MyObserver observer){
        observers.add(observer);
    }
    public void detach(MyObserver observer){
        observers.remove(observer);
    }


    public abstract void notify_();


}
