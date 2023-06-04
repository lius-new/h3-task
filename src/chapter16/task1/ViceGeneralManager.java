package chapter16.task1;

public class ViceGeneralManager extends Leader {

    public ViceGeneralManager(String name) {
        super(name);
    }

    @Override
    void handleRequest(PurchaseAmount purchaseAmount) {
        if (purchaseAmount.getAmount() < 100000) {
            System.out.println(this.name + "副总经理审批: " + purchaseAmount.getName() + ". 审批金额为" + purchaseAmount.getAmount());
        } else {
            successor.handleRequest(purchaseAmount);
        }
    }

}
