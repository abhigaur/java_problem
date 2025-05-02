package java_problem;

import java.util.LinkedHashMap;
import java.util.Map;

public class test2 {
    public static void main(String[] args) {


        int arr[] = {3, 14, 7, 24};


        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                int temp = 0;
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }


            }


                   }
        System.out.println(arr[arr.length-2]);


    }}

