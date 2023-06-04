package chapter10.task2;

public class CocaCola implements Brand {
    @Override
    public void make(String type) {
        System.out.println(type + "可口可乐饮料" + " . ");
    }
}
