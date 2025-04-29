package ExceptionHandling;

public class ThrowKeywordExample {

    public static void checkAge(int age) {
        if (age > 18) {

            throw new ArithmeticException("user is eligble for vote");
        } else {
            System.out.println("user not eligible for age");
        }


    }

    public static void main(String[] args) {

        checkAge(19);
    }

}
