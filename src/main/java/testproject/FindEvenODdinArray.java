package testproject;

public class FindEvenODdinArray {

    public static void main(String[] args) {

        int arr[]={2,5,6,7,3,8};

        for (int i=0;i< arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                System.out.println("even number is "+arr[i]);

            }
            else {
                System.out.println("odd number is "+arr[i]);
            }
        }

    }
}
