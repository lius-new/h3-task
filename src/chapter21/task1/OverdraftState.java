package chapter21.task1;

public class OverdraftState extends State {

    public OverdraftState(Account acc) {
        super(acc);
        this.stateName  = "透支状态";
    }

    @Override
    protected void stateCheck() {
        if (this.acc.balance >= 0) {
            this.acc.setState(new NormalState(this.acc));
            System.out.println(this.acc.state.stateName);
        } else if (this.acc.balance <= -2000) {
            this.acc.setState(new RestrictedState(this.acc));
        }
    }
}
