package kata_8;

//Triple Trouble
//        Create a function that will return a string that combines all of
//        the letters of the three inputed strings in groups.
//        Taking the first letter of all of the inputs and grouping them next to each other.
//        Do this for every letter, see example below!
//
//        E.g. Input: "aa", "bb" , "cc" => Output: "abcabc"
//
//        Note: You can expect all of the inputs to be the same length.
//

//import org.junit.Test;
//import static org.junit.Assert.assertEquals;
//
//public class TripleExampleTests {
//    @Test
//    public void tests() {
//        assertEquals("ttlheoiscstk", Kata.tripleTrouble("this", "test", "lock"));
//        assertEquals("abcabc", Kata.tripleTrouble("aa","bb","cc"));
//        assertEquals("Batman", Kata.tripleTrouble("Bm", "aa", "tn"));
//        assertEquals("LexLuthor", Kata.tripleTrouble("LLh","euo","xtr"));
//    }
//}

//Algorithm
// 1. remove the first letter from the first string and keep in an empty string
// 2. remove the first letter from the second string and concatenate in to the first letter in the empty string
// 3. remove the first letter from the third string and concatentae in to the second letter in the empty string
// 4. loop through to repeat the circle

public class TripleTrouble {

    public static void main(String[] args) {
        System.out.println(tripleTrouble("this", "test", "lock"));
    }

    public static String tripleTrouble(String one, String two, String three) {
        // Solution

//        char first = one.charAt(0);
//        char second = two.charAt(0);
//        char third = three.charAt(0);
//
//        String res1 = Character.toString(first);
//        String res2 = Character.toString(second);
//        String res3 = Character.toString(third);
//
//        String modifiedStr = one.substring(1);
//
//
//        String result = res1 + res2 + res3;
//        System.out.println(modifiedStr);
//
//
//       return result;

        StringBuilder combined = new StringBuilder();

        for(int i = 0; i < one.length(); i++){
            combined.append(one.charAt(i));
            combined.append(two.charAt(i));
            combined.append(three.charAt(i));
        }

        return combined.toString();
    }
}
