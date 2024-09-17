package JavaPractice;

public class Java8x_JavaReverseString {

    public static void main(String[] args){

String s="India is beautiful country";
String nstr="";
char ch;

for(int i=0; i<s.length();i++){
    ch=s.charAt(i);
    nstr=ch+nstr;

}
System.out.println("Reversed String is:" +nstr);

    }


}
