package Chapter06.LocalInnerClassDemo;

public class DemoTest {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        orderService.processOrder("1",2,true);
    }
}
