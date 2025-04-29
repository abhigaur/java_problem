package arraysPrograms;

public class SumOfArraySumEqualToNumber {

    public static void main(String[] args) {

        int arr[] = {3, 2, 7, 8, 1, 6};

        int expectedSum = 9;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                    for (int k = j + 1; k < arr.length; k++) {
                        if (arr[i] + arr[j] +arr[k]== expectedSum)
                        System.out.println(arr[i] + " " + arr[j] +" "+arr[k]);
                    }
                }
            }

        }
    }
