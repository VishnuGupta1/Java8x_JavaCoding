package Task_25_Sep;

import java.util.Scanner;
public class PrimeNumber {


    // public static void main(String[] args) {

        /*
//User Input
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        n= sc.nextInt();
         int count=0;
        for(int i=2;i<=n/2;i++) {
            if (n % i == 0) {
                count = 1;
            }
        }

                if(count==0) {
                    System.out.println("Entered number is a Prime number");
                }
                else {
                    System.out.println("Entered number is not a prime number");
*/


    ///1-10  Prime Numbers
    public static boolean isPrime(int N) {
        for (int i = 2; i < N; i++) {
            if (N % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Main function
    public static void main(String[] args) {
        // Variable to store the number of primes printed so far
        int cnt = 0;
        // Variable to store the number to be checked for prime
        int num = 2;

        // Iterate until we have printed the first 10 primes
        while (cnt < 5) {
            // Prime Check
            if (isPrime(num)) {
                System.out.println(num);
                cnt++;
            }
            num++;
        }
    }
}




