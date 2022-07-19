package arraysPrograms;

public class DuplicateInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[]= {2,34,5,2,34,2};
		
		
		for(int i=0;i<arr.length;i++)
		{
			int count = 1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j] && arr[i]!=0) {
					
					arr[j]=0;

					

					//System.out.println("Duplicate number is "+arr[i] +" count is"+count);
					count++;
				}
			}
			
			if(count>1 && arr[i]!=0) {
			
			System.out.println("Duplicate number is "+arr[i] +" count is"+count);
			
			}
		}
	}

}
