package generalProblems;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int number=12345;
		int rev = 0;
		String reverse = null ;
		String value = String.valueOf(number);
		
		for(int i=value.length()-1;i>=0;i--)
		{
			//System.out.print(value.charAt(i));
			
			
			char ijj = value.charAt(i);
			reverse  = reverse.concat(ijj);
			/*
			 * rev=Character.getNumericValue(ijj);
			 * 
			 * //rev=Integer.valueOf(ijj);
			 */		}
		

	System.out.println(reverse);

	}
	

}
