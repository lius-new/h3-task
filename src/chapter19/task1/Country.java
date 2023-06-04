package chapter19.task1;

public abstract class Country {
    private UN un;
    private String name;

    public Country() {
    }

    public Country(String name) {
        this.name = name;
    }

    public UN getUn() {
        return un;
    }

    public void setUn(UN un) {
        this.un = un;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendNegotiate(String to,String message){

    }
    public void receiveNegotiate(String from,String message){

    }
}
