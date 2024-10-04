package Java8X_Task_30Sep;

import java.util.Scanner;

public class FactorialProgram {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be factor");
        int n = sc.nextInt();
        int factorial = 1;

        for (int i = 1; i < n; i++) {


            factorial = factorial * i;
        }
            System.out.println(factorial);

    }
}
