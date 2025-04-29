package testproject;

public class VehicleBuilderTest {
    public static void main(String[] args) {
        VehicleBuilder vehicle = new VehicleBuilder
                .Builder()
                .setBrand("Honda")
                .setModel("Elevate")
                .setMakeYear(2024)
                .setNoOfTyres(5)
                .build();

        VehicleBuilder vehicle2 = new VehicleBuilder.Builder()
                .setBrand("Tata")
                .setModel("Altroz")
                .setMakeYear(2022)
                .setNoOfTyres(5)
                .build();

        System.out.println(vehicle);
        System.out.println(vehicle2);
        System.out.println("Brand is " + vehicle.getBrand());
        System.out.println("Brand is " + vehicle2.getBrand());

    }
}
