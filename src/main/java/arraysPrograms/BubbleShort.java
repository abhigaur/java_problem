package arraysPrograms;

public class BubbleShort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Bubble sort starts with very first two elements, comparing them to check which one is greater.

	

		int normalArr[]= {4,3,7,9,1};
		
		
		for(int i=0;i<normalArr.length;i++)
		{
			
			for(int j=i+1;j<normalArr.length;j++)
			{
				if(normalArr[i]>normalArr[j])
				{
					int temp=normalArr[i];
					normalArr[i]=normalArr[j];
					normalArr[j]=temp;
				}
			}
			
			System.out.println(normalArr[i]);
			
		}
	
	}

}
