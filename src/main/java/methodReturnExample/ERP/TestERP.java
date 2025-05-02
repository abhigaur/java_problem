package methodReturnExample.ERP;

import java.util.List;

public class TestERP {

    public static void main(String[] args) {

        //create product
        Product p= new Product("Laptop",1000);
        System.out.println(p);

        // create cart
        CartItem cart= new CartItem(p,3);

        //create shopping cart

        ShoppingCart sc= new ShoppingCart();
        sc.addItems(p,3);
        List<CartItem> test = sc.getItems();
        System.out.println(test);


    }
}
