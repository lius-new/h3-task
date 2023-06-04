package chapter16.task1;

public class Director extends Leader {

    public Director(String name) {
        super(name);
    }

    @Override
    void handleRequest(PurchaseAmount purchaseAmount) {
        if (purchaseAmount.getAmount() < 10000) {
            System.out.println(this.name + "主任审批: " + purchaseAmount.getName() + ". 审批金额为" + purchaseAmount.getAmount());
        } else {
            successor.handleRequest(purchaseAmount);
        }
    }

}
