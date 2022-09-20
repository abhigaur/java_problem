package stringPrograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemovingDuplicateCharFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//input ="this is good boyss";
		//output="th gd by";
		
		String s="this is good boyss";
		
	char[] chrs = s.toCharArray();
	
	
	Set<Character> set= new LinkedHashSet<Character>();
	
	for(int i=0;i<chrs.length;i++)
	{
		for(int j=i+1;j<chrs.length;j++)
		{
			
			if(chrs[i]==chrs[j])
			{
				chrs[i]=' ' ;
				//chrs[j]=' ' ;
			}
			else
			{
				set.add(chrs[i]);
			}
		}
		
	}
	
//	System.out.println(set);
	StringBuilder sb= new  StringBuilder();
	for(Character ss:set)
	{
		
	sb.append(ss);
	}
	
	System.out.println(sb);

	}

}
