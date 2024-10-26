package Task_25_Sep;


import javax.print.DocFlavor;
import java.util.HashMap;
//import java.util.HashMap;

public class OccuranceofWordsinString {
    public static void main(String[] args) {

        String s="Welcome to India";

        //Declare a Hashmap

        HashMap<String, Integer> hashmap=new HashMap<>();

        String[] words=s.split(" ");  //Spilt the string

        for( String text:words){

            Integer integer=hashmap.get(words);

            if(integer==null){
                hashmap.put(text,1);
            }

            else {
                hashmap.put(text,integer+1);

            }
           System.out.println(hashmap);

        }

    }
}
