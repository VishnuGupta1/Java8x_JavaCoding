package Java8X_23Sep;

public class SimpleCalculator {



    public static void main(String[] args){
 /*
    Create a simple calculator that performs addition,
     subtraction, multiplication, and division, modulas based on user input using switch statements
add
     */

        int num1=6;
        int num2=8;
        int ch='+';

        switch(ch){
            case '+':
            System.out.println(num1+num2);
         break;
            case '-':
            System.out.println(num1 - num2);
            break;
            case '*':

                System.out.println(num1 * num2);
                break;

            case '/':
                System.out.println(num1 / num2);
                break;

            default:
                System.out.println("Operation not mentioned");







        }

    }


}
