package Task_25_Sep;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {

        /*
        Table of number n = 10, print table with For or while.

        int i=0;
        while(i<10) {
            System.out.println(i);
            i++;
        }

         */

        Scanner sc=new Scanner(System.in);
        System .out.println("Enter a value");
int nextnum=sc.nextInt();
for(int i=0; i<10;i++) {


    System.out.printf("%d x %d = %d \n",nextnum ,i ,nextnum*i);
}
    }

}
