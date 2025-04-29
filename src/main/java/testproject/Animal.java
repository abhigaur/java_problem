package testproject;

public class Animal {
    private String name;
    private String type;
    private Boolean isAbleToFly;

    private Animal(Builder builder) {
        this.name = builder.name;
        this.type = builder.type;
        this.isAbleToFly = builder.isAbleToFly;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public boolean isAbleToFly() {
        return isAbleToFly;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", isAbleToFly=" + isAbleToFly +
                '}';
    }

    public static class Builder{
        private String name;
        private String type;
        private Boolean isAbleToFly;

        public Builder() {

        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withType(String type) {
            this.type = type;
            return this;
        }

        public Builder withIsAbleToFly(boolean isAbleToFly) {
            this.isAbleToFly = isAbleToFly;
            return this;
        }

        public Animal build(){
            return new Animal(this);
        }
    }
}
