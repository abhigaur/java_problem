package testproject;

public class FindMissingNumnerArray {
    public static void main(String[] args) {

        int arr[]={13,10,11,14,15,12,17};

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

        for(int i=0;i<arr.length-1;i++)
        {


                if(arr[i+1]-arr[i]>1)
                {
                    System.out.println(" missing nunmber"+(arr[i]+1));
                }

            }
        }
    }



