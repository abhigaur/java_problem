package stringPrograms;

import java.util.Scanner;

public class FindLongestNameStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="this is a good person";
		/*
		 * String[] split = name.split(" "); int[] arr= new int[split.length];
		 * 
		 * for(int i=0;i<split.length;i++) { int sizeEachWord = split[i].length();
		 * 
		 * arr[i]=sizeEachWord; //System.out.println(sizeEachWord); }
		 * 
		 * 
		 * for(int i=0;i<arr.length;i++) { System.out.println(arr[i]); }
		 */
		
		
		
		
		
		Scanner in = new Scanner(System.in);
		String name1[] = new String[10];
		int i;
		String max;
		System.out.println("ENTER 10 NAMES IN ARRAY");
		for (i = 0; i < 10; i++) {
			name1[i] = in.next();
		}
		max = name1[0];
		for (i = 0; i < 10; i++) {
			if (name1[i].length() > max.length()) {
				max = name1[i];
			}
		}
		System.out.println("Longest Name =" + max);
		in.close();

		
		

	}

}
