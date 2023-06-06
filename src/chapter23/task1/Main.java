package chapter23.task1;

/**
 * 模板方法模式：足球比赛中，在战术角球中，A开球、B传球、C抢点再射门，这是一个战术的框架，当然C到底是抢前点还是抢后点可以根据实际情况来选择，
 * 如果将踢战术角球设计为一个模板方法，那么每一个步骤就是其中要调用的基本方法了，而且在不同战术中某些具体步骤的实施还各不相同。这真是模板方法模式的非典型应用！
 *
 * 模板方法模式(Template Method): 定义一个操作中的算法的骨架，而将一些步骤延迟到子类中，使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。
 */
public class Main {
    public static void main(String[] args) {

         Template aPlayer = new APlayer();

         aPlayer.process();
    }
}
