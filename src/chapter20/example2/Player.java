package chapter20.example2;

public class Player extends MYObserver {

    public Player(String name) {
        super(name);
    }

    @Override
    public void help() {
        System.out.println("坚持住," + this.name + "马上来帮你");
    }
}
