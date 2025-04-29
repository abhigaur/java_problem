package food_order_system.services;

import food_order_system.models.Orders;

public class DeliveryService {
    public void dispatch(Orders order) {
        System.out.println("\n🚚 Order dispatched to: " + order.getCustomer().getAddress());
    }
}