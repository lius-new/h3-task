package chapter22.task1;

public class MovieTicket {
    private double price;
    private Discount discount;


    public MovieTicket() {
    }

    public MovieTicket(double price) {
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public double getPrice() {
        return this.discount.calculate(this.price);
    }

    public Discount getDiscount() {
        return discount;
    }
}
