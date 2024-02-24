package decagon_algo_repo.decagon_past_weekly_algo.week_4;

// given already

//Usually when you buy something, you're asked whether your credit card number,
//        phone number or answer to your most secret question is still correct.
//        However, since someone could look over your shoulder,
//        you don't want that shown on your screen. Instead, we mask it.
//
//        Your task is to write a function maskify, which changes all but the last four characters into '#'.
//
//        Examples (input --> output):
//        "4556364607935616" --> "############5616"
//        "64607935616" -->      "#######5616"
//        "1" -->                "1"
//        "" -->                 ""
//
//// "What was the name of your first pet?"
//        "Skippy" --> "##ippy"
//        "Nananananananananananananananana Batman!" --> "###################

// change all characters to # except the last four characters
// replace all characters with #


import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Maskify {
    public static void main(String[] args) {
        System.out.println(maskify("4556364607935616"));

    }


    public static String maskify(String str) {

       if(str.length() <= 4){
           return str;
       }else {

           // Replace all characters except the last four with '#'
           return str.substring(0, str.length() - 4).replaceAll(".", "#") +
                   str.substring(str.length() - 4);
       }
    }
}

// LINK : https://www.codewars.com/kata/5412509bd436bd33920011bc/train/java