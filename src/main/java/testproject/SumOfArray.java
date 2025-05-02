package testproject;

public class SumOfArray {

    public static void main(String[] args) {
        int[] arr= {2,4,5};
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum= arr[i]+sum;
        }
        System.out.println(sum);
    }
}
