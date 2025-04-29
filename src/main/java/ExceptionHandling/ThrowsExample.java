package ExceptionHandling;

import javax.sound.midi.Soundbank;

public class ThrowsExample {

    public static int riskyMEthod() throws ArithmeticException {
        int num = 10 / 0;
        return num;
    }


    public static void main(String[] args) {
        try {
            riskyMEthod();
        } catch (ArithmeticException e) {
            System.out.println("arithmattic exception");
        }
    }}
