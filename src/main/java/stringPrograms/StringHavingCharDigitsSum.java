package stringPrograms;

import java.util.HashMap;

public class StringHavingCharDigitsSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * output  amit11
		 */
		String s="A2M3I5T2";
		
	char[] charr = s.toCharArray();
		
		
		int count=0;
		
		StringBuilder sb= new StringBuilder();
		HashMap<String, Integer> map= new HashMap<String, Integer>();
		
		for(int i=0;i<charr.length;i++)
		{
			
			if(Character.isDigit(charr[i]))
			{
				int number = Character.getNumericValue(charr[i]);
				count=count+number;
			}
			else {
				sb.append(charr[i]);
			}
		}
		
		//System.out.println(sb);
		//System.out.println(sb+""+count);
		
		sb.append(count);
		
		System.out.println(sb);
		
		

	}

}
