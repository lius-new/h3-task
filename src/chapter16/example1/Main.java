package chapter16.example1;

public class Main {
    public static void main(String[] args) {

        Leader l1, l2, l3;
        l1  = new Director("张三");
        l2  = new Manager("李四");
        l3  = new GeneralManager("王五");

        l1.setSuccessor(l2);
        l2.setSuccessor(l3);

        l1.handleRequest(new LeaveRequest("田六",30));

    }
}
