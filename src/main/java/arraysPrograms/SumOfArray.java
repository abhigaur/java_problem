package arraysPrograms;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int[] arr= {2,4,5};
	
	int sum=0;
	
	System.out.println(arr.length);
	
	for(int i=0;i<arr.length;i++)
	{
		sum=sum+arr[i];
	}
	System.out.println(sum);

	}

}
