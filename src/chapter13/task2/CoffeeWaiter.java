package chapter13.task2;

public class CoffeeWaiter {
    private Water water;
    private Grind grind;
    private Fusion fusion;

    public CoffeeWaiter() {
        this.water = new Water();
        this.grind = new Grind();
        this.fusion = new Fusion();
    }

    public void provideCoffee() {
        System.out.print("1.");
        this.water.boilWater();
        System.out.print("2.");
        this.grind.grindCoffee();
        System.out.print("3.");
        this.fusion.fusionWaterAndCoffee();
        System.out.print("4.");
        System.out.println("这是你的咖啡");
    }
}
