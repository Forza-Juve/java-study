package Chapter06.ServiceLoaderDemo01.service.impl;

import Chapter06.ServiceLoaderDemo01.service.Payment;

public class UnionPayPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("支付：" + amount + "元。");
    }

    @Override
    public String getName() {
        return "银联";
    }
}
