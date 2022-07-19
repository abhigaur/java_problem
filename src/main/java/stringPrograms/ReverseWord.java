package stringPrograms;


public class ReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "this is abhilash";

		String[] split = str.split(" ");

		System.out.println(split.length);
		
		

		for (int i = 0; i < split.length; i++) {

			char[] charArr = split[i].toCharArray();

			for (int j = charArr.length - 1; j >= 0; j--) {

				// covert char into string
				String s = String.valueOf(charArr[j]);

				//System.out.print(s);
				

				
				String[] splt = s.split(" ");
				
				for(int k=0;k<splt.length;k++)
				{
					//System.out.print(asd[k]);
					
					String first=splt[k].substring(0,1);  
			        String afterfirst=splt[k].substring(1);  
			        String capitalizeWord = first.toUpperCase()+afterfirst+" ";  
			        
			        System.out.print(capitalizeWord);
					
					
				}
				
				
				
				/*
				 * String[] wordSplit = s.split(" "); for(int k=0;k<wordSplit.length;k++) {
				 * 
				 * String first = wordSplit[i].substring(0,1); String afterFirst =
				 * wordSplit[i].substring(1);
				 * 
				 * String capitalizeWord = first.toUpperCase()+afterFirst+" ";
				 * 
				 * System.out.print(capitalizeWord);
				 * 
				 * }
				 */

			}

			System.out.print(" ");

		

		}
		

	}

}
