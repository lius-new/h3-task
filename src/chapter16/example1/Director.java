package chapter16.example1;

public class Director extends Leader {

    public Director(String name) {
        super(name);
    }

    @Override
    void handleRequest(LeaveRequest leaveRequest) {
        if (leaveRequest.getLeaveDays() < 3) {
            System.out.println(this.name + "主任审批通过" + leaveRequest.getLeaveName() + "的请假,请假天数为" + leaveRequest.getLeaveDays() + "天!");
        } else {
            successor.handleRequest(leaveRequest);
        }
    }
}
