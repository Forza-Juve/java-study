package Chapter06.ServiceLoaderDemo01.service.impl;

import Chapter06.ServiceLoaderDemo01.service.Payment;

public class WechatPayment implements Payment {
    public WechatPayment() {
    }

    @Override
    public void pay(double amount) {
        System.out.println("支付：" + amount + "元。");
    }

    @Override
    public String getName() {
        return "微信";
    }
}
