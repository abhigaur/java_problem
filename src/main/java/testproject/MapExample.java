package testproject;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {


        String s = "aaabbcccccd";

        char[] chr = s.toCharArray();

        Map<String,Integer> map= new LinkedHashMap<>();

        map.put("A",1);

        map.put("B",2);

        map.put("C",3);

        map.put("D",4);
        map.put("E",5);
        map.put("F",6);
        map.put("G",7);

        System.out.println(map.get("A"));
        System.out.println(map.keySet());
        System.out.println(map.values());





    }
}
