package chapter10.task2;

public class OrangeJuice implements Brand {
    @Override
    public void make(String type) {
        System.out.println(type + "橙汁饮料" + " . ");
    }
}
