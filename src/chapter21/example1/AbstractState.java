package chapter21.example1;

public abstract class AbstractState {
    protected FormAccount account;
    protected int point;
    protected String name;


    public AbstractState() {
    }

    public AbstractState(FormAccount account) {
        this.account = account;
    }

    public void checkState() {
        if (this.point >= 1000) {
            this.account.setState(new HighState());
        } else if (this.point >= 100) {
            this.account.setState(new MiddleState());
        } else if (this.point >= 0) {
            this.account.setState(new PrimaryState());
        } else {
            System.out.println("报错 : ");
        }
    }

    public abstract void downloadFile(int score);

    public abstract void replyNote(int score);

    public abstract void writeNote(int score);


}
