package chapter6;

public class Main {
    public static void main(String[] args) {
        Phone phone;
        Tv tv;
        AbstractFactory bean = (AbstractFactory)ReadXml.getBean();
        phone = bean.productPhone();
        phone.play();
    }
}
