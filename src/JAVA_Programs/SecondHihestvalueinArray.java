package JAVA_Programs;
import java.util.Arrays;

public class SecondHihestvalueinArray {

        static int highestvalue(int[] arr){

            int n = arr.length;

            // Sort the array in non-decreasing order
            Arrays.sort(arr);

            // start from second last element as last element is the largest
            for (int i = n - 2; i >= 0; i--) {

                // return the first element which is not equal to the
                // largest element
                if (arr[i] != arr[n - 1]) {
                    return arr[i];
                }
            }

            // If no second largest element was found, return -1
            return -1;
        }

    public static void main(String[] args) {
        int[] arr = { 5,6,7,10,5,8,89 };
        System.out.println(highestvalue(arr));


    }
}
