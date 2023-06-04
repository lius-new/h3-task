package chapter10.task1;

// 修改老师的实例”仿生机器人“,使得机器人可以像鸟一样叫，并能像狗一样跑。
public class Main {
    public static void main(String[] args) {
        SuperAdapter superAdapter = new SuperAdapter();
        superAdapter.run();
        superAdapter.say();

    }
}
