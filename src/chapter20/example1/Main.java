package chapter20.example1;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Mouse mouse = new Mouse();

        cat.attach(mouse);

        cat.notify_();
    }
}
