package chapter19.example1;

public class CommonMember extends Member{

    public CommonMember() {
    }
    public CommonMember(String name) {
        super(name);
    }

    @Override
    public void sendText(String to, String message) {
        System.out.print("普通会员");
        chatroom.sendText(this.name,to,message);

    }

    @Override
    public void sendImage(String to, String message) {
        System.out.println("普通会员无法发送图片");
    }
}
