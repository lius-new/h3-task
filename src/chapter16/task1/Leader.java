package chapter16.task1;

public abstract class Leader {

    public String name;
    public Leader successor;

    public Leader(String name) {
        this.name = name;
    }

    public void setSuccessor(Leader successor) {
        this.successor = successor;
    }

    abstract void handleRequest(PurchaseAmount purchaseAmount);
}
