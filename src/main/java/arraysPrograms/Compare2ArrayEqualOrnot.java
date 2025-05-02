package arraysPrograms;

public class Compare2ArrayEqualOrnot {

    public static void main(String[] args) {
        // TODO Auto-generated method stub


        int arr1[] = {1, 2, 6, 4, 5, 6};
        int arr2[] = {1, 2, 6, 4, 5, 6,};

        boolean flag = false;

        if (arr1.length == arr2.length) {

            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] == arr2[i]) {
                    //System.out.println("array are equals");

                    flag = true;


                } else {


                    System.out.println("array are not equals at" + arr1[i]);

                    flag = false;


                    break;

                }

            }

        } else {
            System.out.println("Both array having differnet size");
        }

        if (flag) {

            System.out.println("array are equal");
        } else {
            System.out.println("Array are not equals");
        }

    }

}
