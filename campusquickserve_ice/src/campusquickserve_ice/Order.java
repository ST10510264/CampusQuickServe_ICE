
package campusquickserve_ice;


/*
 Order class stores all information related to a customer's order.
 */
public class Order {

    // Constant for VAT rate
    public static final double VAT_RATE = 0.15;

    // Order attributes
    private String customerName;
    private String studentNumber;
    private String itemOrdered;
    private int quantity;
    private double pricePerItem;

    // Constructor to initialise the order
    public Order(String customerName, String studentNumber, String itemOrdered, int quantity, double pricePerItem) {
        this.customerName = customerName;
        this.studentNumber = studentNumber;
        this.itemOrdered = itemOrdered;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }
    
    // Calculate subtotal
public double calculateSubtotal() {
    return quantity * pricePerItem;
}

// Calculate VAT
public double calculateVAT() {

    double afterDiscount = calculateSubtotal() - calculateDiscount();

    return afterDiscount * VAT_RATE;
}

// Calculate total
public double calculateTotal() {

    return calculateSubtotal() - calculateDiscount() + calculateVAT();
}

// Calculate discount if quantity > 3
public double calculateDiscount() {

    if (quantity > 3) {
        return calculateSubtotal() * 0.10;
    }

    return 0;
}

}
