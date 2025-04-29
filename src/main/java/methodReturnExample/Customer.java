package methodReturnExample;

public class Customer {

    private int customerID;
    private Account account;
    private String name;

    public Customer(int customerID,Account account,String name)
    {
        this.customerID=customerID;
        this.account=account;
        this.name=name;
    }

    public Account getAccount() {
        return account;  // Returning Account object
    }

    @Override
    public String toString() {
        return "Customer: " + name + " | ID: " + customerID;
    }
}
