package chapter17.task1;

/**
 * 命令模式：足球教练掌心朝外，向前一推，队员全线压上；
 * 教练掌心朝内，向后一拨，队员全线退防。
 * 主教练就是命令的发送者，手势就是命令对象，所有队员都是命令的接收者。
 * 不同的命令对象将对应不同的执行动作。
 */
public class Main {
    public static void main(String[] args) {

        CoachController coachController = new CoachController();
        // coachController.innerExecute();
        // coachController.outerExecute();
    }
}
