public class PaymentApp {
    public static void main(String[] args) {

        Order order = new Order();

        order.setItem("keyboard");
        order.setQuantity(10);
        order.setUnitPrice(300.0);

        System.out.println("Order item is " + order.getItem());
        System.out.println("Unit price is " + order.getUnitPrice());
        System.out.println("Quantity is " + order.getQuantity());

        order.setPaymentMode(new GCash());
        order.setTotalAmount();
        System.out.println("\nPayment order details if GCash");
        System.out.println("Discount rate is " + order.getPaymentMode().determineDiscountRate());
        System.out.println("Payment amount is " + order.getTotalAmount());

        order.setPaymentMode(new Maya());
        order.setTotalAmount();
        System.out.println("\nPayment order details if Maya");
        System.out.println("Discount rate is " + order.getPaymentMode().determineDiscountRate());
        System.out.println("Payment amount is " + order.getTotalAmount());

        order.setPaymentMode(new ShopeePay());
        order.setTotalAmount();
        System.out.println("\nPayment order details if ShopeePay");
        System.out.println("Discount rate is " + order.getPaymentMode().determineDiscountRate());
        System.out.println("Payment amount is " + order.getTotalAmount());
    }
}
