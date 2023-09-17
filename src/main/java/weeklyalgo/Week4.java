package weeklyalgo;

//Task
//        You are given an array of up to four non-negative integers, each less than 256.
//
//        Your task is to pack these integers into one number M so that the first element
//        of the array occupies the first (or least significant) 8 bits of M; the second
//        element occupies next 8 bits, and so on.
//
//        Return the obtained integer M as unsigned integer.
//
//        Note
//        As indicated the first 8 bits are the least significant bits of M, meaning the right-most bits of the integer.
//        For further clarification see the following example.
//
//        Specification
//        Challenge.arrayPacking(array)
//        Parameters
//        array: List<Integer> - up to four unsigned integers
//
//        Return Value
//        Integer - an unsigned integer
//
//        Constraints
//        array.length == 3
//
//        0 ≤ array[i] < 256
//
//        Example
//        For [24, 85, 0] the output should be 21784
//
//        [24,       85,       0       ] - The initial array
//        [00011000, 01010101, 00000000] - Translate each number to Binary
//        000000000101010100011000    - Compact to a single number
//        21784              - Translate to Decimal

//MONDAY
// https://www.qualified.io/assess/64fec62637f21b0036f7413e

//TUESDAY
// https://www.qualified.io/assess/64fecc4449b62b01adfae578


// steps
// 1. initialize a variable to 0 to store the packed integer
// 2. loop through the given array
// 3. then shifts each element by 8*i to the left
// 4. return the packed integer
// use of the bitwise operator so shift the value


import java.util.ArrayList;
import java.util.List;

public class Week4 {

    public static void main(String[] args) {
        System.out.println(arrayPacking(new ArrayList<>()));

    }

    public static int arrayPacking(ArrayList<Integer> integers) {

        int packedInteger = 0;

        for(int i = 0; i < integers.size(); i++){
            packedInteger |= (integers.get(i) << (8 * i));
        }
        return packedInteger;
    }
}
