
import java.util.*;
public class Array_Programs {

/*
//List of array JAVA Programs
        //reverse a array
       //find middile element
       //print only first element array[2]
       //print only last element
       //rotate the array by k=2
       //print lowest number in array
       //highest element print
       //Second higest Number
       //first repeate element
       //remove duplicate element
       //Copy one Array to another Array
       //Check bothe array are equal
       //Sort of array
       //Remove Element from a array

 *
 */
   // -----------------------------------------------------------------------------------------
    //Program=1
    //Program to Find Middile Element in Given Array

       //public static void main(String[] args) {
        /*
        //First Way :-

        int arr[]={1,2,3,4,5,6};
        int MiddileElement=arr.length/2;

        System.out.println("Middile Element:"+arr[MiddileElement]);


        //Second Ways:-
int arr[]={70,800,40,71,81,400};
int MiddileIndexValue=Math.floorDiv(arr.length,2);
        System.out.println("Middle Element: " + arr[MiddileIndexValue]);
*/

        //-------------------------------------------------------------------------------------------
//Program=2
// Program to Reverse the Given Array Program

           //Approaches- Method 1-Using JAVA 8 ArrayList

    //public static void main(String[] args) {
/*
        Integer[] arr = {1, 2, 3, 4, 5};

        List<Integer>List=new ArrayList<>(Arrays.asList(arr));// Convert array to ArrayList
//Reversethe arraylist
        Collections.reverse(List);

//Convert the arraylist back to array
        Integer[] reversedArr = List.toArray(new Integer[0]);


        System.out.println(Arrays.toString(reversedArr));



      // Second Method

        Integer[] arr = {1, 2, 3, 4, 5};

        // Convert array to ArrayList
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));

        Collections.reverse(list);

        System.out.println("String reversed:"+list);


//Third ways
        int[] arr = {1, 2, 3, 4, 5};

        // Reverse the array using a new array
        int[] reversedArr = reverseArray(arr);

        // Print the reversed array
        for (int num : reversedArr) {
            System.out.print(num + " ");
        }
    }


    public static int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }

        return reversed;
    }
*/
//-----------------------------------------------------------------------------------

//Program 3
        //print only first element of the given array
/*
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7};

        System.out.println("First Element :"+arr[3]);
    */

    // -----------------------------------------------------------------------------

/*
   // Program 4- Left Rotation by k Positions
        //rotate the array by k=2

    public static void main(String[] args) {


    int[] arr = {1, 2, 3, 4, 5};  // Example array
    int k = 1;  // Number of positions to rotate

    // Rotate the array by k positions
    rotateArray(arr, k);

    // Print the rotated array
        for (int num : arr) {
        System.out.print(num + " ");
    }
}

public static void rotateArray(int[] arr, int k) {
    int n = arr.length;

    // If k is greater than the array length, reduce k to avoid unnecessary rotations
    k = k % n;

    // Reverse the entire array
    reverse(arr, 0, n - 1);

    // Reverse the first part (from 0 to k-1)
    reverse(arr, 0, k - 1);

    // Reverse the second part (from k to n-1)
    reverse(arr, k, n - 1);
}

public static void reverse(int[] arr, int start, int end) {
    while (start < end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        start++;
        end--;
    }
*/
//-------------------------------------------------------------------------------------

//Program 5:

    //Print lowest and Highest Element from array




    }



