package chapter19.example1;

public abstract class Member {

    protected AbstractChatroom chatroom;

    protected String name;

    public Member() {
    }

    public Member(String name) {
        this.name = name;
    }

    public void receiveText(String from, String message){
        System.out.println(this.name + "接收到: " + from + "发送的消息" + message);
    }
    public void receiveImage(String from,String image){
        System.out.println(this.name + "接收到: " + from + "发送的消息" + image);
    }
    public abstract void sendText(String to,String message);
    public abstract void sendImage(String to,String image);


    public AbstractChatroom getChatroom() {
        return chatroom;
    }

    public void setChatroom(AbstractChatroom chatroom) {
        this.chatroom = chatroom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
