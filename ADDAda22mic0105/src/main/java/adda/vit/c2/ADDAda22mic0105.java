package adda.vit.c2;

import java.util.Date;

public class ADDAda22mic0105 {

    public static void main(String[] args) {
        // Create a Customer
        Customer customer = new Customer("Poli Reddy", "Katpadi,Vellore");
        System.out.println("Customer: " + customer.getName() + ", Address: " + customer.getAddress());

        // Create an Item
        Item item = new Item(2.5, "Notebook");
        System.out.println("Item: " + item.getDescription() + ", Shipping Weight: " + item.getShippingWeight());
        System.out.println("Price for 3 items: " + item.getPriceForQuantity(3));

        // Create OrderDetails
        OrderDetail detail1 = new OrderDetail(2, "Taxable");
        OrderDetail detail2 = new OrderDetail(3, "Non-Taxable");

        // Create an Order
        Order order = new Order(new Date(), "Pending");
        order.addOrderDetail(detail1);
        order.addOrderDetail(detail2);
        System.out.println("Order Subtotal: " + order.calcSubTotal());
        System.out.println("Order Total Weight: " + order.calcTotalWeight());

        // Create Payments
        Payment cashPayment = new Cash(200.0, 250.0);
        System.out.println("Cash Payment Amount: " + cashPayment.getAmount());

        Check checkPayment = new Check(300.0, "John Doe", "123456");
        System.out.println("Check Payment Authorized: " + checkPayment.authorized());

        Credit creditPayment = new Credit(500.0, "Jane Smith", "Visa", "12/25");
        System.out.println("Credit Payment Authorized: " + creditPayment.authorized());
    }
}
