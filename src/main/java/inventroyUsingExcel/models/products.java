package inventroyUsingExcel.models;

public class products {

    private String id;
    private String name;

    private int quantity;
    private double price;

    public products(String id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;

    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public String toString() {
        return String.format("ID: %s, Name: %s, Qty: %d, Price: %.2f", id, name, quantity, price);
    }

    public static void main(String[] args) {
        products p= new products("1","ac",1,25000);
        System.out.println(p);
        String tewt = p.getId();
        System.out.println(tewt);
    }

}
