package Pattern;

public class PyramidStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * for(int i=0;i<8;i++) { for(int j=8-i;j>1;j--) { System.out.print(" "); }
		 * for(int j=0;j<=i;j++) { System.out.print("*"); }
		 * 
		 * System.out.println(); }
		 */
		
		int i, j;      
		//Outer loop work for rows  
		for (i=0; i<5; i++)   
		{  
		//inner loop work for space      
		for (j=5-i; j>1; j--)   
		{  
		//prints space between two stars  
		System.out.print(" ");   
		}   
		//inner loop for columns  
		for (j=0; j<=i; j++ )   
		{   
		//prints star      
		System.out.print("* ");   
		}   
		//throws the cursor in a new line after printing each line  
		System.out.println();   
		}  

	

}}
