package stringPrograms;

import java.util.LinkedHashMap;

public class map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		String s = "aaabbcccccd";
	LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
	
	char[] chrArr = s.toCharArray();
	
	
	for(char chrr:chrArr)
	{
		
		
		if(map.containsKey(chrr))
		{
		map.put(chrr, map.get(chrr)+1);	
		}
		else
		{
			map.put(chrr, 1);
		}
		
	}
	
	System.out.println(map);

	}

}
