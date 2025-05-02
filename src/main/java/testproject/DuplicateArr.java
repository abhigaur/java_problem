package testproject;

public class DuplicateArr {

    public static void main(String[] args) {

        int arr[] = {2, 5, 3, 2, 9, 5, 5};
        for (int i = 0; i < arr.length; i++) {
          int  count = 1;
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    // System.out.println("Duplicate number is "+arr[i]);
                    count++;
                    arr[j] = 0;

                }
            }
            if(count>1 && arr[i]!=0)
            {
                System.out.println("find duplicate at "+arr[i] + "number of times "+count);
            }

        }
    }
}
