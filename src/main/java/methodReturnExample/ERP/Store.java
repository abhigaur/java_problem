package methodReturnExample.ERP;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private String storeName;
    private List<Product> products;
    private List<Customer> customers;

    public Store(String storeName) {
        this.storeName = storeName;
        this.products = new ArrayList<>();
        this.customers = new ArrayList<>();
    }

    public void addProduct(Product product)
    {
        products.add(product);
    }
    public void addCustomer(Customer customer)
    {
        customers.add(customer);
    }

    public Product getProductByName(String name)
    {
        for(Product prod:products)
        {
           if( prod.getName().equalsIgnoreCase(name))
           {
               return prod;
           }
        }
        return null;
    }
    public Customer getCustomerByName(String name) {
        for (Customer c : customers) {
            if (c.toString().contains(name)) {
                return c;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Store: " + storeName + " | Products Available: " + products.size() + " | Customers: " + customers.size();
    }

}
