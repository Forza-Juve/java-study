package InterfaceDemo.Demo03DefaultMethod;

public interface Pay {
    void pay(double money);

    default void showPayResult(){
        System.out.println("支付成功");
    }
}
