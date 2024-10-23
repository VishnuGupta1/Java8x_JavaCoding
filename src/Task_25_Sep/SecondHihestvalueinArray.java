package Task_25_Sep;
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
        int[] arr = { 2,78,90 };
        System.out.println(highestvalue(arr));


    }
}
