package kata_8;

//Complete the solution so that it reverses all of the words within the string passed in.
//
//        Example(Input --> Output):"The greatest victory is that which requires no battle" -->
//        "battle no requires which that is victory greatest The"


import java.sql.Array;
import java.util.Arrays;

public class ReversedWord {

    public static void main(String[] args) {
        System.out.println(reverseWords("The greatest victory is that which requires no battle"));
    }

    public static String reverseWords(String str){
        //write your code here...

        String[] word = str.split(" ");
        String result = "";

        for(int i = word.length-1; i >= 0; i--){
            result = result + word[i];
            if(i > 0){
                result += " ";
            }
        }

        return result;


    }
}
