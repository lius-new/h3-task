package chapter14.example1;

public abstract class IgoChessMan {

    abstract String getColor();

    void display(){
        System.out.println("棋子颜色" + this.getColor());
    }
}
