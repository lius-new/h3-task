package chapter20.task1;

public interface Subject {
    void registerObserver(Observer o);
    void remove(Observer o);
    void notifyObserve();
}
