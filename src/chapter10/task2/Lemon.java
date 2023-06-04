package chapter10.task2;

public class Lemon implements Brand {
    @Override
    public void make(String type) {
        System.out.println(type + "柠檬饮料" + ". ");
    }
}
