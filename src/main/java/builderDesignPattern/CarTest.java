package builderDesignPattern;

public class CarTest {
    public static void main(String[] args) {
//        Car carr = new Car.CarBuilder().setEngine("Ford")
//                .setColour("white")
//                .setSunroof(true)
//                .setWheel(4)
//                .build();
//
//        System.out.println(carr);

        Car.CarBuilder test = new Car.CarBuilder().setEngine("fprd");
        System.out.println(test);
    }
}
