package testproject;

public class Bubble {


   static int arr[]={3,3,5,4,9,8};
    public static void main(String[] args) {



//        int len = arr.length;
//
//
//        for(int i=0;i<arr.length;i++)
//        {
//            for(int j=i+1;j<len;j++)
//            {
//                if(arr[i]>=arr[j])
//                {
//                    int temp=arr[i];
//                    arr[i]=arr[j];
//                    arr[j]=temp;
//
//                }
//            }
//
//            System.out.println(arr[i]);
//        }
//
//

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

        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
   }
}
