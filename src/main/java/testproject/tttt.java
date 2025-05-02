package testproject;

import java.util.*;

public class tttt {

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3,4,5,6,7,9};

        int max=arr[0];
        int min=arr[0];
int actualSum=0;

        for(int i=0;i<arr.length;i++)
        {
            actualSum=actualSum+arr[i];
            if(arr[i]<min)
            {
                min=arr[i];
            }
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }

        int expectedSum=((max+1)*max)/2-((min-1)*min)/2;




        System.out.println(expectedSum-actualSum);



    }
}