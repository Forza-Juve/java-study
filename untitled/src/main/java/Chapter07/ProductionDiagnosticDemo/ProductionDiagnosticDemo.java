package Chapter07.ProductionDiagnosticDemo;

import java.util.logging.Logger;

public class ProductionDiagnosticDemo {

    private static final Logger logger =
            Logger.getLogger(ProductionDiagnosticDemo.class.getName());

    public static void main(String[] args) {

        Order order = new Order("ORD-1001", 500.0, true);

        try {
            logger.info("开始处理订单：" + order);

            OrderService service = new OrderService();

            double total = service.calculateOrderTotal(order);

            logger.info("订单处理完成，最终金额：" + total);

        } catch (Exception e) {
            logger.severe("订单处理失败：" + order);
            e.printStackTrace();
        }
    }

    static class Order {

        private String id;
        private double amount;
        private boolean member;

        public Order(String id, double amount, boolean member) {
            this.id = id;
            this.amount = amount;
            this.member = member;
        }

        public String getId() {
            return id;
        }

        public double getAmount() {
            return amount;
        }

        public boolean isMember() {
            return member;
        }

        @Override
        public String toString() {
            return "Order{" +
                    "id='" + id + '\'' +
                    ", amount=" + amount +
                    ", member=" + member +
                    '}';
        }
    }

    static class OrderService {

        public double calculateOrderTotal(Order order) {

            logger.info("进入订单金额计算：" + order.getId());

            OrderCalculator calculator = new OrderCalculator();

            return calculator.calculate(order);
        }
    }

    static class OrderCalculator {

        public double calculate(Order order) {

            logger.info("开始计算订单：" + order.getId());

            double amount = order.getAmount();

            DiscountService discountService =
                    new DiscountService();

            return discountService.applyDiscount(
                    amount,
                    order.isMember()
            );
        }
    }

    static class DiscountService {

        public double applyDiscount(double amount, boolean member) {

            logger.info("开始计算折扣，amount=" +
                    amount + ", member=" + member);

            if (member) {

                if (amount < 0) {
                    throw new IllegalArgumentException(
                            "订单金额不能为负数"
                    );
                }

                return amount * 0.9;
            }

            return amount;
        }
    }
}