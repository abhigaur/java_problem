package testproject;

public class FebonicaaSeries {

    //0,1,1,2,3,5
    static int firstNumber = 0;
   static int secondNumber = 1;

    public static void main(String[] args) {

        System.out.println(firstNumber);
        System.out.println(secondNumber);
        for (int i = 0; i < 10; i++) {
            int thirdNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = thirdNumber;
            System.out.println(thirdNumber);

        }
    }
}
