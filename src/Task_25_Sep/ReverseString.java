package Task_25_Sep;

public class ReverseString {
   // public static void main(String[] args) {
        //Approach 1-Using third Variables
        /*
        String text="Java is high level language", nstr="";

        System.out.println("Original String given: " +text);
        char ch;

        for(int i=0;i<text.length();i++)
        {
            ch=text.charAt(i);
            nstr=ch+nstr;

        }
        System.out.println("After String Reversed: " +nstr);


         */

        //Approach 2
        static String reverse(String str) {
            String reverse = "";

            for (int i = str.length() - 1; i >= 0; i--) {
                reverse += str.charAt(i);
            }
            return reverse;

        }
    public static void main(String[] args) {

            String Text="This is a DOG";

            String Word=reverse(Text);
System.out.println(Word);
        }
    }

