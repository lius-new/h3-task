package chapter21.example1;

public class HighState extends AbstractState {

    public HighState() {
    }

    public HighState(AbstractState abstractState) {
        this.account = abstractState.account;
        this.point = abstractState.point;
        this.name = "高手";
    }

    @Override
    public void downloadFile(int score) {
        if (this.point < 0)
            System.out.println("积分已用尽");
        else if (this.point < score)
            System.out.println("积分不够 ,缺少" + (score -this.point) + " 积分");
        else
            this.point -= score * 2;
        checkState();
    }

    @Override
    public void replyNote(int score) {
        this.point += score * 2;
        checkState();
    }

    @Override
    public void writeNote(int score) {
        this.point += score * 2;
        checkState();
    }
}
