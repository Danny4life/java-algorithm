package kata_7;

//Write a function that reverses the bits in an integer.
//
//        For example, the number 417 is 110100001 in binary.
//        Reversing the binary is 100001011 which is 267.
//
//        You can assume that the number is not negative.


//public class SolutionTest {
//    @Test
//    public void fixedTests() {
//        assertEquals("Failed for n = 417:\n", 267, BitsOfInteger.reverseBits(417));
//        assertEquals("Failed for n = 267:\n", 417, BitsOfInteger.reverseBits(267));
//        assertEquals("Failed for n = 0:\n", 0, BitsOfInteger.reverseBits(0));
//        assertEquals("Failed for n = 2017:\n", 1087, BitsOfInteger.reverseBits(2017));
//        assertEquals("Failed for n = 1023:\n", 1023, BitsOfInteger.reverseBits(1023));
//        assertEquals("Failed for n = 1024:\n", 1, BitsOfInteger.reverseBits(1024));
//    }
//}

/**
 * first convert the number to binary
 * then reverse the binary
 * then convert the binary representation to its number
 */


public class ReverseBits {

    public static void main(String[] args) {
        System.out.println(reverseBits(417));
    }

    public static int reverseBits(int n){
        //Your code here :)

        String convertToBinary = Integer.toBinaryString(n);

        String reverseBinary = "";

        int res = 0;

        for(int i = convertToBinary.length() - 1; i >= 0; i--){
            reverseBinary += convertToBinary.charAt(i);
            res = Integer.parseInt(reverseBinary, 2);

        }

        return res;
    }
}
