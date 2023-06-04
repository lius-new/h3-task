package chapter18.task1;

public interface MyIterator {
    void first();
    void next();
    void previous();

    boolean hasNext();
    boolean hasPrevious();

    Object currentItem();
}
