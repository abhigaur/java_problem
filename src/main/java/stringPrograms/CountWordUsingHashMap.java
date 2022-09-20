package stringPrograms;

import java.util.HashMap;

public class CountWordUsingHashMap {
	
	
	
	
	
	public static void main(String[] args) {
		
		
		String s= "this is a number abhilash this";
		
		HashMap<String,Integer> map= new HashMap< String,Integer>();
		
		String[] arr = s.split(" ");

		
		for(int i=0;i<arr.length;i++)
		{
			
		if(map.containsKey(arr[i]))
		{
			Integer count = map.get(arr[i]);
			map.put(arr[i], count+1);
		}
		else {
			
			map.put(arr[i], 1);
		}
			
		}
		
		System.out.println(map);
		
		
		/*
		 * count words
		 * 5
		 * 
		 */
	
		
	}
	
	

}
