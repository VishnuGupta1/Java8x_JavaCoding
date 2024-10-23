package Task_25_Sep;

import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {

        //Armstrong number

        /*
        Logic
        Using Scanna


         */


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();


        int a,i=0,j=0; a=n; while(a>0) { i=a%10;
            j=(i*i*i)+j; a=a/10;
        }
        if(n==j) {
            System.out.println("It is amstrong");
        }
        else {
            System.out.println("It is not a amstrong");
        }


    }


}
