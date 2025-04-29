package food_order_system.services;

import food_order_system.models.Orders;

public class BillingSystem {

    public void generateBill(Orders order)
    {
        System.out.println("\n🧾 Bill for: " + order.getCustomer().getName());
        order.getItems().forEach(item ->
                System.out.println(" - " + item)
        );
        System.out.println("Total: ₹" + order.getTotalPrice());
    }
}
