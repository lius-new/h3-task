package chapter18.example1;

public class Main {
    public static void main(String[] args) {

        TVIterator iterator = new TCLTelevision().createIterator();

        while (iterator.hasNext()){
            iterator.next();
            System.out.println(iterator.currentChannel().toString());
        }

    }
}
