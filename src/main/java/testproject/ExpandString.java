package testproject;

import java.util.LinkedHashMap;
import java.util.Map;

public class ExpandString {
    public static void main(String[] args) {


        String s = "ssrraaajjj";


        char[] chr=s.toCharArray();

        Map<Character,Integer> map= new LinkedHashMap<>();

        for(Character cc:chr)
        {

            if(map.keySet().contains(cc))
            {
                map.put(cc,map.get(cc)+1);
            }
            else {
                map.put(cc,1);
            }
        }

        System.out.println(map);

        StringBuilder sb= new StringBuilder();

        for( Character cc:map.keySet())
        {
            sb.append(cc);
            sb.append(map.get(cc));

        }

        System.out.println(sb);


    }
}
