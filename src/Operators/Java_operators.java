package Operators;

public class Java_operators {
    public static void main(String[] args) {



    /*

    ```
1. Arithmetic operators (+ - ++ * / % -- )
2. Assignment operators ( +=, =, -+, *=, /=, %=, &=, |=, >>=,<<=)
3. Comparison operators( ==, !=, > , < ,<=, >=)
3. Logical operators  ( &&- AND , ||- Or  , !-NOT )
4. Bitwise operators ( Bitwise OR (|), AND (&),  Bitwise XOR (^) Complement (~) )
5. Ternary Operator ( variable = Expression1 ? Expression2: Expression3) -Expressions
 */

        //1. Arithmetic operators (+ - ++ * / % -- )
    int a = 5;
    int b = 10;
    /*
System.out.println(a+b);
System.out.println(a-b);
System.out.println(a*b);
System.out.println(a/b);//division
System.out.println(a%b); // remiander 2
*/
       //2. Assignment operators ( +=, =, -+, *=, /=, %=, &=, |=, >>=,<<=)
        System.out.println(a+=b);//120
        System.out.println(a=b); //100
        System.out.println(a-+b);
        System.out.println(a-+b);
        System.out.println(a-+b);
        System.out.println(a-+b);
        /*
//-= operator
        int num1 = 40, num2 = 80;

        System.out.println("num1 = " + num1);//10
        System.out.println("num2 = " + num2);//20

        // Subtracting & Assigning values
        num1 -= num2;

        // Displaying the assigned values
        System.out.println("num1 = " + num1);
*/
        //( *= and %=) operator:

        int num1 = 5, num2 = 3;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // Multiplying & Assigning values
        //num1 *= num2;
        num1 %= num2;
        // Displaying the assigned values
        //System.out.println("num1 = " + num1);
        System.out.println("num1 = " + num1);

    }

}
