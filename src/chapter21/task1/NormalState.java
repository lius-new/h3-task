package chapter21.task1;

public class NormalState extends State{

    public NormalState(Account acc) {
        super(acc);
        this.stateName  = "正常状态";
    }

    @Override
    protected void stateCheck() {
        if (this.acc.balance < 0 && this.acc.balance >= -2000) {
            this.acc.setState(new OverdraftState(this.acc));
        } else if (this.acc.balance <= -2000) {
            this.acc.setState(new RestrictedState(this.acc));
        }
    }
}
