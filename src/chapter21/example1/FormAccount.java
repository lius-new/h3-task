package chapter21.example1;

public class FormAccount {
    private String name;
    private AbstractState state;

    public FormAccount() {
    }

    public FormAccount(String name) {
        this.name = name;
        // TODO 账户的初始值
        this.state = new PrimaryState(this);
    }


    public void downloadFile(int score){
        this.state.downloadFile(score);
    }
    public void replyNote(int score){
        this.state.replyNote(score);
    }
    public void writeNote(int score){
        this.state.writeNote(score);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AbstractState getState() {
        return state;
    }

    public void setState(AbstractState state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "FormAccount{" +
                "name='" + name + '\'' +
                ", state=" + state +
                '}';
    }
}
