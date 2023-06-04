package chapter16.example1;

public class Manager extends Leader {

    public Manager(String name) {
        super(name);
    }

    @Override
    void handleRequest(LeaveRequest leaveRequest) {
        if (leaveRequest.getLeaveDays() < 10) {
            System.out.println(this.name + "经理审批通过" + leaveRequest.getLeaveName() + "的请假,请假天数为" + leaveRequest.getLeaveDays() + "天!");
        } else {
            successor.handleRequest(leaveRequest);
        }
    }
}
