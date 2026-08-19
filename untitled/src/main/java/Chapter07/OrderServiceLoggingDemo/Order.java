package Chapter07.OrderServiceLoggingDemo;

public class Order {
    private long id;
    private String productName;
    private double amount;

    public Order(long id, String productName, double amount) {
        this.id = id;
        this.productName = productName;
        this.amount = amount;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", amount=" + amount +
                '}';
    }
}
