package Chapter06.ServiceLoaderDemo01.service.test;

import Chapter06.ServiceLoaderDemo01.service.Payment;

import java.util.ServiceLoader;

public class ServiceLoaderTest {
    public static void main(String[] args) {
        ServiceLoader<Payment> loader = ServiceLoader.load(Payment.class);
        for(Payment payment: loader){
            System.out.print(payment.getName());
            payment.pay(100);
        }
    }
}
