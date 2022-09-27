package stringPrograms;

public class RemovingFirstChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String name="This is abhilsh";
		String[] split = name.split(" ");
		
		StringBuilder sb= new StringBuilder();
		
		
		for(int i=0;i<split.length;i++)
		{
			//System.out.println(split[i]);
			String firstLetter = split[i].substring(0,1);
			String SecondLetter = split[i].substring(1);
			//System.out.println(SecondLetter);
			sb.append(SecondLetter +" ");
			
			
		}
		
		System.out.println(sb);
	}

}
