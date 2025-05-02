package methodReturnExample;

import java.util.Date;

public class Transaction {

    private double amount;
    private String type;
    private Date date;

    public Transaction(double amount,String type)
    {
        this.amount=amount;
        this.type=type;
        this.date=new Date();
    }

    public String toString()
    {
        return type +" of $" + amount +" on "+ date;
    }

}
