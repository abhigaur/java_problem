package methodReturnExample.ERP;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<CartItem> cartItems;

    public ShoppingCart()
    {
        cartItems=new ArrayList<>() ;
    }

    public void addItems(Product product,int quanitty)
    {
        cartItems.add(new CartItem(product,3));
    }

    public double getTotalCost()
    {
        double cost=0;
        for(CartItem item:cartItems)
        {
             cost = item.getTotalPrice();
        }
        return cost;
    }

    public List<CartItem> getItems() {
        return cartItems;
    }

    @Override
    public String toString() {
        return "Shopping Cart: " + cartItems;
    }
}
