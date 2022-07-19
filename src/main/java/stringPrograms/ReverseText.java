package stringPrograms;

public class ReverseText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String name="abhi";
		
		char[] sdf = name.toCharArray();
		
		System.out.println(sdf.length);
		
		for(int i=sdf.length-1;i>=0;i--)
		{
			System.out.println(sdf[i]);
		}

	}

}
