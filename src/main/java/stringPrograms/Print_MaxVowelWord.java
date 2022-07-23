package stringPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Print_MaxVowelWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "good auuu";

		String[] words = s.split(" ");
		
		//List<Integer> list= new ArrayList<Integer>();

	HashMap<Integer, String> hash_map = new HashMap<Integer, String>();

		for (int i = 0; i < words.length; i++) {
			char[] chr = words[i].toCharArray();
			
			int count = 0;

			for (int j = 0; j < chr.length; j++) {
				if (chr[j] == 'a' || chr[j] == 'e' || chr[j] == 'i' || chr[j] == 'o' || chr[j] == 'u') {

					count++;
					
				}
				
				
			}
			System.out.println("Count of vowel in each words are" + words[i] + count);
			//list.add(count);
			
			hash_map.put(count, words[i]);
		}
		
		
		System.out.println(hash_map);
		
	
	
		

	}

}
