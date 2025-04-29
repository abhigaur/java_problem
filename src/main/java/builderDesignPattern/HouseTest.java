package builderDesignPattern;

public class HouseTest {

    public static void main(String[] args) {



        House hs = new House.HouseBuild()
                .setWindows(4)
                .setDoors(2)
                .build();


        System.out.println(hs);


    }
}
