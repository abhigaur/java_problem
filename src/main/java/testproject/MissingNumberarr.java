package testproject;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MissingNumberarr {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5,6,8};
        int size = arr.length;
        int sumactual = 0;
        int sumexpected = 0;
//        for(int i=0;i<arr.length;i++)
//        {
//            sumactual=arr[i]+sumactual;
//        }
//        for(int j=0;j<=size+1;j++)
//        {
//            sumexpected=j+sumexpected;
//        }
//        int missing=sumexpected-sumactual;
//        System.out.println("missing is "+missing);
//        System.out.println(sumexpected +"expected");
//        System.out.println(sumactual+"actual");
//    }


        //other way

        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){

            int diff = arr[i+1] - arr[i];

            if(diff>1)
            {
                System.out.println("missing number is "+(arr[i]+1));
            }

        }


    }
}