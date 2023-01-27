package kata_8;

//Sentence Smash
//        Write a function that takes an array of words and smashes them together
//        into a sentence and returns the sentence. You can ignore any need to sanitize
//        words or add punctuation, but you should add spaces between each word. Be careful,
//        there shouldn't be a space at the beginning or the end of the sentence!
//
//        Example
//        ['hello', 'world', 'this', 'is', 'great']  =>  'hello world this is great'


//
//public class SmashWordsTest {
//
//    @Test
//    public void validate() {
//        assertEquals("Bilal Djaghout", SmashWords.smash(new String[] { "Bilal", "Djaghout" }));
//    }
//
//    @Test
//    public void validateEmpty() {
//        assertEquals("", SmashWords.smash(new String[] {}));
//    }
//
//
//    @Test
//    public void validateOneWord() {
//        assertEquals("Bilal", SmashWords.smash(new String[] {"Bilal"}));
//    }
//
//}

//STEPS
// convert the array of words to string

import java.util.Arrays;

public class SmashWords {

    public static void main(String[] args) {
        System.out.println(smash("Bilal", "ghad"));
    }

    public static String smash(String... words) {
        // TODO Write your code below this comment please

       // String str = String.join(" ", words);

        return String.join(" ", words);
    }
}
