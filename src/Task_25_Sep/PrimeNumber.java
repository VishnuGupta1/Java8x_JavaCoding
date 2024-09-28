package Task_25_Sep;

import java.util.Scanner;
public class PrimeNumber {


    public static void main(String[] args) {


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



            }


    }
}
