package builderDesignPattern;

import methodReturnExample.ERP.Product;

public class ProducTest {
    public static void main(String[] args) {
        // we can not create the object of PRoduct class because constructor is private
        //Products product= new Products();

        // use case 1  pass only mandatory field
        //By class name we can call static properties
// here create object of ProductBuilder class
        //Build method return the PRoduct

        // with mandtory field
        Products product = new Products.ProductBuilder("Apple mac book", 1000).build();
        System.out.println(product);


        //with mandatory and non mandatory field
        Products product1 = new Products.ProductBuilder("Apple mac book", 1000).setCategory("electronic").build();
        System.out.println(product1);

        Products product2 = new Products.ProductBuilder("window acer book", 1000).setCategory("electronic").build();
        System.out.println(product2);
        System.out.println(product1);



    }
}
