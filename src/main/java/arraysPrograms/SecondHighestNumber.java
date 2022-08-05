package arraysPrograms;

import java.util.Arrays;

public class SecondHighestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int arr[]= {10,44,54,7,33};
		
		Arrays.sort(arr);
		
		int secondHightestNumber = 0;
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
			
			secondHightestNumber=arr[arr.length-2];
		}
		
		System.out.println(secondHightestNumber);
	}

}
