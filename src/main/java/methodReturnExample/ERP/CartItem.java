package methodReturnExample.ERP;

public class CartItem {

    private Product product;
    private int quantity;

    public CartItem(Product product,int quantity)
    {
    this.product=product;
    this.quantity=quantity;
    }

    public double getTotalPrice()
    {
       return product.getPrice() * quantity;
    }
    @Override
    public String toString() {
        return product.getName() + " (x" + quantity + ") - $" + getTotalPrice();
    }
}
