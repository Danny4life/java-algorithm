package kata_7;

//Given an array of ones and zeroes, convert the equivalent binary value to an integer.
//
//        Eg: [0, 0, 0, 1] is treated as 0001 which is the binary representation of 1.
//
//        Examples:
//
//        Testing: [0, 0, 0, 1] ==> 1
//        Testing: [0, 0, 1, 0] ==> 2
//        Testing: [0, 1, 0, 1] ==> 5
//        Testing: [1, 0, 0, 1] ==> 9
//        Testing: [0, 0, 1, 0] ==> 2
//        Testing: [0, 1, 1, 0] ==> 6
//        Testing: [1, 1, 1, 1] ==> 15
//        Testing: [1, 0, 1, 1] ==> 11
//        However, the arrays can have varying lengths, not just limited to 4.


//public class BinaryArrayToNumberTest {
//    @org.junit.Test
//    public void convertBinaryArrayToInt() throws Exception {
//
//        assertEquals(1, BinaryArrayToNumber.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0,0,0,1))));
//        assertEquals(15, BinaryArrayToNumber.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1,1,1,1))));
//        assertEquals(6, BinaryArrayToNumber.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0,1,1,0))));
//        assertEquals(9, BinaryArrayToNumber.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1,0,0,1))));
//
//
//    }
//
//}


// steps
//1. loop through the list
//2. multiply the current result by 2 and add the current integer

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ZeroAndOne {
    public static void main(String[] args) {
        System.out.println(ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1,1,1,1))));
    }

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        // Your Code

        int result = 0;
        for(int i = 0; i < binary.size(); i++){
            result = result * 2 + binary.get(i);

        }

        return result;
    }
}
