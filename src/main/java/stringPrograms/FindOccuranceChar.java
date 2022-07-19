package stringPrograms;

public class FindOccuranceChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="ab ab ab    aac";
		
		char[] charr = name.toCharArray();
		
		int size = charr.length;
		
		//System.out.println(size);
		
		for(int i=0;i<size;i++)
		{
			int count=1;
			for(int j=i+1;j<size;j++)
			{
				
				if(charr[i]==charr[j])
				{
					
					count++;
					charr[j]='0';
				}
			}
			if(count>=1 && charr[i]!='0') {

				System.out.println("Occirance of word is "+ charr[i]+"  is "+count);
			}
		}

	}

}
