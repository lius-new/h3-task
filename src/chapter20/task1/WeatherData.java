package chapter20.task1;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private final ArrayList<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void remove(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserve() {
        for (Observer observer :
                observers) {
            observer.update();
        }

    }
}
