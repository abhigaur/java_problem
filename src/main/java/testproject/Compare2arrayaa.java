package testproject;

public class Compare2arrayaa {

    public static void main(String[] args) {


        int arr1[] = {3, 2, 4, 6, 6};
        int arr2[] = {3, 2, 4, 6, 6};
//        boolean flag = false;
//
//        if (arr1.length == arr2.length) {
//
//
//            for (int i = 0; i < arr1.length; i++) {
//                if (arr1[i] == arr2[i]) {
//                    flag = true;
//                }
//                else {
//                    flag=false;
//                    System.out.println("array are not equals at" + arr1[i]);
//                    break;
//                }
//            }
//            if (flag) {
//                System.out.println("arr is equal");
//            } else {
//                System.out.println("arr is not equal");
//            }
//
//
//        }

        boolean flag=false;

        if(arr1.length==arr2.length)
        {
            for(int i=0;i<arr1.length;i++)
            {
                   if(arr1[i]==arr2[i])
                    {
                        flag=true;
                    }
                    else{
                         flag=false;
                         break;


                }
            }
        }
        else {
            System.out.println("array size is not equal");
        }



        if(flag)
        {
            System.out.println("Arrya digit are equals");
        }
        else {
            System.out.println("Arrya digit are not equals");
        }


    }
}
