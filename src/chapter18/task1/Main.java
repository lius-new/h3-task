package chapter18.task1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void task1() {
        List<String> manager = new ArrayList<>(List.of(new String[]{"张三", "李四", "王五"}));

        Iterator<String> iterator = manager.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public static void task2(){

        MyIterator iterator = new WDStore().createIterator();


        while (iterator.hasNext()){
            iterator.next();
            System.out.println(iterator.currentItem().toString());
        }
        while (iterator.hasPrevious()){
            System.out.println(iterator.currentItem().toString());
            iterator.previous();
        }
        System.out.println(iterator.currentItem().toString());
    }
    public static void main(String[] args) {
        // task1();
        task2();
    }
}
