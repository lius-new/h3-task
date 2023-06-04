package chapter16.task1;

public class GeneralManager extends Leader {

    public GeneralManager(String name) {
        super(name);
    }

    @Override
    void handleRequest(PurchaseAmount purchaseAmount) {
        if (purchaseAmount.getAmount() < 200000) {
            System.out.println(this.name + "总经理审批: " + purchaseAmount.getName() + ". 审批金额为" + purchaseAmount.getAmount());
        } else {
            System.out.println("领导大会审批: " + purchaseAmount.getName() + ". 审批金额为" + purchaseAmount.getAmount());
        }
    }

}
