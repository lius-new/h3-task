package chapter12.task1;

/* 单位 */
public abstract class AbstractUnit {
    abstract void releaseMsg();


    abstract void add(AbstractUnit abstractUnit);
    abstract void remove(AbstractUnit abstractUnit);
    abstract AbstractUnit get(int i);
}
