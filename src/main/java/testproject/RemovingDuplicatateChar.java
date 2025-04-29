package testproject;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemovingDuplicatateChar {
    public static void main(String[] args) {
        String s= "ajeet is pramjeet";
        char[] chr=s.toCharArray();

        Set<Character> ss= new LinkedHashSet<>();
        for(char chrr:chr)
        {
            ss.add(chrr);
        }

        System.out.println(ss);

    }
}
