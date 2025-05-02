package builderDesignPattern;

public class Products {
    //mandtory field
    private String name;
    private double price;

    //Optional parameter
    private String description;
    private String category;
    private double discount;
    private boolean freeShipping;
    private int stock;

    private Products(ProductBuilder builder) {
        this.name = builder.name;
        this.price = builder.price;
        this.description = builder.description;
        this.category = builder.category;
        this.discount = builder.discount;
        this.freeShipping = builder.freeShipping;
        this.stock = builder.stock;
    }

    // Getter and setter for all valiable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public boolean isFreeShipping() {
        return freeShipping;
    }

    public void setFreeShipping(boolean freeShipping) {
        this.freeShipping = freeShipping;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    //to string method
    @Override
    public String toString() {
        return "Products{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", discount=" + discount +
                ", freeShipping=" + freeShipping +
                ", stock=" + stock +
                '}';
    }

    public static class ProductBuilder {
        //mandtory field
        private String name;
        private double price;

        //Optional parameter
        private String description;
        private String category;
        private double discount;
        private boolean freeShipping;
        private int stock;

        //public constuctor for mandatory field
        public ProductBuilder(String name, double price) {
            this.name = name;
            this.price = price;
        }

        // setter for non mandatory field>> if we not supply non mandatory field from constructor then we have to pass using setter method
        public ProductBuilder setDescription(String description) {
            this.description = description;
            return this;
        }

        public ProductBuilder setCategory(String category) {
            this.category = category;
            return this;
        }

        public ProductBuilder setDiscount(double discount) {
            this.discount = discount;
            return this;
        }

        public ProductBuilder setFreeShipping(boolean freeShipping) {
            this.freeShipping = freeShipping;
            return this;
        }

        public ProductBuilder setStock(int stock) {
            this.stock = stock;
            return this;
        }

        // create build method to create the object of product class
        public Products build() {

            return new Products(this);
        }

    }


}
