package chapter22.task1;

public class Main {
    public static void main(String[] args) {
        MovieTicket movieTicket = new MovieTicket(20);
        movieTicket.setDiscount(new StudentDiscount()); // 设置具体策略类
        System.out.println("当前票价为:" + movieTicket.getPrice());
    }
}
