package Pattern;

public class Paramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		/*
		 * * 5time space then star 4 time space then star 3 times spacec 2 time
		 */ 
   
		
		for (int i=0; i<7; i++)   
		{  
	      
		for (int j=7-i; j>1; j--)   
		{  
			System.out.print(" ");   
		}   
		
		for (int j=0; j<=i; j++ )   
		{   System.out.print("*");   
		}   
		
		System.out.println();  
		

	}
	}
}
