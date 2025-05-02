package stringPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CheckAnalgam {

	public static void main(String[] args) {
		String s1 = "baa bb   aa";
		String s2 = "aaaabbb";


		s1 = s1.toLowerCase().replace(" ", "");
		s2 = s2.toLowerCase();

		char[] sortS1 = s1.toCharArray();
		char[] sortS2 = s2.toCharArray();

		Arrays.sort(sortS1);
		Arrays.sort(sortS2);



		if(s1.length()!=s2.length())
		{
			System.out.println("String length is not alagam");
		}
		else if (Arrays.equals(sortS1,sortS2))
		{
			System.out.println("string is  anagram");
		}
		else {
			System.out.println("string is  not anagram");
		}

	}
}
//
//	String ss1 = "aas";
//	String ss2 = "ass";
//
//	char[] chr1 = ss1.toCharArray();
//	char[] chr2 = ss2.toCharArray();
//
//        if (chr1.length != chr2.length) {
//				System.out.println("Length is not equal");
//				return;
//				}
//
//				boolean isAnagram = true;
//
//				for (int i = 0; i < chr1.length; i++) {
//		boolean found = false;
//		for (int j = 0; j < chr2.length; j++) {
//		if (chr1[i] == chr2[j]) {
//		chr2[j] = '*'; // mark as used
//		found = true;
//		break;
//		}
//		}
//		if (!found) {
//		isAnagram = false;
//		System.out.println("Character not matched: " + chr1[i]);
//		break;
//		}
//		}
//
//		if (isAnagram) {
//		System.out.println("Anagram ✅");
//		} else {
//		System.out.println("Not anagram ❌");
//		}
//		}
//		}
