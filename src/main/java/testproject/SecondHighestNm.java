package testproject;

import java.util.Arrays;

public class SecondHighestNm {

    public static void main(String[] args) {

        int arr[]= {10,44,54,7,33};
       int secondHightNuber;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;

                }
            }
            System.out.println(arr[i]);


        }
        System.out.println(arr[arr.length-2]);


    }

}
