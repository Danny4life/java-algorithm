package decagon_algo_repo.decagon_past_weekly_algo.week_6;

// given already

//Task
//        An isogram is a word that has no repeating letters, consecutive or non-consecutive.
//
//        Implement a function that determines whether a string is an isogram.
//        Assume an empty string is an isogram, and ignore letter case.
//
//        Examples
//        Input	Output	Comments
//        "Dermatoglyphics"	true
//        "aba"	false
//        "moOse"	false	Ignore letter case.
//        Documentation
//        isIsogram(s)
//        Parameters:
//        s: String
//        A string of characters.
//
//        Guaranteed Constraints:
//        The string will never be null or undefined.
//        The string may be empty (""), and may contain any alphabetic character.
//        Returns: boolean
//        Return true if the string contains only unique characters (ignoring case), otherwise return false.


//Test cases
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Nested;
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//@DisplayName("isIsogram")
//public class IsIsogramTest {
//    @Nested
//    @DisplayName("Basic Cases")
//    class BasicCases {
//
//        @Test
//        @DisplayName("should be true for 'Dermatoglyphics'")
//        public void shouldBeTrueForDermatoglyphics() {
//            assertEquals(true, Challenge.isIsogram("Dermatoglyphics"));
//        }
//
//        @Test
//        @DisplayName("should be false for 'moose'")
//        public void shouldBeFalseForMoose() {
//            assertEquals(false, Challenge.isIsogram("moose"));
//        }
//
//        @Test
//        @DisplayName("should handle non-adjacent letters")
//        public void shouldHandleNonAdjacentLetters() {
//            assertEquals(false, Challenge.isIsogram("aba"));
//        }
//    }
//
//    @Nested
//    @DisplayName("Edge Cases")
//    class EdgeCases {
//
//        @Test
//        @DisplayName("should ignore case")
//        public void shouldIgnoreCase() {
//            assertEquals(false, Challenge.isIsogram("moOse"));
//        }
//
//        @Test
//        @DisplayName("should handle empty strings")
//        public void shouldHandleEmptyStrings() {
//            assertEquals(true, Challenge.isIsogram(""));
//        }
//    }
//}

// loop through the letters
// check if the current letter is equal to a previous letter
// if yes return true, else return false


import java.util.HashSet;

public class Isogram {
    public static void main(String[] args) {
        System.out.println(isIsogram("moose"));

    }

    public static boolean isIsogram(String str) {
        HashSet<Character> set = new HashSet<>();

        for(char s : str.toCharArray()){
            if(set.contains(s)){
                return false;
            }
            set.add(s);
        }
        return true;
    }
}

// LINK : https://www.codewars.com/kata/54ba84be607a92aa900000f1/train/java
