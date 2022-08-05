package stringPrograms;

import java.util.Scanner;

public class ConverToLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	Scanner in = new Scanner(System.in);
		String s1, s2 = "";
		int i, len;
		char ch;

		System.out.println("Enter a Sentence");
		s1 = in.nextLine();

		len = s1.length();
		in.close();

		for (i = 0; i < len; i++) {
			ch = s1.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				// according to ascii code 32 meaning space
				
				ch = (char) (ch - 32);
			}
			s2 = s2 + ch;
		}
		System.out.println(s2);
	}
*/
	
		String s= "Name Abhilash";
		System.out.println(s.toLowerCase());

		System.out.println(s.toUpperCase());
		
	}
}
