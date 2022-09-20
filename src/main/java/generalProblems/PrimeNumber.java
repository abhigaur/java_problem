package generalProblems;

public class PrimeNumber {
	
	
	static boolean checkPRime(int number)
	{
		
		int divNum=number/2;
		
		if(number<=1)
		{
			return false;
		}
		
		else if(number==2)
		{
			return true;
		}
		
		for(int i=3;i<=divNum;i++) {
		if(number%i==0)
		{
			return false;
		}
		}
		return true;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean value = PrimeNumber.checkPRime(17);
		
		if(value)
		{
			System.out.println("number is prime");
		}
		else {
			System.out.println("number is not prime");
		}

	}

}
