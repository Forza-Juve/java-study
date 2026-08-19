package Chapter07.OrderServiceLoggingDemo;

public class OrderServiceLoggingDemo {
    public static void main(String[] args) {
        OrderService os = new OrderService();
        Order o1 = os.findById(1001);
        System.out.println(o1);

        Order o2 = os.findById(1002);
        System.out.println(o2);

        Order o3 = os.findById(9999);
        System.out.println(o3);

        //这里抛出程序就终止了，所以选择了捕捉
        try {
            os.findById(-1);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
