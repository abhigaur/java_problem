package testproject;

public class findMinMAx {
    public static void main(String[] args) {
//        int arr[]={4,5,2,9,6};
//        System.out.println();
//        for(int i=0;i<arr.length;i++)
//        {
//            int temp;
//            for(int j=i+1;j<arr.length;j++)
//            {
//                if(arr[i]>arr[j])
//                {
//                  temp=arr[i];
//                  arr[i]=arr[j];
//                  arr[j]=temp;
//                }
//            }
//            System.out.println(arr[i]);
//        }
//
//        System.out.println("minmimum is"+arr[0]);
//
//        System.out.println("minmimum is"+arr[4]);




        //other ways

        int arr[]={4,5,2,9,6};
        int max=arr[0];
        int min =arr[0];

        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]>=max)
            {
                max=arr[i];

            }
            if(arr[i]<=min) {
                min=arr[i];
            }
        }

        System.out.println("max is "+ max);
        System.out.println("min is "+min);

    }
}
