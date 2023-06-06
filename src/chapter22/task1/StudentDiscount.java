package chapter22.task1;

public class StudentDiscount implements Discount {
    @Override
    public double calculate(double price) {
        return price * 0.8;
    }
}
