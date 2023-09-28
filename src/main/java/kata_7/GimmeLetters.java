package kata_7;

//Given a string indicating a range of letters, return a string which includes all the letters in that range,
// including the last letter.
//        Note that if the range is given in capital letters, return the string in capitals also!
//
//        Examples
//        gimmeTheLetters("a-z") ➞ "abcdefghijklmnopqrstuvwxyz"
//
//        gimmeTheLetters("h-o") ➞ "hijklmno"
//
//        gimmeTheLetters("Q-Z") ➞ "QRSTUVWXYZ"
//
//        gimmeTheLetters("J-J") ➞ "J"
//        Notes
//        A hyphen will separate the two letters in the string.
//        You don't need to worry about error handling in this one
//        (i.e. both letters will be the same case and the second letter will
//        always be after the first alphabetically).


//class SolutionTest {
//    @DisplayName("Sample Tests")
//    @ParameterizedTest(name = "s = \"{0}\"")
//    @CsvSource(textBlock = """
//        a-z, abcdefghijklmnopqrstuvwxyz
//        h-o, hijklmno
//        Q-Z, QRSTUVWXYZ
//        J-J, J
//        a-b, ab
//        a-a, a
//        g-i, ghi
//        H-I, HI
//        y-z, yz
//        e-k, efghijk
//        a-q, abcdefghijklmnopq
//        F-O, FGHIJKLMNO
//    """)
//    void sampleTests(String s, String ans) {
//        assertEquals(ans, Solution.gimmeTheLetters(s));
//    }
//}

//STEPS
// 1. get the start and end of the letter range
// 2. create a string variable to store the result
// 3. loop through the start and end letter
// 4. return the string

public class GimmeLetters {
    public static void main(String[] args) {
        System.out.println(gimmeTheLetters("A-Z"));
    }

    public static String gimmeTheLetters(String s){
        //put your lovely code here ^_^
        char startLetter = s.charAt(0);
        char endLetter = s.charAt(2);

        StringBuilder result = new StringBuilder();

        for(char l = startLetter; l <= endLetter; l++){
            result.append(l);
        }
        return result.toString();
    }
}
