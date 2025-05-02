package testproject;

public class SumofArrayys {

    public static void main(String[] args) {

        int[] arr = {2, 3, 5};

        int min = arr[0];
        int max=arr[2];
        int actualSum=0;

        for(int i=0;i<arr.length;i++)
        {
            actualSum=actualSum+arr[i];
        }

        int expecteedsum=(max * (max+1))/2-((min-1)*min)/ 2;

        System.out.println(expecteedsum-actualSum);


    }
}

