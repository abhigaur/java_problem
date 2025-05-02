package testproject;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class CompressStringHashmap {
    public static <sds> void main(String[] args) {
        String s = "aaabbcccccd";


        if (s == null || s.length() <= 0) {
            return;
        }

//        Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
//        char[] charArr = s.toCharArray();
//
//        for (char chr : charArr) {
//            if (map.keySet().contains(chr)) {
//                map.put(chr,
//                        map.get(chr) + 1);
//            } else {
//                map.put(chr, 1);
//            }
//        }
//        System.out.println(map);
//
//        StringBuilder sb = new StringBuilder();
//
//        for (char chr : map.keySet()) {
//            sb.append(chr);
//            sb.append(map.get(chr));
//        }
//
//        if (Objects.nonNull(sb)) {
//            System.out.println(sb);
//        }


        Map<Character, Integer> map = new LinkedHashMap<>();

        char[] chrArray = s.toCharArray();

        for (char chr : chrArray) {
            if (map.keySet().contains(chr)) {
                map.put(chr, map.get(chr) + 1);
            } else {
                map.put(chr, 1);
            }
        }
        System.out.println(map);

        StringBuilder sb= new StringBuilder();
        for(Character key:map.keySet())
        {
sb.append(key);
sb.append(map.get(key));
        }

        System.out.println(sb);

    }
}
