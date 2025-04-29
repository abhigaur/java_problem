package testproject;

import java.util.LinkedHashMap;
import java.util.Map;

public class Expand11 {
    public static void main(String[] args) {

        String s = "aaabbcccccd";
        //a3

       char[] chr=s.toCharArray();


       Map<Character,Integer> map= new LinkedHashMap<>();

       for(Character eachChr:chr)
       {
           if(map.containsKey(eachChr))
           {
            map.put(eachChr,map.get(eachChr)+1);
           }
           else {
               map.put(eachChr,1);
           }
       }

        System.out.println(map);
    }
}
