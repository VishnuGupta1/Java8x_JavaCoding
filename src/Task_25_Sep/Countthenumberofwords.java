package Task_25_Sep;

import java.util.Scanner;

public class Countthenumberofwords {
    public static void main(String[] args) {

/*
        System.out.println("Enter the number");

        Scanner sc=new Scanner(System.in);

String s=sc.nextLine();
String[] words=s.trim().split(" ");
        System.out.println("Number of words in the string = "+words.length);
*/
        String s = "Java is java again java again";

        char c = 'v';

        int count = s.length() - s.replace("v", "").length();

        System.out.println("Number of occurances of 'v' in "+s+" = "+count);



    }

}
