package methodReturnExample;

import java.util.ArrayList;
import java.util.List;

public class Account {

    private String accountNumber;
    private double balance;
    private List<Transaction> transactions;

    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.transactions = new ArrayList<>();

    }

    public void depostAmount(double amount)
    {
        balance +=amount;
        transactions.add(new Transaction(amount,"deposit"));
    }

    public boolean withDrawal(double amount)
    {

        if(amount>balance)
        {
            System.out.println("not sufficinet balance");
            return false;
        }
        balance -=amount;
        transactions.add(new Transaction(amount,"withdrawal"));
        return true;
    }
    public double getBalance()
    {
        return balance;
    }

    public  List<Transaction> getTransaction()
    {
        return transactions;
    }

    public String toString()
    {
        return  "account number"+ accountNumber +"Balance is "+balance;
    }
}
