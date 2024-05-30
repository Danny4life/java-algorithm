package decagon_algo_repo.decagon_past_weekly_algo.week_6;

// Given Already to sqd22

//Task
//        In this challenge, your task is to write a function to identify
//        heterograms with k-tolernance. The signature is isogramWithTolerance(s: string, k: int) -> bool.
//
//        A heterogram is a string that contains no duplicate alphabetical
//        characters (regardless of case). "Subdermatoglyphic" is a 17-letter heterogram,
//        "dog" is a 3-letter heterogram, but "floss" isn't a heterogram because of the repeated "s".
//
//        A k-tolerant heterogram is a heterogram that allows k letters (in any case)
//        to be duplicated. So "abc" is a heterogram in the traditional sense (i.e. k=0),
//        and "abcc" isn't.
//        However, if we allow k=1 tolerance, then "abcc" is a 1-tolerant heterogram because the extra "c" can be ignored.
//        However, "abccdd" isn't 1-tolerant (it's 2-tolerant, though).
//
//        Note that tolerance applies to letters, not characters.
//        Under this definition, "abcccc" is still 1-tolerant; even though there are more than 2 repetitions of "c".
//        Similarly, "aaaabbbbcde" is 2-tolerant but not 3-tolerant.
//


//Test cases
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Nested;
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//@DisplayName("isogramWithTolerance")
//public class IsogramWithToleranceTest {
//    @Nested
//    @DisplayName("Test Cases")
//    class TestCases {
//
//        @Test
//        @DisplayName("should identify a normal isogram with 0 tolerance")
//        public void shouldIdentifyANormalIsogramWith0Tolerance() {
//            assertEquals(true, Challenge.isogramWithTolerance("subdermatoglyphic", 0));
//        }
//
//        @Test
//        @DisplayName("should identify a k isogram with 2 tolerance")
//        public void shouldIdentifyAKIsogramWith2Tolerance() {
//            assertEquals(true, Challenge.isogramWithTolerance("ssubdermatoglyphicc", 2));
//        }
//
//        @Test
//        @DisplayName("should identify a non k isogram with 2 tolerance")
//        public void shouldIdentifyANonKIsogramWith2Tolerance() {
//            assertEquals(false, Challenge.isogramWithTolerance("ssubdermatoglyphiccshhh", 2));
//        }
//
//        @Test
//        @DisplayName("should ignore non alphabetical characters and case when true")
//        public void shouldIgnoreNonAlphabeticalCharactersAndCaseWhenTrue() {
//            assertEquals(true, Challenge.isogramWithTolerance("su bd e r m a t $$og$lyphics", 2));
//        }
//
//        @Test
//        @DisplayName("should ignore non alphabetical characters and case when false")
//        public void shouldIgnoreNonAlphabeticalCharactersAndCaseWhenFalse() {
//            assertEquals(false, Challenge.isogramWithTolerance("ssu bd e r m a t $$og$lyphic sch", 2));
//        }
//
//        @Test
//        @DisplayName("should handle the empty string")
//        public void shouldHandleTheEmptyString() {
//            assertEquals(true, Challenge.isogramWithTolerance("", 0));
//            assertEquals(true, Challenge.isogramWithTolerance("", 1));
//            assertEquals(true, Challenge.isogramWithTolerance("", 2));
//        }
//
//        @Test
//        @DisplayName("should handle one character strings")
//        public void shouldHandleOneCharacterStrings() {
//            assertEquals(true, Challenge.isogramWithTolerance("a", 0));
//            assertEquals(true, Challenge.isogramWithTolerance("a", 1));
//            assertEquals(true, Challenge.isogramWithTolerance("a", 2));
//        }
//
//        @Test
//        @DisplayName("should handle two character strings with the same character")
//        public void shouldHandleTwoCharacterStringsWithTheSameCharacter() {
//            assertEquals(false, Challenge.isogramWithTolerance("aa", 0));
//            assertEquals(true, Challenge.isogramWithTolerance("aa", 1));
//            assertEquals(true, Challenge.isogramWithTolerance("aa", 2));
//        }
//
//        @Test
//        @DisplayName("should handle two character strings with different characters")
//        public void shouldHandleTwoCharacterStringsWithDifferentCharacters() {
//            assertEquals(true, Challenge.isogramWithTolerance("ab", 0));
//            assertEquals(true, Challenge.isogramWithTolerance("ab", 1));
//            assertEquals(true, Challenge.isogramWithTolerance("ab", 2));
//        }
//
//        @Test
//        @DisplayName("should handle three character strings")
//        public void shouldHandleThreeCharacterStrings() {
//            assertEquals(false, Challenge.isogramWithTolerance("aaa", 0));
//            assertEquals(false, Challenge.isogramWithTolerance("abb", 0));
//            assertEquals(true, Challenge.isogramWithTolerance("abb", 1));
//            assertEquals(true, Challenge.isogramWithTolerance("abb", 2));
//        }
//
//        @Test
//        @DisplayName("should handle larger tolerances")
//        public void shouldHandleLargerTolerances() {
//            assertEquals(true, Challenge.isogramWithTolerance("aa bb cc dd e", 4));
//            assertEquals(false, Challenge.isogramWithTolerance("aa bb cc dd ee", 4));
//        }
//
//        @Test
//        @DisplayName("should handle case")
//        public void shouldHandleCase() {
//            assertEquals(true, Challenge.isogramWithTolerance("Aa Bb Cc Dd e", 4));
//            assertEquals(false, Challenge.isogramWithTolerance("Aa Bb Cc Dd Ee", 4));
//        }
//    }
//}



public class IsogramWithTolerance {
    public static void main(String[] args) {

        // test all your cases here to get to done
        System.out.println(isogramWithTolerance("subdermatoglyphic", 0));
    }



    public static boolean isogramWithTolerance(String s, int k) {

        // Do your magic here

        return true;
    }
}



