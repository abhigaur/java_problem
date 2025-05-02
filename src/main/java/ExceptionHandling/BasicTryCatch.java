package ExceptionHandling;

import collections.ArrayListExample;

public class BasicTryCatch {
    public static void main(String[] args) {

// without exception handing
//        int a=10;
//        int b=0;
//        int c=a/b;
//        System.out.println(c);


        //with exception handling

        int a = 10;
        int b = 0;


        int c = 0;
        try {

            c = a / b;
        } catch (ArithmeticException e) {
            System.out.println("test" + e);
        }
    }
}
