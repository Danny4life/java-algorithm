package string_methods;

import java_core.collections.Arraylist;

import java.util.ArrayList;
import java.util.List;

public class CountNumberOfVowels {


    public static void main(String[] args) {
        System.out.println(countVowel("aeiousbdhsyteioayse"));
    }

    public static int countVowel(String s){
        int count = 0;
        int size = s.length();

        for(int i = 0; i < size; i++){
            char c = s.charAt(i);

            if(isVowel(c)){
                count++;
            }
        }
        return count;
    }

    // method to check if a character is a vowel or not
    private static boolean isVowel(char c) {
        List<Character> al;

        al = new ArrayList<Character>();

        al.add('A');
        al.add('a');
        al.add('E');
        al.add('e');
        al.add('I');
        al.add('i');
        al.add('O');
        al.add('o');
        al.add('U');
        al.add('u');

        for(int j = 0; j < al.size(); j++){
            if(c == al.get(j)){
                return true;
            }
        }

        return false;

    }
}
