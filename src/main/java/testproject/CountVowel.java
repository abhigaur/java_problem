package testproject;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class CountVowel {

    public static void main(String[] args) {
        String s = "good auuut";

        String[] words = s.split(" ");

        HashMap<String, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < words.length; i++) {
            char[] chr = words[i].toCharArray();
            int count = 0;
            for (int j = 0; j < chr.length; j++) {
                if (chr[j] == 'a' || chr[j] == 'e' || chr[j] == 'i' || chr[j] == 'o' || chr[j] == 'u') {
                    count++;
                }

            }

            System.out.println("we are having vowels in words " + words[i] + count);

        }
    }


}
