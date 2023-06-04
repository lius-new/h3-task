package chapter19.example1;

import java.util.Hashtable;

public class Chatroom extends AbstractChatroom {

    private final Hashtable<String, Member> members = new Hashtable<String, Member>();

    @Override
    public void register(Member member) {
        if (!members.contains(member)) {
            members.put(member.getName(), member);
        }
        member.setChatroom(this);
    }

    @Override
    public void sendText(String from, String to, String message) {
        String newMessage = message.replace("日", "*");
        System.out.println("发送消息给" + to + ":" + newMessage );
    }

    @Override
    public void sendImage(String from, String to, String image) {
        System.out.println("发送图片给" + to + ":" + image );
    }
}
