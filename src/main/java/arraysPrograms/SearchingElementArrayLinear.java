package arraysPrograms;

public class SearchingElementArrayLinear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean flag = false;
		int position = 0;
		
		int arr[] = { 2, 31, 4, 6, 7, 8,7,8 };

		int searchElement = 8;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == searchElement) {

				flag = true;
				 position=i;
				//break;
			}

			

		}
		if (flag) {
			System.out.println("Element found at location " +position);
		} else {

			System.out.println("Element not found at location");
		}

	}

}
