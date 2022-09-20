package stringPrograms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class CompressString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Input s=aaabbcccccd
		// output s=a3b2c5d1

		String s = "aaabbcccccd";

		/*
		 * if(s == null || s.length() <=0) { return; }
		 * 
		 * Map<Character, Integer> map = new LinkedHashMap<Character, Integer>(); char[]
		 * charArr = s.toCharArray();
		 * 
		 * for(char chr: charArr) { if(map.keySet().contains(chr)) { map.put(chr,
		 * map.get(chr)+1); } else { map.put(chr, 1); } }
		 * 
		 * StringBuilder sb = new StringBuilder();
		 * 
		 * for(char chr : map.keySet()) { sb.append(chr); sb.append(map.get(chr)); }
		 * 
		 * if(Objects.nonNull(sb)) { System.out.println(sb); }
		 */

		char[] chr = s.toCharArray();

		for (int i = 0; i < chr.length; i++) {

			int count = 1;

			char compressed = 0;
			for (int j = i + 1; j < chr.length; j++) {

				if (chr[i] == chr[j] && chr[j] != ' ') {
					count++;

					chr[j] = ' ';

				}

				compressed = chr[i];

			}
			if (count > 1)

			{

				System.out.print(compressed + "" + count);
			}

		}

	}

}
