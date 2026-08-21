package Chapter07.Day41DebugDemo;
import java.util.ArrayList;
import java.util.List;

public class OrderDebugDemo {

    public static void main(String[] args) {

        List<OrderItem> items = new ArrayList<>();

        items.add(new OrderItem("Java Book", 80.0, 2));
        items.add(new OrderItem("Notebook", 20.0, 3));
        items.add(new OrderItem("Pen", 5.0, 4));

        Order order = new Order(items, true);

        double total = order.calculateTotal();

        System.out.println("订单总金额：" + total);
    }

    static class OrderItem {

        private String name;
        private double price;
        private int quantity;

        public OrderItem(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        public double getSubtotal() {
            return price * quantity;
        }

        public String getName() {
            return name;
        }
    }

    static class Order {

        private List<OrderItem> items;
        private boolean member;

        public Order(List<OrderItem> items, boolean member) {
            this.items = items;
            this.member = member;
        }

        public double calculateTotal() {

            double total = 0;

            for (OrderItem item : items) {

                double subtotal = item.getSubtotal();

                if (member) {
                    subtotal = subtotal * 0.9;
                }

                total += subtotal;
            }

            return total;
        }
    }
}