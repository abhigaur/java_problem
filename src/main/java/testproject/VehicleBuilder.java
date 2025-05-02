package testproject;

public class VehicleBuilder {
    private String brand;
    private String model;
    private Integer makeYear;
    private Integer noOfTyres;

    private VehicleBuilder(Builder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        this.makeYear = builder.makeYear;
        this.noOfTyres = builder.noOfTyres;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "VehicleBuilder{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", makeYear=" + makeYear +
                ", noOfTyres=" + noOfTyres +
                '}';
    }

    public static class Builder {
        private String brand;
        private String model;
        private Integer makeYear;
        private Integer noOfTyres;

        public Builder(){

        }

        public Builder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder setModel(String model) {
            this.model = model;
            return this;
        }

        public Builder setMakeYear(Integer makeYear) {
            this.makeYear = makeYear;
            return this;
        }

        public Builder setNoOfTyres(Integer noOfTyres) {
            this.noOfTyres = noOfTyres;
            return this;
        }

        public VehicleBuilder build(){
            return new VehicleBuilder(this);
        }
    }
}
