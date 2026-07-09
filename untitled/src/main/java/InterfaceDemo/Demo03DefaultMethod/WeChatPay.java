package InterfaceDemo.Demo03DefaultMethod;

public class WeChatPay implements Pay{
    @Override
    public void pay(double money) {
        System.out.printf("微信支付:%.2f元",money);
    }

    @Override
    public void showPayResult() {
        System.out.println("微信支付成功");
    }
}
