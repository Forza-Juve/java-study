package LocalInnerClassDemo;

public class OrderService {
    public void processOrder(String orderId, double amount,boolean orderStatus){
        class OrderValidator{
            public void validate(){
                System.out.println("订单编号："+ orderId +
                        "\n订单金额："+ amount +
                        "\n订单状态："+ (orderStatus ? "已完成":"未完成"));
            }
        }
        //amount += 1;
        OrderValidator orderValidator = new OrderValidator();
        orderValidator.validate();

    }
}
