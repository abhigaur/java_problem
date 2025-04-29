package food_order_system.models;

public class FoodItems {

    String name;

    @Override
    public String toString() {
        return "FoodItems{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    double price;

    public FoodItems(String name, double price) {
        this.name = name;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
