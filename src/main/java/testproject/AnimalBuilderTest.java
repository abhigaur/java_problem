package testproject;

public class AnimalBuilderTest {

    public static void main(String[] args) {
        Animal animal = new Animal.Builder()
                .withName("Abhilash")
                .withType("Dog")
                .withIsAbleToFly(true)
                .build();
        System.out.println(animal.toString());
    }
}
