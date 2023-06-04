package chapter19.example1;

public class DiamondMember extends Member{

    public DiamondMember() {
    }
    public DiamondMember(String name) {
        super(name);
    }

    @Override
    public void sendText(String to, String message) {
        System.out.print("砖石会员");
        chatroom.sendText(this.name,to,message);
    }

    @Override
    public void sendImage(String to, String image) {
        System.out.print("砖石会员");
        chatroom.sendImage(this.name,to,image);
    }
}
