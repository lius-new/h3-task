package chapter10.task2;


//肯德基的饮料分为大中小三种容量，还有可口可乐、橙汁、雪碧、柠檬4种不同的饮料，用桥接模式实现上述实例。
public class Main {

    public static void main(String[] args) {

        Brand brand = new OrangeJuice();
        Drink drink = new BigDrink();
        drink.setBrand(brand);
        drink.drink();
    }

}
