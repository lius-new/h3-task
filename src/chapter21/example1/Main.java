package chapter21.example1;

public class Main {
    public static void main(String[] args) {

        FormAccount account = new FormAccount("张三那");
        System.out.println(account);
        account.writeNote(1500);
        System.out.println(account);
        account.downloadFile(2000);
    }
}
