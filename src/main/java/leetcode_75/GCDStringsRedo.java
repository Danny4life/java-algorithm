package leetcode_75;



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


public class GCDStringsRedo {

    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABCABC", "ABC"));
    }

    public static String gcdOfStrings(String str1, String str2) {


        int len1 = str1.length();
        int len2 = str2.length();

        int gcdLen = gcd(len1, len2);

        String subStr = str1.substring(0, gcdLen);

        if(str1.equals(repeat(subStr, len1/gcdLen)) &&
        str2.equals(repeat(subStr, len2 / gcdLen))){
            return subStr;
        }

        return "";
    }

    private static String repeat(String s, int n) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++){
            sb.append(s);
        }
        return sb.toString();
    }

    private static int gcd(int a, int b) {

        while(b != 0){
            int temp = b;

            b = a % b;

            a = temp;
        }

        return a;
    }
}
