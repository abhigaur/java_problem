package builderDesignPattern;

public class Car {

    private String engine;
    private int wheel;

    private boolean sunroof;
    private String colour;

    private Car(CarBuilder car)
    {
        this.engine=car.engine;
        this.wheel=car.wheel;
        this.sunroof=car.sunroof;
        this.colour=car.colour;

    }

    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", wheel=" + wheel +
                ", sunroof=" + sunroof +
                ", colour='" + colour + '\'' +
                '}';
    }


    public static class CarBuilder
    {
        private String engine;
        private int wheel;

        private boolean sunroof;
        private String colour;

        public CarBuilder setEngine(String engine) {
            this.engine = engine;
            System.out.println("set engine"+this);
            return this;
        }

        public CarBuilder setWheel(int wheel) {
            this.wheel = wheel;
            return this;
        }

        public CarBuilder setSunroof(boolean sunroof) {
            this.sunroof = sunroof;
            return this;
        }

        public CarBuilder setColour(String colour) {
            this.colour = colour;
            return this;
        }

        public Car build()
        {
            return new Car(this);
        }
    }


}
