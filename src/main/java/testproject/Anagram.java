package testproject;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Locale;

public class Anagram {



    public static void main(String[] args) {

        String s1 = "baa bb   aa";
        String result=s1.replaceAll(" ","");
        System.out.println("s1 is"+result);
        String s2 = "aaaabbb";


        char[] chr1=result.toCharArray();
        char[] chr2=s2.toCharArray();
        Arrays.sort(chr1);
        Arrays.sort(chr2);
     //   System.out.println(chr2);

        if(chr1.length!=chr2.length)
        {
            System.out.println("String is not anagram");

        }
        else if (Arrays.equals(chr1,chr2))
        {
            System.out.println("string is anagam");

        }
        else {
            System.out.println("String is not alagam");
        }
    }
}
