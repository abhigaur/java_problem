package generalProblems;

import java.text.ParseException;
import java.util.HashMap;

public class PopulationProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HashMap<String,Integer> map= new HashMap<String, Integer>();

		HashMap<String,Integer> map2= new HashMap<String, Integer>();
		
		map.put("Delhi", 5000);

		map.put("Noida", 2000);

		map.put("GGN", 1000);

		map.put("Mumbai", 8000);

		map.put("Hyd", 7000);

		map.put("PAtna", 9000);

		map.put("GOA", 2300);

		map.put("Rachi", 2100);
		
		
		System.out.println(map.size());
		
		int sum=0;
		for(Integer value:map.values())
		{
			if(value>=5000)
			{
				 sum=sum+value;
			}
			
		}
		
		System.out.println(sum);
		
		
		
		

	}

}
