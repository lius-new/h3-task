package chapter18.example1;

public interface TVIterator {
    void setChannel(int i);
    Object currentChannel();

    void next();
    void previous();

    boolean hasNext();
    boolean hasPrevious();
}
