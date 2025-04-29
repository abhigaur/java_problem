package testproject;

import java.util.LinkedHashMap;
import java.util.Map;

public class CompressStringUSingMap {
    public static void main(String[] args) {

        String s = "aaabbcccccd";
        StringBuilder sb= new StringBuilder();

        Map<Character,Integer> map= new LinkedHashMap<>();

        char[] chr=s.toCharArray();

        for(int i=0;i<chr.length;i++)
        {
            if(map.containsKey(chr[i]))
            {
                map.put(chr[i],map.get(chr[i])+1);
            }
            else
            {
                map.put(chr[i],1);
            }
        }
        System.out.println(map);

        for(char mm:map.keySet())
        {
            sb.append(mm);
            sb.append(map.get(mm));
        }
        System.out.println(sb);
    }
}
