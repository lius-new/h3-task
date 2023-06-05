package chapter21.task1;

public class Account {
    protected State state;
    protected String owner;
    protected Double balance = 0.0;

    public Account(String owner,double init) {
        this.owner = owner;
        this.balance = init;
        this.state = new NormalState(this);
        System.out.println("创建账户: " + this.owner + ",账户余额为: " + this.balance);
    }

    public void deposit(double amount){
        this.state.deposit(amount);
    }

    public void withdraw(double amount){
        this.state.withdraw(amount);
    }

    public void computeInterest(){}

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
