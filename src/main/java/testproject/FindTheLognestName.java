package testproject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class FindTheLognestName {
    public static void main(String[] args) {
        String s = "this is abhilash abhilashh gaurr abhilashhh";
        String[] spl = s.split(" ");
        String longestString = " ";

        for (int i = 0; i < spl.length; i++) {

            if(spl[i].length()>longestString.length())
            {
                longestString=spl[i];
            }
        }
        System.out.println(longestString);

    }
}