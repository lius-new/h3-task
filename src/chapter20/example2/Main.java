package chapter20.example2;

public class Main {
    public static void main(String[] args) {
        MYObserver player1,player2,player3,player4;
        ControlCenter team = new Team("无敌霸王龙");
        player1 = new Player("张三");
        player2 = new Player("李四");
        player3 = new Player("王五");
        player4 = new Player("赵六");
        {
            team.join(player2); team.join(player1);team.join(player3);team.join(player4);
        }
        player1.beAttack();
    }
}
