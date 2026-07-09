package InterfaceDemo.Demo03DefaultMethod;

public class AliPay implements Pay{
    @Override
    public void pay(double money) {
        System.out.printf("支付宝支付:%.2f元",money);
    }
}
