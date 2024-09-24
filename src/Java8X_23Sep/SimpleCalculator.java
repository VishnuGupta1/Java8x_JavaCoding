package Java8X_23Sep;

public class SimpleCalculator {

    /*
    Create a simple calculator that performs addition,
     subtraction, multiplication, and division, modus based on user input using switch statements

     */

    public static void main(String[] args){


        int num1=10;
        int num2=20;
        char ch='*';

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
