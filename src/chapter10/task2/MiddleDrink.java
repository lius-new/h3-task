package chapter10.task2;

public class MiddleDrink extends Drink {
    @Override
    public void drink() {
        Brand brand = this.getBrand();
        brand.make("中瓶的");
    }
}
