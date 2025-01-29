package arraysPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class DuplicateInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 2, 34, 5, 2, 34, 2 };

		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {

					arr[j] = 0;

					// System.out.println("Duplicate number is "+arr[i] +" count is"+count);
					count++;
				}
			}

			if (count > 1 && arr[i] != 0) {

				System.out.println("Duplicate number is " + arr[i] + " count is" + count);

			}
		}

		/*
		 * HashSet<Integer> set= new LinkedHashSet<Integer>(); ArrayList<Integer> list=
		 * new ArrayList<Integer>();
		 * 
		 * 
		 * for(int i=0;i<arr.length;i++) { if(set.contains(arr[i])) { list.add(arr[i]);
		 * }
		 * 
		 * set.add(arr[i]);
		 * 
		 * }
		 * 
		 * System.out.println("Duplicate are"+list);
		 * System.out.println("unque are"+set);
		 */
	}

}
