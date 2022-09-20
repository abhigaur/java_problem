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
		
		int size = arr.length;
		
		int sumActual=0;

		int sumExpected=0;
		for(int i=0;i<arr.length;i++)
		{
			sumActual=sumActual+arr[i];
		}
		
		System.out.println(sumActual);
		for(int i=1;i<=size+1;i++)
		{
			sumExpected=sumExpected+i;
		}
		
		System.out.println(sumExpected);
		

	}

}
