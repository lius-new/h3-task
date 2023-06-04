package chapter14.example1;

public class Main {
    public static void main(String[] args) {
        IgoChessMan black1, black2, white1, white2;

        IgoChessFactory instance = IgoChessFactory.getInstance();
        black1 = instance.getIgoChessMan("b");
        black2 = instance.getIgoChessMan("b");
        white1 = instance.getIgoChessMan("w");
        white2 = instance.getIgoChessMan("w");
        System.out.println("判断黑棋是否相同" + (black2 == black1));
        System.out.println("判断白棋是否相同" + (white1 == white2));
        black1.display();
        black2.display();
        white1.display();
        white2.display();
    }
}
