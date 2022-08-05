package java_problem;

import java.util.Arrays;

public class TestClass01 {

	public static void main(String[] args) {
		
		
	String s="this is taht";
	//this
	
    //String[] splt = s.split(" ");
    
    char[] chr = s.toCharArray();
    
    
    for(int i=0;i<chr.length;i++)
    {
    	
    	//System.out.println(chr[i]);
    	int count=1;
    	
    	for(int j=i+1;j<chr.length;j++)
    	{
    		
    		if(chr[i]==chr[j] && chr[j]!=' ')
    		{
    			chr[j]=' ';
    			
    			System.out.println("Repeating char is"+chr[i]);
    			count ++;
    		}
    		
    		
    	}
    	
    	
    }
    
    
	}
	

}
