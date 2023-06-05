package chapter21.task1;

public abstract class State {

    protected Account acc;
    protected String stateName;

    public State() {
    }

    public State(Account acc) {
        this.acc = acc;
    }

    protected void deposit(Double amount) {
        System.out.println(acc.getOwner() + "存款" + amount + " 金额, 当前为: " + this.acc.state.stateName);
        this.acc.balance += amount;
        stateCheck();
        System.out.println(acc.getOwner() + "剩余存款为" + this.acc.balance + " 金额, 当前用户为: " + acc.getOwner() + ", 当前为: " + this.acc.state.stateName);
    }

    protected void withdraw(Double amount) {
        System.out.println(acc.getOwner() + "取款" + amount + " 金额");
        this.acc.balance -= amount;
        stateCheck();
        System.out.println(acc.getOwner() + "剩余存款为" + this.acc.balance + " 金额, 当前用户为: " + acc.getOwner() + ", 当前为: " + this.acc.state.stateName);
    }

    protected void computeInterest() { // 计算利息的

    }


    protected abstract void stateCheck();

}
