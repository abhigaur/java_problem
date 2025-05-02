package methodReturnExample;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String bankName;
    private List<Customer> customers;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);

    }

    public Customer getCustomer(String customerId) {
        for (Customer customer : customers) {
            if (customer.equals(customerId)) {
                return customer;
            }
        }
        return null;
    }
    public String toString() {
        return "Bank: " + bankName + " | Total Customers: " + customers.size();
    }
}
