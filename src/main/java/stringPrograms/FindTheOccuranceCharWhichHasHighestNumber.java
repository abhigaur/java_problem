package stringPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindTheOccuranceCharWhichHasHighestNumber {
    public static void main(String[] args) {
        Map<Character, Integer> map = new LinkedHashMap<>();

        String name = "abhilash";
        char[] chr = name.toCharArray();


        for (int i = 0; i < chr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < chr.length; j++) {
                if (chr[i] == chr[j]) {
                    chr[j] = '*';
                    count++;
                }
            }

            if (chr[i] != '*') {
                System.out.println(chr[i] + " " + count);
                map.put(chr[i], count);
            }

        }

        char maxChar = ' ';
        int maxCount = 0;
        for (Map.Entry<Character, Integer> value : map.entrySet()) {
            if (value.getValue() > maxCount) {
                maxCount = value.getValue();
                maxChar = value.getKey();

            }
        }
        System.out.println(maxChar + " " + maxCount);

    }

}
