package decagon_algo_repo.decagon_past_weekly_algo.week_7;
// given already sqd22
//Task
//        Write a function capitalize_words(s) which capitalizes every word in the non-null (but possibly empty)
//        string s. A word is defined as a series of characters bordered by space characters
//        and/or the start or end of the string on either side. For the purposes of this challenge,
//        punctuation is considered part of a word as a non-space character.
//
//        Any ASCII characters in the inclusive range 0-127 may exist in s.
//
//        Examples
//        capitalize_words("") -> ""
//        capitalize_words("a") -> "A"
//        capitalize_words("aa") -> "Aa"
//        capitalize_words("aaa") -> "Aaa"
//        capitalize_words("a a") -> "A A"
//        capitalize_words("aa a aaa") -> "Aa A Aaa"
//        capitalize_words(" 12D 8a A xy") -> " 12D 8a A Xy"
//        capitalize_words("ab.c") -> "Ab.c"
//        capitalize_words("ab. cC") -> "Ab. CC"
//        capitalize_words("ab\ncd") -> "Ab\nCd"
//        capitalize_words("ab\tcd") -> "Ab\tCd"


//Test cases
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Nested;
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//@DisplayName("capitalizeWords")
//public class CapitalizeWordsTest {
//    @Nested
//    @DisplayName("example tests")
//    class ExampleTests {
//
//        @Test
//        @DisplayName("empty string")
//        public void emptyString() {
//            assertEquals("", Challenge.capitalizeWords(""));
//        }
//
//        @Test
//        @DisplayName("single char")
//        public void singleChar() {
//            assertEquals("A", Challenge.capitalizeWords("a"));
//        }
//
//        @Test
//        @DisplayName("two chars")
//        public void twoChars() {
//            assertEquals("Aa", Challenge.capitalizeWords("aa"));
//        }
//
//        @Test
//        @DisplayName("three chars")
//        public void threeChars() {
//            assertEquals("Aaa", Challenge.capitalizeWords("aaa"));
//        }
//
//        @Test
//        @DisplayName("two single letter words")
//        public void twoSingleLetterWords() {
//            assertEquals("A A", Challenge.capitalizeWords("a a"));
//        }
//
//        @Test
//        @DisplayName("three words")
//        public void threeWords() {
//            assertEquals("Aa A Aaa", Challenge.capitalizeWords("aa a aaa"));
//        }
//
//        @Test
//        @DisplayName("digits")
//        public void digits() {
//            assertEquals(" 12D 8a A Xy ", Challenge.capitalizeWords(" 12D 8a A xy "));
//        }
//
//        @Test
//        @DisplayName("punctuation inside word")
//        public void punctuationInsideWord() {
//            assertEquals("Ab.c", Challenge.capitalizeWords("ab.c"));
//        }
//
//        @Test
//        @DisplayName("punctuation at end of sentence")
//        public void punctuationAtEndOfSentence() {
//            assertEquals("Ab. CC", Challenge.capitalizeWords("ab. cC"));
//        }
//
//        @Test
//        @DisplayName("newline")
//        public void newline() {
//            assertEquals("Ab\nCd", Challenge.capitalizeWords("ab\ncd"));
//        }
//
//        @Test
//        @DisplayName("tab")
//        public void tab() {
//            assertEquals("Ab\tCd", Challenge.capitalizeWords("ab\tcd"));
//        }
//
//        @Test
//        @DisplayName("multiple whitespaces")
//        public void multipleWhitespaces() {
//            assertEquals("\t B \nABB   C  Cd", Challenge.capitalizeWords("\t b \naBB   C  cd"));
//        }
//    }
//}


public class CapitalizeWords {
    public static void main(String[] args) {

    }

    public static String capitalizeWords(String s) {


        return "";
    }
}
