package kata_7;
//
//Task
//        You are given an array of up to four non-negative integers, each less than 256.
//
//        Your task is to pack these integers into one number M in the following way:
//
//        The first element of the array occupies the first 8 bits of M;
//        The second element occupies next 8 bits, and so on.
//        Return the obtained integer M as unsigned integer.
//
//        Note:
//        the phrase "first bits of M" refers to the least significant bits of M - the right-most bits of an integer.
//        For further clarification see the following example.
//
//        Example
//        For a = [24, 85, 0], the output should be 21784
//
//        An array [24, 85, 0] looks like [00011000, 01010101, 00000000] in binary.
//
//        After packing these into one number we get 00000000 01010101 00011000 (spaces are placed for convenience),
//        which equals to 21784.
//
//        Input/Output
//        [input] integer array a
//        Constraints: 1 ≤ a.length ≤ 4 and 0 ≤ a[i] < 256
//
//        [output] an unsigned integer


//import org.junit.Test;
//import static org.junit.Assert.*;
//
//public class ExampleTests {
//
//    @Test
//    public void exampleTests() {
//        assertEquals(21784, Kata.arrayPacking(new int[] {24, 85, 0}));
//        assertEquals(2567447, Kata.arrayPacking(new int[] {23, 45, 39}));
//        assertEquals(257, Kata.arrayPacking(new int[] {1, 1}));
//        assertEquals(0, Kata.arrayPacking(new int[] {0}));
//        assertEquals(4294967295L, Kata.arrayPacking(new int[] {255, 255, 255, 255}));
//    }

public class SimpleFun {
    public static void main(String[] args) {
        System.out.println(arrayPacking(new int[] {24, 85, 0}));
    }

    public static long arrayPacking(int[] arr) {
        // Implement me! :)

        long result = 0L;

        for(int i = 0; i < arr.length; i++){
            result |= ((long) arr[i] << (i * 8));
        }

        return result;
    }
}
