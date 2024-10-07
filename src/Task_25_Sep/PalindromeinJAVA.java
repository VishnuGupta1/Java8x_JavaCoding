package Task_25_Sep;


import java.util.Scanner;



public class PalindromeinJAVA {
    public static void main(String[] args) {
//Read from last to first are same

        
Scanner sc= new Scanner(System.in);
System.out.println("Enter the number");
int n=sc.nextInt();

int a, i=0, j=0;
a=n;

while(a>0){
    i=a%10;
    j=(j*10)+i;
    a=a/10;
}
if(n==j){
    System.out.println("GIven Number is Palindrome");
}

else{
    System.out.println("GIven Number is not  Palindrome");
}


    }



}
