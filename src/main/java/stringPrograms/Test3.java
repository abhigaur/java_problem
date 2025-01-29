package stringPrograms;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String name="aaabbbcc";
		 * 
		 * char[] chr = name.toCharArray();
		 * 
		 * StringBuilder sb = new StringBuilder();
		 * 
		 * 
		 * 
		 * Map<Character, Integer> map= new LinkedHashMap<Character, Integer>();
		 * 
		 * 
		 * for(char chrr:chr) { if(map.containsKey(chrr)) {
		 * map.put(chrr,map.get(chrr)+1); }
		 * 
		 * else { map.put(chrr, 1); } }
		 * 
		 * 
		 * for(Character mp:map.keySet()) { sb.append(mp); sb.append(map.get(mp)); }
		 * 
		 * 
		 * System.out.println(sb);
		 */

	/*	String name = "a3b3c2";

		StringBuilder sb = new StringBuilder();

		char[] chr = name.toCharArray();

		for (int i = 0; i < chr.length; i++) {

			if (chr[i] == '1' || chr[i] == '2' || chr[i] == '3') {
				int number = Character.getNumericValue(chr[i]);

				while (number > 1) {
					sb.append(chr[i - 1]);
					number--;
				}
			}

			else {
				sb.append(chr[i]);
			}

		}
		System.out.println(sb);

	*/
		
		
	/*
	 * String strin = "ajeet is pramjeet";
	 * 
	 * String string1 = strin.replaceAll(" ", "");
	 * 
	 * char[] chr = string1.toCharArray();
	 * 
	 * Set<Character> set= new LinkedHashSet<Character> (); Set<Character> sett= new
	 * LinkedHashSet<Character> ();
	 * 
	 * List <Character> list= new LinkedList<Character>();
	 * 
	 * for(int i=0;i<chr.length;i++) { if(set.contains(chr[i])) { list.add(chr[i]);
	 * } else { set.add(chr[i]); } }
	 * 
	 * for(Character ty:list) { sett.add(ty); }
	 * 
	 * System.out.println(sett);
	 * 
	 * 
	 */
		
		
		String str = "this is abhilash";
		
		String[] split = str.split(" ");
		
		
		for(int i=0;i<split.length;i++)
		{
			char[] eachword = split[i].toCharArray();
			
			
			
			for(int j=eachword.length-1;j>=0;j--)
			{
				System.out.print(eachword[j]);
			}
			System.out.print(" ");
		}
		
		
		
		
		

}}
