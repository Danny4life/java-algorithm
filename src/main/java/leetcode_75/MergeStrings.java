package leetcode_75;


//You are given two strings word1 and word2. Merge the strings by adding
//        letters in alternating order, starting with word1. If a string
//        is longer than the other, append the additional letters onto the end of the merged string.
//
//        Return the merged string.
//
//
//
//        Example 1:
//
//        Input: word1 = "abc", word2 = "pqr"
//        Output: "apbqcr"
//        Explanation: The merged string will be merged as so:
//        word1:  a   b   c
//        word2:    p   q   r
//        merged: a p b q c r
//        Example 2:
//
//        Input: word1 = "ab", word2 = "pqrs"
//        Output: "apbqrs"
//        Explanation: Notice that as word2 is longer, "rs" is appended to the end.
//        word1:  a   b
//        word2:    p   q   r   s
//        merged: a p b q   r   s
//        Example 3:
//
//        Input: word1 = "abcd", word2 = "pq"
//        Output: "apbqcd"
//        Explanation: Notice that as word1 is longer, "cd" is appended to the end.
//        word1:  a   b   c   d
//        word2:    p   q
//        merged: a p b q c   d
//
//
//        Constraints:
//
//        1 <= word1.length, word2.length <= 100
//        word1 and word2 consist of lowercase English letters.


//Though process
// 1. use string builder for effective concatenation
// 2. get the maximum length of both words
// 3. loop through maximum lenght of both words
// 4. check if the character for both word1 and word2 are available, if yes append it
// 5. return the string

public class MergeStrings {
    public static void main(String[] args) {
        System.out.println(mergeAlternately( "abctyu", "pqre"));
    }

    public static String mergeAlternately(String word1, String word2) {

        StringBuilder merged = new StringBuilder();

        int maxLen = Math.max(word1.length(), word2.length());

        for(int i = 0; i < maxLen; i++){
            if(i < word1.length()){
                merged.append(word1.charAt(i));
            }

            if(i < word2.length()){
                merged.append(word2.charAt(i));
            }
        }

        return merged.toString();
    }
}
