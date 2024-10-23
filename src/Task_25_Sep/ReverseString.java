package Task_25_Sep;

public class ReverseString {
    public static void main(String[] args) {
        //Approach 1-Using third Variables
        String text="Java is high level language", nstr="";

        System.out.println("Original String given: " +text);
        char ch;

        for(int i=0;i<text.length();i++)
        {
            ch=text.charAt(i);
            nstr=ch+nstr;

        }
        System.out.println("After String Reversed: " +nstr);
    }
}
