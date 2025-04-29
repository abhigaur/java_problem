package stringPrograms;

public class UpperCaseFirstLEtter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String s="this is abhils";
		 * 
		 * String sdf = s.toUpperCase();
		 * 
		 * System.out.println(sdf);
		 * 
		 * s.toCharArray().
		 */
		
		 String s1 = "this is abhils";
		 String[] splt = s1.split(" ");
		 
		 for(int i=0;i<splt.length;i++)
		 {
			
			 String first=splt[i].substring(0,1);  
		        String afterfirst=splt[i].substring(1);  
		        String capitalizeWord = first.toUpperCase()+afterfirst+" ";
		        System.out.print(capitalizeWord);
		 
		 
		 }
		 
		
		
		

	}

}
