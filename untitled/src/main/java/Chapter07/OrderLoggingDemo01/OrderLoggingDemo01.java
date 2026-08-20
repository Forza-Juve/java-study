package Chapter07.OrderLoggingDemo01;

public class OrderLoggingDemo01 {
    public static void main(String[] args) {
        Order order = new Order("ORD001",99.9);
        OrderService os = new OrderService();
        os.createOrder(order);

        Order order1 = new Order("ORD002",-10);
        //这里处理掉异常，以免报错
        try {
            os.createOrder(order1);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
