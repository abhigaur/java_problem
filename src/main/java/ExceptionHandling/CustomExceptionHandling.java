package ExceptionHandling;


class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

public class CustomExceptionHandling {

    public static void checkAge(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("Age must be 18 or above to register.");
        } else {
            System.out.println("Registration successful.");
        }
    }

    public static void main(String[] args) throws Exception {

        try {
            checkAge(16); // Passing invalid age
        } catch (AgeException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }
    }
}
