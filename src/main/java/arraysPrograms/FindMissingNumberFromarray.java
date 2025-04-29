package arraysPrograms;

import java.util.ArrayList;

public class FindMissingNumberFromarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr[] = { 1, 2, 3,4,5,6,7,9};
		
		
		//first way

		/*
		 * ArrayList<Integer> list1 = new ArrayList<Integer>();
		 * 
		 * ArrayList<Integer> list2 = new ArrayList<Integer>(); int count = 1;
		 * 
		 * for (int i = 0; i < 6; i++)
		 * 
		 * {
		 * 
		 * list2.add(count);
		 * 
		 * count++;
		 * 
		 * }
		 * 
		 * 
		 * for(int i=0;i<arr.length;i++) { list1.add(arr[i]); }
		 * 
		 * 
		 * for(int i=0;i<list1.size();i++) {
		 * 
		 * 
		 * if(list1.get(i)!=list2.get(i)) {
		 * System.out.println("Missing element is "+list2.get(i)); break; }
		 * 
		 * 
		 * }
		 */		
		
		//Second way

		int min = arr[0];
		int max = arr[0];
		int actualSum = 0;

		for (int i = 0; i < arr.length; i++) {
			actualSum = arr[i]+actualSum;

			if (arr[i] < min) {
				min = arr[i];
			}
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		int expectedSum = (max * (max + 1)) / 2 - ((min - 1) * min) / 2;
		int missingNumber = expectedSum - actualSum;

		System.out.println("Missing number is: " + missingNumber);


	}}
