package chapter16.task1;

public class Department extends Leader{
    public Department(String name) {
        super(name);
    }

    @Override
    void handleRequest(PurchaseAmount purchaseAmount) {
        if (purchaseAmount.getAmount() < 50000) {
            System.out.println(this.name + "部门经理审批: " + purchaseAmount.getName() + ". 审批金额为" + purchaseAmount.getAmount());
        } else {
            successor.handleRequest(purchaseAmount);
        }
    }
}
