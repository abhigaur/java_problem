package methodReturnExample;

public class Testt1 {
    public static void main(String[] args) {
        Account account = new Account("123456789", 1000.00);
        Customer customer = new Customer(101011,account,"abhlash");
        Bank bank = new Bank("Global Bank");
        // Add customer to the bank
        bank.addCustomer(customer);

        // Perform transactions
        System.out.println("\n--- Banking Operations ---");
        System.out.println(customer);
        System.out.println(account);
        System.out.println("\nWithdrawing $300...");
        customer.getAccount().withDrawal(300);
        System.out.println(account);

        System.out.println("\nTransaction History:");
        for (Transaction t : customer.getAccount().getTransaction()) {
            System.out.println(t);
        }

        System.out.println("\n" + bank);
    }

}
