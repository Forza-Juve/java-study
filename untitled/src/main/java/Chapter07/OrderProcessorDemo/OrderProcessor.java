package Chapter07.OrderProcessorDemo;

public class OrderProcessor {
    public double calculateOrderAmount(double price, int quantity){
        if(price <= 0 || quantity <= 0){
            throw new IllegalStateException("参数不合法，price="+price+"，quantity="+quantity);
        }
        return price * quantity;
    }
}
