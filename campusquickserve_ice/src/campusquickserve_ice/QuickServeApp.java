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

    }

}
