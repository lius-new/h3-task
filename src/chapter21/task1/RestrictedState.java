package chapter21.task1;

// 受限状态
public class RestrictedState extends State {

    public RestrictedState(Account acc) {
        super(acc);
        this.stateName = "受限状态";
    }

    @Override
    protected void withdraw(Double amount) {
        System.out.println("受限状态，不允许取款");
    }

    @Override
    protected void stateCheck() {
        if (this.acc.balance < 0 && this.acc.balance >= -2000) {
            this.acc.setState(new OverdraftState(this.acc));
        } else if (this.acc.balance > 0) {
            this.acc.setState(new NormalState(this.acc));
        }
    }
}
