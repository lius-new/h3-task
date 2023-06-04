package chapter16.task1;

public class PurchaseAmount {
    private String name;
    private Double amount;

    public PurchaseAmount(String name, Double amount) {
        this.name = name;
        this.amount = amount;
    }

    public Double getAmount() {
        return amount;
    }

    public String getName() {
        return name;
    }
}
