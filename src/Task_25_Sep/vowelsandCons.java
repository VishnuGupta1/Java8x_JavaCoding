package Task_25_Sep;

public class vowelsandCons {
    public static void main(String[] args) {


        String s="Pramod";
        int vowels=0;
        int nonvowels=0;

        for(int i=0; i<s.length();i++){

            char ch=s.charAt(i);

            if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='u'||ch=='U'){
                vowels++;

            } else {
                nonvowels++;
            }}
        System.out.println("Count of vowels is "+vowels);
        System.out.println("Count of Non Vowels is "+nonvowels);
            }

        }


