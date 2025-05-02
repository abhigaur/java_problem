package food_order_system.models;

import java.util.ArrayList;
import java.util.List;

public class Orders {

    private Customers customer;
    private List<FoodItems> items = new ArrayList<FoodItems>();

    public void setCustomer(Customers customer)
    {
        this.customer=customer;
    }

    public void addItems(FoodItems item)
    {
        items.add(item);
    }

    public Customers getCustomer()
    {
        return customer;
    }

    public List<FoodItems> getItems() {
        return items;
    }
    public double getTotalPrice()
    {
        return items.stream().mapToDouble(FoodItems::getPrice).sum();
    }
}
