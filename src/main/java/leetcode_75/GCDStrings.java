package leetcode_75;

//1071. Greatest Common Divisor of Strings

//For two strings s and t, we say "t divides s" if and only if s = t + ... + t
//        (i.e., t is concatenated with itself one or more times).
//
//        Given two strings str1 and str2, return the largest string x such
//        that x divides both str1 and str2.
//
//
//
//        Example 1:
//
//        Input: str1 = "ABCABC", str2 = "ABC"
//        Output: "ABC"
//        Example 2:
//
//        Input: str1 = "ABABAB", str2 = "ABAB"
//        Output: "AB"
//        Example 3:
//
//        Input: str1 = "LEET", str2 = "CODE"
//        Output: ""
//
//
//        Constraints:
//
//        1 <= str1.length, str2.length <= 1000
//        str1 and str2 consist of English uppercase letters.

// 1. if str1 and str2 are not equal return empty string
// 2. loop thorough both strings
// 3. check each letter to see if they are equal
// 4. if yes, remove it

public class GCDStrings {
    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABCABC", "ABC"));
    }


    public static String gcdOfStrings(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();

        // Find the GCD of the lengths of str1 and str2
        int gcdLength = gcd(len1, len2);

        // Extract the substring of length gcdLength from str1
        String substring = str1.substring(0, gcdLength);

        // Check if str1 can be formed by repeating the substring
        if(str1.equals(repeat(substring, len1 / gcdLength)) &&
        str2.equals(repeat(substring, len2 / gcdLength))){
            return substring;
        }

        return "";

    }

    // Helper method to repeat a string n times
    private static String repeat(String s, int n) {
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < n; i++){
            result.append(s);
        }

        return result.toString();
    }

    // Helper method to find the GCD of two numbers using Euclid's algorithm
    public static int gcd(int a, int b) {
        while(b != 0){
            int temp = b;

            b = a % b;

            a = temp;
        }

        return a;
    }


}
