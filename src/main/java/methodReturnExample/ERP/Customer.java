package methodReturnExample.ERP;

public class Customer {
    private String name;
    private ShoppingCart cart;

    public Customer(String name) {
        this.name = name;
        this.cart = new ShoppingCart();
    }

    public ShoppingCart getCart() {
        return cart;
    }

    @Override
    public String toString() {
        return "Customer: " + name;
    }
}
