package stringPrograms;

public class CompressString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Input  s=aaabbcccccd
		//output s=a3b2c5d1
		
		String s="aaabbcccccd";
		 
		
		char compressed = 0;
		
		int count=0;
		
		char[] chr = s.toCharArray();
		
		for(int i=0;i<chr.length;i++)
		{
			count=1;
			
			for(int j=i+1;j<chr.length;j++)
			{
				
				if(chr[i]==chr[j])
				{
					count++;
					chr[j]=' ';
					
				}

				compressed=chr[i];
			}
			

			System.out.print(compressed+"" +count);
		}
		
		
	}

}
