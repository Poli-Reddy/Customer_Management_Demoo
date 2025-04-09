/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adda.vit.c2;

/**
 *
 * @author polir
 */
public class OrderDetail {
    private int quantity;
    private String taxStatus;

    public OrderDetail(int quantity, String taxStatus) {
        this.quantity = quantity;
        this.taxStatus = taxStatus;
    }

    public double calcSubTotal() {
        // Example subtotal calculation logic
        // Assuming each item costs $100
        return 100 * quantity;
    }

    public double calcWeight() {
        // Example weight calculation logic
        // Assuming each item weighs 1 kg
        return 1 * quantity;
    }

    public double calcTax() {
        // Example tax calculation logic
        // Assuming 10% tax
        return 0.1 * calcSubTotal();
    }

    // Getters and setters
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getTaxStatus() {
        return taxStatus;
    }

    public void setTaxStatus(String taxStatus) {
        this.taxStatus = taxStatus;
    }
}
