package chapter21.example1;

public class PrimaryState extends AbstractState {

    public PrimaryState() {
    }

    public PrimaryState(FormAccount account) {
        super(account);
        this.point = 0;
        this.name = "新手";
    }
    public PrimaryState(AbstractState abstractState) {
        this.account = abstractState.account;
        this.point = abstractState.point;
        this.name = "新手";
    }

    @Override
    public void downloadFile(int score) {
        System.out.println("新手,无法下载");
    }

    @Override
    public void replyNote(int score) {
        this.point += score;
        checkState();
    }

    @Override
    public void writeNote(int score) {
        this.point += score;
        checkState();
    }
}
