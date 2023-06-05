package chapter21.task1;

public class Main {
    public static void main(String[] args) {

        Account account = new Account("张三", 200);

        account.deposit(200);
        account.withdraw(500);
        account.withdraw(5000);

        account.withdraw(5000);
    }
}
