package food_order_system.builders;

import food_order_system.models.Customers;
import food_order_system.models.FoodItems;
import food_order_system.models.Orders;
import methodReturnExample.Customer;

public class OrderBuilder {

    private Orders order = new Orders();

    public OrderBuilder setCustomser(String name, String address) {
        order.setCustomer(new Customers(name, address));
        return this;
    }

    public OrderBuilder addFoodItem(FoodItems items) {
        order.addItems(items);
        return this;
    }

    public Orders build() {
        return order;
    }
}
