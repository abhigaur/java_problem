package ExceptionHandling;

public class TryCatchFinally {

    public int test(int value)
    {
        int a = value;
        System.out.println("this is test metod");
        return a;
    }

    public int test1()
    {
        try
        {
            int result=10/0;
        }
        catch (ArithmeticException e)
        {
            System.out.println("you can not enter value divide by 10");
        }
        finally {
            System.out.println("finally block");
            return test(10);
        }
    }
    public static void main(String[] args) {


        TryCatchFinally t= new TryCatchFinally();
        int valu = t.test(10);
        System.out.println(valu);

        t.test1();
    }
}
