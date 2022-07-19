package arraysPrograms;

public class FindMaxAndMinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 99, 5, 4, 3, 1, 8, 6, 20, 40, 77 ,55,100};

		int max = arr[0];
		int min=arr[0];

		for (int i = 0; i <arr.length; i++) {

			if (arr[i] >=max) {
				max = arr[i];
			}

			
			  else if (arr[i] < min) {
			  
			  min = arr[i];
			  
			  }
			 
		}

		System.out.println(max);

		System.out.println(min);

	}

}
