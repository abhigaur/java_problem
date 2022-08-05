package stringPrograms;

public class CountUpperCaseInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="This is Abhilash gaUrR";
		
		char[] charArr = s.toCharArray();
		
		int count=0;
		for(int i=0;i<charArr.length;i++)
		{
			 
			
			if(charArr[i]>='A' && charArr[i]<='Z' )
			{
				count++;
			}
			
			
		}
		System.out.println(count);
		
	}

}
