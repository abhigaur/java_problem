package testproject;

import java.util.LinkedHashMap;
import java.util.Map;

public class CoutWordUSingHashmap {
    public static void main(String[] args) {

        String s = "this is a number abhilash this";
        String[] spWord = s.split(" ");

        Map<String, Integer> map = new LinkedHashMap<>();

        for (String word : spWord) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);

            }


        }
        System.out.println(map);


        StringBuilder sb= new StringBuilder();
        
        int cout=0;
        for( String key:map.keySet()  )
        {
           sb.append(map.get(key));
           cout=cout+map.get(key);
        }
        System.out.println(cout);
    }
}
