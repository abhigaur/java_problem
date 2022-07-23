package stringPrograms;

public class FindingVowelInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="this is abhilash";
		s.toLowerCase();
		
		char[] charr = s.toCharArray();
		
		for(int i=0;i<charr.length;i++)
		{
		 if(charr[i]=='a' || charr[i]=='e' || charr[i]=='i' ||charr[i]=='o' ||charr[i]=='u') {
			 
			 System.out.println("String having vowel are"+ charr[i]);
		 }
		}
	}

}
