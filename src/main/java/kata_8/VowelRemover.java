package kata_8;

//Create a function called shortcut to remove the lowercase vowels (a, e, i, o, u ) in a given string.
//
//        Examples
//        "hello"     -->  "hll"
//        "codewars"  -->  "cdwrs"
//        "goodbye"   -->  "gdby"
//        "HELLO"     -->  "HELLO"
//        don't worry about uppercase vowels
//        y is not considered a vowel for this kata

// given a string input
// check if the input has any of the vowels a,e,i,o,u
// if it has removed it and return the string

//steps
// instantiate the vowels
// convert the string to an array character
// loop through each character
// check if any of the character is equal to any of the listed vowels
// if true, remove it, otherwise continue
// convert array back to string and return it


public class VowelRemover {

    public static void main(String[] args) {
        System.out.println(shortcut("codewars"));
    }

    public static String shortcut(String input) {


        return input.replaceAll("[aeiou]", "");
    }
}
