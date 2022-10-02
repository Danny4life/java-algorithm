package kata_7;

//Odd bits are getting ready for Bits Battles.
//
//        Therefore the n bits march from right to left along an 8 bits path.
//        Once the most-significant bit reaches the left their march is done.
//        Each step will be saved as an array of 8 integers.
//
//        Return an array of all the steps.
//
//        1 <= n <= 8
//
//        NOTE: n != 0, because n represents the number of 1s.
//
//        Examples
//        This resembles a simple 8 LED chaser:
//
//        n = 3
//
//        00000111
//        00001110
//        00011100
//        00111000
//        01110000
//        11100000
//        n = 7
//
//        01111111
//        11111110
//

import java.util.Arrays;

public class OddMarchBit {

    public static void main(String[] args) {

        int[] bit = {1,1,1,1,1,1,1,1};
        System.out.println(BitMarch(8));
    }

    public static int[][] BitMarch(int n) {

        int[][] result = new int[9 - n][8];
        for(int y = 0; y < result.length; y++){
            Arrays.fill(result[y], 8 - y - n, 8 - y, 1);

        }

        return result;
    }
}
