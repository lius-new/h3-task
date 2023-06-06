package chapter22.task1;

public class VIPDiscount implements Discount {
    @Override
    public double calculate(double price) {
        return price * 0.5;
    }
}
