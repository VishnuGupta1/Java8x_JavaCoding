import java.util.Arrays;


public class JAVA_String_Methods

{

    public static void main(String[] args) {

        //Java String split()
        //Method 1
        String text="Vishnu learning JAVA";


        String[] result = text.split(" ");
        System.out.print("result = ");
        for (String str : result) {
            System.out.print(str + ", ");
        }

        //2.Method -Example 3: split() at the + character

        String vowels = "a+e+f";
        String result1[]=vowels.split( "\\+ ");

        // converting array to string and printing it
        System.out.println("result1 = " + Arrays.toString(result1));
    }
//--------------------------------------------------------------------
    }

