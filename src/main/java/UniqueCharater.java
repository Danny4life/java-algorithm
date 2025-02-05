//Task
//        Write a program to determine if a string contains all unique characters. Return true if it does and false otherwise.
//
//        The string may contain any of the 128 ASCII characters.
//
//        Specification
//        Challenge.hasUniqueChars(s)
//        Parameters
//        s: String - The string that may or may not contain all unique characters
//
//        Return Value
//        boolean - True if all characters in the string are unique
//
//        Examples
//        s Return Value
//        "abcdefg" true
//        "abbcdefg" false


public class UniqueCharater {

    public static void main(String[] args) {// test your code here
        System.out.println(hasUniqueChars("abbcdefg"));
    }

    public static boolean hasUniqueChars(String str) {
// Do your magic here

        /**
         * step 1: create class
         * step 2: create variable
         * step 3: loop thorufh
         */



            for (int i = 0; i < str.length(); i++) {
                for (int j = i+1; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j)) {
                        return false;
                    }
                }
            }
            return true;
    }
}
