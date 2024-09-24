package Java8X_23Sep;

public class Celsius {

    public static void main(String[] args) {


        /*
        Write a program that converts between different units
        (e.g., kilometers to miles, Celsius to Fahrenheit) based on user selection using a switch statement.
Input. -
choice - 1 - km → m, km → 1km
choice - 2 - f → c, f → c
         */

        double num = 5;
        int choice = 2;
        switch (choice) {
            case 1:
                System.out.println("converting KM to miles");
                System.out.println(num + "  KM is equal to ");
                num = num * 0.621371;
                System.out.println(num + " miles");
                break;
            case 2:
                System.out.println("converting Celsius to Fahrenheit");
                System.out.println(num + "  Celsius is equal to ");
                num = (num * 9 / 5) + 32;
                System.out.println(num + " Fahrenheit");
                break;
            default:
                System.out.println(" invalid input");

        }

    }

//Another method:



}
