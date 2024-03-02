package decagon_algo_repo.decagon_past_weekly_algo.week_7;

//345. Reverse Vowels of a String
//        Easy
//        4.2K
//        2.7K
//        Companies
//        Given a string s, reverse only all the vowels in the string and return it.
//
//        The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear
//        in both lower and upper cases, more than once.
//
//
//
//        Example 1:
//
//        Input: s = "hello"
//        Output: "holle"
//        Example 2:
//
//        Input: s = "leetcode"
//        Output: "leotcede"
//
//
//        Constraints:
//
//        1 <= s.length <= 3 * 105
//        s consist of printable ASCII characters.


public class ReverseVowels {
    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));
    }
    public static String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;

        while (left < right){
            while (left < right && !IsVowel(ch[left])){
                left++;
            }

            while (left < right && !IsVowel(ch[right])){
                right--;
            }

            if(left < right){
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                left++;
                right--;

            }
        }
            return new String(ch);

    }

    private static boolean IsVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != - 1;
    }

    // Helper method to check if a character is a vowel

}
