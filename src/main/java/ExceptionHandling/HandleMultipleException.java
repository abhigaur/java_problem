package ExceptionHandling;

public class HandleMultipleException {

    public static void main(String[] args) {
        String name=null;
       // System.out.println(name.length());

        try {
            name.length();
        }
        catch (ArithmeticException |NullPointerException e)
        {
            System.out.println(e);
        }
    }
}
