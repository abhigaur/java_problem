package stringPrograms;

import java.util.Scanner;

public class FindLongestNameStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "this is abhilash abhilashh gaurr abhilashhh";
		String[] spl = s.split(" ");
		String longestString = " ";

		for (int i = 0; i < spl.length; i++) {

			if(spl[i].length()>longestString.length())
			{
				longestString=spl[i];
			}
		}
		System.out.println(longestString);




	}

}
