package food_order_system;

import food_order_system.builders.FoodItemBuilder;
import food_order_system.builders.OrderBuilder;
import food_order_system.models.FoodItems;
import food_order_system.models.Orders;
import food_order_system.services.BillingSystem;
import food_order_system.services.DeliveryService;

public class Appl {
    public static void main(String[] args) {
        FoodItems pizza = new FoodItemBuilder()
                .setName("Margherita Pizza")
                .setPrice(249.0)
                .build();

        FoodItems coke = new FoodItemBuilder()
                .setName("Coca-Cola")
                .setPrice(49.0)
                .build();

        Orders order = new OrderBuilder()
                .setCustomser("Abhilash", "Bangalore, India")
                .addFoodItem(pizza)
                .addFoodItem(coke)
                .build();

        new BillingSystem().generateBill(order);
        new DeliveryService().dispatch(order);
    }
}
