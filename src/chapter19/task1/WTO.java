package chapter19.task1;

public class WTO extends UN {

    private Country country;

    @Override
    void register(Country country) {
        this.country = country;
    }

    @Override
    void sendNegotiate(String form, String to, String message) {
        System.out.println("WTO: " + form + "->" + to + "send: " + message);

    }
}
