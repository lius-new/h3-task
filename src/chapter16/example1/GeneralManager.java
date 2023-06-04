package chapter16.example1;

public class GeneralManager extends Leader {

    public GeneralManager(String name) {
        super(name);
    }

    @Override
    void handleRequest(LeaveRequest leaveRequest) {
        if (leaveRequest.getLeaveDays() < 30) {
            System.out.println(this.name + "总经理审批通过" + leaveRequest.getLeaveName() + "的请假,请假天数为" + leaveRequest.getLeaveDays() + "天!");
        } else {
            System.out.println("请假超过30天,不想干了? ");
        }
    }
}
