package campusquickserve_ice;

import javax.swing.JOptionPane;

public class QuickServeApp {

    public static void main(String[] args) {

        // Collect user input using GUI popups

        String name = JOptionPane.showInputDialog("Enter Customer Name:");
        String studentNumber = JOptionPane.showInputDialog("Enter Student Number:");
        String item = JOptionPane.showInputDialog("Enter Item Ordered:");

        int quantity = Integer.parseInt(
                JOptionPane.showInputDialog("Enter Quantity:")
        );

        double price = Double.parseDouble(
                JOptionPane.showInputDialog("Enter Price Per Item:")
        );

        // Create order object
        Order order = new Order(name, studentNumber, item, quantity, price);
        
        double subtotal = order.calculateSubtotal();
double discount = order.calculateDiscount();
double vat = order.calculateVAT();
double total = order.calculateTotal();

String receipt =
        "===== Campus QuickServe Receipt =====\n\n" +
        "Customer Name: " + name + "\n" +
        "Student Number: " + studentNumber + "\n\n" +

        "Item Ordered: " + item + "\n" +
        "Quantity: " + quantity + "\n" +
        "Price Per Item: R" + price + "\n\n" +

        "Subtotal: R" + String.format("%.2f", subtotal) + "\n" +
        "Discount Applied: R" + String.format("%.2f", discount) + "\n" +
        "VAT (15%): R" + String.format("%.2f", vat) + "\n" +
        "Final Total: R" + String.format("%.2f", total) + "\n"+
        "Thank you for your order!" + "\n" +
        "------------------------------------";

JOptionPane.showMessageDialog(null, receipt);

    }

}
