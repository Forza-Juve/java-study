package Chapter06.ServiceLoaderDemo01.service.impl;

import Chapter06.ServiceLoaderDemo01.service.Payment;

public class AlipayPayment implements Payment {
    public AlipayPayment() {
    }

    @Override
    public void pay(double amount) {
        System.out.println("支付：" + amount + "元。");
    }

    @Override
    public String getName() {
        return "支付宝";
    }
}
