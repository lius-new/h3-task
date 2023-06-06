package chapter22.task1;

public class ChildrenDiscount implements Discount {
    @Override
    public double calculate(double price) {
        return price >= 20 ? price - 10 : price;
    }
}
