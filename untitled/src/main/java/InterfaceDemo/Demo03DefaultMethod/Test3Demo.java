package InterfaceDemo.Demo03DefaultMethod;

public class Test3Demo {
    public static void main(String[] args) {
        Pay p1 = new AliPay();
        Pay p2 = new WeChatPay();
        p1.pay(1.1);
        p1.showPayResult();

        p2.pay(2.2);
        p2.showPayResult();
    }
}
