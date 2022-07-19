package arraysPrograms;

public class SortingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int normalArr[]= {4,3,7,9,1};
		
		
		for(int i=0;i<normalArr.length;i++)
		{
			
			
			for (int j=i+1;j<normalArr.length;j++)
			{
				int temp = 0;
				if(normalArr[i]>normalArr[j])
				{
					temp = normalArr[i];
					normalArr[i] = normalArr[j];
					normalArr[j] = temp;

				}	
			}
			System.out.println(normalArr[i]);
			
			
		}
		
	}

}
