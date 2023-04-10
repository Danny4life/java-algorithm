package kata_7;

//Complete the function power_of_two/powerOfTwo (or equivalent, depending on your language)
//        that determines if a given non-negative integer is a power of two. From the corresponding Wikipedia entry:
//
//        a power of two is a number of the form 2n where n is an integer, i.e.
//        the result of exponentiation with number two as the base and integer n as the exponent.
//
//        You may assume the input is always valid.
//
//        Examples
//        PowerOfTwo.isPowerOfTwo(1024) // -> true
//        PowerOfTwo.isPowerOfTwo(4096) // -> true
//        PowerOfTwo.isPowerOfTwo(333)  // -> false
//        Beware of certain edge cases - for example, 1 is a power of 2 since 2^0 = 1 and 0 is not a power of 2.

//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class PowerOfTwoTest {
//
//    @Test
//    void testPowerOfTwo() {
//        assertEquals(true, PowerOfTwo.isPowerOfTwo(   2));
//        assertEquals(true, PowerOfTwo.isPowerOfTwo(4096));
//    }
//
//    @Test
//    void testNotPowersOfTwo() {
//        assertEquals(false, PowerOfTwo.isPowerOfTwo(333));
//        assertEquals(false, PowerOfTwo.isPowerOfTwo(  0));
//    }
//}

//pseudocode

public class Power {

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(333));

    }

    public static boolean isPowerOfTwo(long n) {

        if(n <= 0){
            return false;
        }

        return (n & (n - 1)) == 0;
    }
}
