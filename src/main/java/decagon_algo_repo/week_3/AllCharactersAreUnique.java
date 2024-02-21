package decagon_algo_repo.week_3;

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
//        s	Return Value
//        "abcdefg"	true
//        "abbcdefg"	false
//        Interface Help
//        Run against Sample Tests: Click Run Tests above or press ⌘ + '
//        Running against Final Tests: Click Submit Solution above or press ⌘ + Enter
//        Challenge Purpose & Goals
//        A simple exercise to see how well a candidate can quickly come up with a readable and efficient solution, likely using a set data structure.
//
//        Difficulty Estimates
//        Basic Difficulty, 40 Minutes Estimated Time

//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Nested;
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//@DisplayName("hasUniqueChars")
//public class HasUniqueCharsTest {
//    @Nested
//    @DisplayName("sample tests")
//    class SampleTests {
//
//        @Test
//        @DisplayName("empty string")
//        public void emptyString() {
//            assertEquals(true, Challenge.hasUniqueChars(""));
//        }
//
//        @Test
//        @DisplayName("single letter")
//        public void singleLetter() {
//            assertEquals(true, Challenge.hasUniqueChars("a"));
//        }
//
//        @Test
//        @DisplayName("two unique letters")
//        public void twoUniqueLetters() {
//            assertEquals(true, Challenge.hasUniqueChars("ab"));
//        }
//
//        @Test
//        @DisplayName("two of same letter with different case")
//        public void twoOfSameLetterWithDifferentCase() {
//            assertEquals(true, Challenge.hasUniqueChars("aA"));
//        }
//
//        @Test
//        @DisplayName("more than two unique chars")
//        public void moreThanTwoUniqueChars() {
//            assertEquals(true, Challenge.hasUniqueChars("abcdefg"));
//        }
//
//        @Test
//        @DisplayName("two non unique letters")
//        public void twoNonUniqueLetters() {
//            assertEquals(false, Challenge.hasUniqueChars("aa"));
//        }
//
//        @Test
//        @DisplayName("two non unique characters")
//        public void twoNonUniqueCharacters() {
//            assertEquals(false, Challenge.hasUniqueChars("  "));
//        }
//
//        @Test
//        @DisplayName("more than two non unique characters")
//        public void moreThanTwoNonUniqueCharacters() {
//            assertEquals(false, Challenge.hasUniqueChars("abbcdefg"));
//        }
//    }
//}

import java.util.HashSet;
import java.util.List;

public class AllCharactersAreUnique {
    public static void main(String[] args) {
        System.out.println(hasUniqueChars("abcdefghi"));

    }

    public static boolean hasUniqueChars(String str) {
        HashSet<Character> s = new HashSet<>();

        for(char c : str.toCharArray()){
            if(!s.add(c)){
                return false;
            }
        }
        return true;
    }
}
