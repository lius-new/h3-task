package chapter20.task1;

public class Client {
    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();
        weatherData.registerObserver(new Baidu());
        weatherData.registerObserver(new Sina());

        weatherData.notifyObserve();
    }
}
