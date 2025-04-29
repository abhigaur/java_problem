package testproject;

public class SearchNumberArray {
    public static void main(String[] args) {
        int arr[]={3,4,6,8,9,2};
        boolean flag=false;
        int sNumber=8;

        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]==sNumber)
            {
                System.out.println("number found at posting"+(i+1)
                );
                flag=true;
            }
        }

        while (flag){
            System.out.println("number found");
            break;
        }
    }


}
