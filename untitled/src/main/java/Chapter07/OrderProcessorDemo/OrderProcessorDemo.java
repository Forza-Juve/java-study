package Chapter07.OrderProcessorDemo;

public class OrderProcessorDemo {
    public static void main(String[] args) {
        OrderProcessor op = new OrderProcessor();
        System.out.println(op.calculateOrderAmount(99.9,3));

        try {
            System.out.println(op.calculateOrderAmount(0,3));
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            System.out.println(op.calculateOrderAmount(99.9,-1));
        } catch (Exception e) {
            System.out.println(e);
        }
        //main现在就是调用的最顶层了，如果不处理就没地方处理了
    }
}
