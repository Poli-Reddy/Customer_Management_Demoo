/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adda.vit.c2;

/**
 *
 * @author polir
 */
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date date;
    private String status;
    private List<OrderDetail> orderDetails;

    public Order(Date date, String status) {
        this.date = date;
        this.status = status;
        this.orderDetails = new ArrayList<>();
    }

    public void addOrderDetail(OrderDetail orderDetail) {
        this.orderDetails.add(orderDetail);
    }

    public double calcSubTotal() {
        double subTotal = 0;
        for (OrderDetail detail : orderDetails) {
            subTotal += detail.calcSubTotal();
        }
        return subTotal;
    }

    public double calcTax() {
        double tax = 0;
        for (OrderDetail detail : orderDetails) {
            tax += detail.calcTax();
        }
        return tax;
    }

    public double calcTotal() {
        return calcSubTotal() + calcTax();
    }

    public double calcTotalWeight() {
        double totalWeight = 0;
        for (OrderDetail detail : orderDetails) {
            totalWeight += detail.calcWeight();
        }
        return totalWeight;
    }

    // Getters and setters
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
