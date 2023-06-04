package chapter10.task2;

public class SmallDrink extends Drink {
    @Override
    public void drink() {
        Brand brand = this.getBrand();
        brand.make("小瓶的");
    }
}
