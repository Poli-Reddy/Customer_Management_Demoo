/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package adda.vit.c2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author polir
 */

import java.util.Date;

public class CustomerManagementTest {

    @Test
    public void testItemPriceCalculation() {
        Item item = new Item(1.5, "Sample Item");
        assertEquals(500.0, item.getPriceForQuantity(5), 0.01);
    }

    @Test
    public void testOrderSubTotalCalculation() {
        Order order = new Order(new Date(), "Pending");
        OrderDetail detail1 = new OrderDetail(2, "Taxable");
        OrderDetail detail2 = new OrderDetail(3, "Non-Taxable");

        order.addOrderDetail(detail1);
        order.addOrderDetail(detail2);

        // Assuming each detail's calcSubTotal returns 100 for simplicity
        assertEquals(50.0, order.calcSubTotal(), 0.01);
    }

    @Test
    public void testPaymentAmount() {
        Payment payment = new Cash(200.0, 250.0);
        assertEquals(20.0, payment.getAmount(), 0.01);
    }

    @Test
    public void testCheckAuthorization() {
        Check check = new Check(300.0, "John Doe", "123456");
        assertTrue(check.authorized());
    }

    @Test
    public void testCreditAuthorization() {
        Credit credit = new Credit(500.0, "Jane Smith", "Visa", "12/25");
        assertTrue(credit.authorized());
    }
}
