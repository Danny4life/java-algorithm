package decagon_algo_repo.decagon_past_weekly_algo.week_7;

// Given Already sqd22
//Candidate Instructions
//        Write a function that takes in a string and returns its longest substring
//        without duplicate characters.
//
//        You can assume that there will only be one longest substring without duplication.
//
//        Sample Input
//        string = "clementisacap"
//
//        Sample Output
//        "mentisac"
//        As you can see from the input above, the longest string we can take from the word
//        that does not contain any duplicate characters is mentisac
//
//

//Test cases
//import org.junit.Test;
//import static org.junit.Assert.*;
//
//public class ProgramTests {
//    @Test
//    public void TestCase1() {
//        assertEquals("mentisac", Program.longestSubstringWithoutDuplication("clementisacap"));
//    }
//
//    @Test
//    public void TestCase2() {
//        assertEquals("a", Program.longestSubstringWithoutDuplication("a"));
//    }
//
//    @Test
//    public void TestCase3() {
//        assertEquals("abc", Program.longestSubstringWithoutDuplication("abc"));
//    }
//
//    @Test
//    public void TestCase4() {
//        assertEquals("abc", Program.longestSubstringWithoutDuplication("abcb"));
//    }
//
//    @Test
//    public void TestCase5() {
//        assertEquals("abcdef", Program.longestSubstringWithoutDuplication("abcdeabcdefc"));
//    }
//
//    @Test
//    public void TestCase6() {
//        assertEquals("cdea", Program.longestSubstringWithoutDuplication("abccdeaabbcddef"));
//    }
//
//    @Test
//    public void TestCase7() {
//        assertEquals("bac", Program.longestSubstringWithoutDuplication("abacacacaaabacaaaeaaafa"));
//    }
//
//    @Test
//    public void TestCase8() {
//        assertEquals("dabcef", Program.longestSubstringWithoutDuplication("abcdabcef"));
//    }
//
//    @Test
//    public void TestCase9() {
//        assertEquals("cbde", Program.longestSubstringWithoutDuplication("abcbde"));
//    }
//
//    @Test
//    public void TestCase10() {
//        assertEquals("vsindecago", Program.longestSubstringWithoutDuplication("decadevsindecagonarelit"));
//    }
//}


import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutDuplication {
    public static void main(String[] args) {
        // test your cases here
        System.out.println(longestSubstringWithoutDuplication("decadevsindecagonarelit"));
    }

    public static String longestSubstringWithoutDuplication(String str) {
        // Do your magic here

        // This map keeps track of the last seen index of each character in the string
        Map<Character, Integer> lastSeen = new HashMap<Character, Integer>();

        // This array will store the start and end indices of the longest substring without duplicates found so far
        int[] longest = {0, 1};
        // This variable tracks the starting index of the current substring without duplicates
        int startIdx = 0;

        // Iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {
            // Get the current character
            char c = str.charAt(i);
            // Check if the character has been seen before
            if (lastSeen.containsKey(c)) {
                // Update the start index to the maximum of the current start index
                // or the index after the last occurrence of the current character
                startIdx = Math.max(startIdx, lastSeen.get(c) + 1);
            }

            // Update the longest substring if the current one is longer
            if (longest[1] - longest[0] < i + 1 - startIdx) {
                longest = new int[] {startIdx, i + 1};
            }

            // Update the last seen index of the current character to the current index
            lastSeen.put(c, i);
        }

        // Extract the longest substring without duplicates using the indices stored in the longest array
        String result = str.substring(longest[0], longest[1]);

        // Return the result
        return result;
    }
}




