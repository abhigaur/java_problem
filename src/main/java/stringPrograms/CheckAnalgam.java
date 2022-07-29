package stringPrograms;

import java.util.Arrays;

public class CheckAnalgam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
String s="aba";

String s1="aba";

		
		char[] schar = s.replaceAll("\\s", "").toCharArray();
		
		
		char[] schar1 = s1.replaceAll("\\s", "").toCharArray();
		
	  Arrays.sort(schar);
		Arrays.sort(schar1);
		
		if(schar.length==schar1.length)
		{
			if(Arrays.equals(schar, schar1))
			{
				System.out.println("String is analgam");
			}
			else
			{
				System.out.println("String is not analgam");
			}
			
			
		}
		else
		{
			System.out.println("Size is not eqqual");
		}

		
	}

}
