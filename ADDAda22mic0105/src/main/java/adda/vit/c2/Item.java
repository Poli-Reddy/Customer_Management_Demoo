/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adda.vit.c2;

/**
 *
 * @author polir
 */
public class Item {
    private double shippingWeight;
    private String description;

    public Item(double shippingWeight, String description) {
        this.shippingWeight = shippingWeight;
        this.description = description;
    }

    public double getPriceForQuantity(int quantity) {
        // Example price calculation logic
        return 100 * quantity; // $100 per item
    }

    public double getTax() {
        // Example tax calculation logic
        return 0.1; // 10% tax
    }

    public boolean inStock() {
        // Example stock check logic
        return true;
    }

    // Getters and setters
    public double getShippingWeight() {
        return shippingWeight;
    }

    public void setShippingWeight(double shippingWeight) {
        this.shippingWeight = shippingWeight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
