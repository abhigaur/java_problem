package food_order_system.builders;

import food_order_system.models.FoodItems;
import jdk.jshell.spi.SPIResolutionException;

public class FoodItemBuilder {

    private String name;
    private double price;

    public FoodItemBuilder setName(String name)
    {
        this.name=name;
        return this;
    }
    public FoodItemBuilder setPrice(double price)
    {
        this.price=price;
        return this;
    }

    public FoodItems build()
    {
        return new FoodItems(name, price);
    }
}
