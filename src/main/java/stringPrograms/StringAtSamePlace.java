package stringPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StringAtSamePlace {


    //input   my name is abhilash
    //output  hs alih ba siemanym

    public static void main(String[] args) {
        // TODO Auto-generated method stub


        String str = "to the god";


        StringBuilder sb = new StringBuilder(str);

        //reverse main string

        StringBuilder reverseBuilder = sb.reverse();
        String reverseStringWithoutSpace = reverseBuilder.toString().replace(" ", "");
        StringBuilder sb1 = new StringBuilder(reverseStringWithoutSpace);

        // System.out.println(sb);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                sb1.insert(i, " ");
            }
        }

        System.out.println(sb1);


    }

}
