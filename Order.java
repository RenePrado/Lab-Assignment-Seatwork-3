public class Order {

    private String item;
    private int quantity;
    private double unitPrice;
    private PaymentMode paymentMode;
    private double totalAmount;
   
    public void setItem(String item) {
        this.item = item;
    }

    public String getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public PaymentMode setPaymentMode() {
        return paymentMode;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }
    
    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount() {
        this.totalAmount = (unitPrice * quantity) - ((unitPrice * quantity) * paymentMode.determineDiscountRate());
    }
}
