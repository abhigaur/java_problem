package testproject;

public class reverseNumber {
    public static void main(String[] args) {
        int number = 9876;
        int reminder;
        int reverse = 0;

        while (number > 0) {
            reminder = number%10;
            number=number/10;
            reverse = (reverse * 10) + reminder;
        }

        System.out.println("revers is"+reverse);

    }

}
