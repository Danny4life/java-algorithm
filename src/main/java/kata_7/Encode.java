package kata_7;

//Introduction
//        Digital Cypher assigns to each letter of the alphabet unique number. For example:
//
//        a  b  c  d  e  f  g  h  i  j  k  l  m
//        1  2  3  4  5  6  7  8  9 10 11 12 13
//        n  o  p  q  r  s  t  u  v  w  x  y  z
//        14 15 16 17 18 19 20 21 22 23 24 25 26
//        Instead of letters in encrypted word we write the corresponding number, eg. The word scout:
//
//        s  c  o  u  t
//        19  3 15 21 20
//        Then we add to each obtained digit consecutive digits from the key. For example.
//        In case of key equal to 1939 :
//
//        s  c  o  u  t
//        19  3 15 21 20
//        + 1  9  3  9  1
//        ---------------
//        20 12 18 30 21
//
//        m  a  s  t  e  r  p  i  e  c  e
//        13  1 19 20  5 18 16  9  5  3  5
//        +  1  9  3  9  1  9  3  9  1  9  3
//        --------------------------------
//        14 10 22 29  6 27 19 18  6  12 8
//        Task
//        Write a function that accepts str string and key number and returns
//        an array of integers representing encoded str.
//
//        Input / Output
//        The str input string consists of lowercase characters only.
//        The key input number is a positive integer.
//
//        Example
//        Encode("scout",1939);  ==>  [ 20, 12, 18, 30, 21]
//        Encode("masterpiece",1939);  ==>  [ 14, 10, 22, 29, 6, 27, 19, 18, 6, 12, 8]


//class SolutionTest {
//    private static Stream<Arguments> sampleData() {
//        return Stream.of(
//                Arguments.of("scout", 1939, new int[]{20, 12, 18, 30, 21}),
//                Arguments.of("masterpiece", 1939, new int[]{14, 10, 22, 29, 6, 27, 19, 18, 6, 12, 8})
//        );
//    }
//
//    @DisplayName("Sample Tests")
//    @ParameterizedTest(name = "message = \"{0}\" , key = {1} ")
//    @MethodSource("sampleData")
//    void sampleTests(String input, int key, int[] expected) {
//        int[] actual = Solution.encode(input, key);
//        Assertions.assertArrayEquals(expected, actual,  "Expected array: " + Arrays.toString(expected) + "\nActual array: "+ Arrays.toString(actual) + "\n");
//    }
//}

// steps
//1. create a string to store all alphabets
// 1. create an array to store the encoded message
// 2. loop through the words and encode each leters
// 3. get the ASCII value of the current letter
// 4. add the key to the letter value

public class Encode {
    public static void main(String[] args) {
        System.out.println(encode("scout", 1939));
    }

    public static int[] encode(String message, int key) {
        // Put Code Here ฅ(≈>ܫ<≈)♥

        String chars = "abcdefghijklmnopqrstuvwxyz";
        int[] charCodes = new int[message.length()];
        String keyStr = Integer.toString(key);
        int keyIterator = 0;
        int keyLength = keyStr.length();
        for(int i=0;i<message.length();i++)
        {
            charCodes[i] = chars.indexOf(message.charAt(i))+1;

            if(keyIterator == keyLength)
                keyIterator=0;
            charCodes[i] += Character.getNumericValue(keyStr.charAt(keyIterator));
            keyIterator++;
        }
        return charCodes;
    }
}
