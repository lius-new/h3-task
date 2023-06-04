package chapter10.task2;

public class BigDrink extends Drink {
    @Override
    public void drink() {
        Brand brand = this.getBrand();
        brand.make("大瓶的");
    }
}
