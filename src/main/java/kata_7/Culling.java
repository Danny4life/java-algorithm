package kata_7;

//Prince Arthas needs your help! Mal'ganis has spread an infection amongst the Stratholme citizens,
//        and we must help Arthas prevent this infection from spreading to other parts of the Kingdom.
//
//        You will receive a string s as input: Each "word" represents a house, and each letter
//        represents a citizen. All infected citizens are represented as "i" or "I" in s.
//        You must eradicate them, and their neighbors. If an infected citizen appears after
//        or before a space, you should not delete the space, but keep in mind that the distance from "house" to "house" (word to word) has to have only one whitespace.
//
//        EXAMPLES:
//
//        "STRING"                       -> "STG"
//        "1i2 33 i4i5 i555ii5"          -> "33 5"
//        "It is a bit chilly"           -> "a cly"
//        "Pineapple pizza is delicious" -> "eapple za deus"
//        "It is not there"              -> "not there"
//        NOTES:
//
//        There are no apostrophes or any non-alphanumeric characters other than whitespaces.
//        Make sure there are no leading or trailing spaces in the result string
//        You will always be given a valid string.
//        You won't be provided any empty strings.
//        Good luck and for the Alliance!

/// each word is a house
// and each letter in the word is an individual
// all infected individual are represented as letter i or I
// you must eradicate them and theie neighbors on both side
// if an infected individual appear before or after a space do not delete the space
// distance between house must have only one space

//Steps
//-- check if word contains the letter i, if it does remove it and returns the word
//-- if not continue to the next letter and return the word
//-- if there is a letter before and after letter i, remove them too
//-- if there is space before or after the letter i, do not remove it
// -- there should be only one white space between word to word



public class Culling {
    public static void main(String[] args) {
        System.out.println(purify("STRING"));
    }

    public static String purify(String s) {
        //Write your code here
        return s.replaceAll("\\w?[iI]+\\w?", "").replaceAll("\\s+", " ").trim();
    }

}
