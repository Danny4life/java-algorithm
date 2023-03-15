package alogorithm_not_solved;

//Your task is to find the maximum number of queens that can be put on the board so that
//        there would be one single unbeaten square (ie. threatened by no queen on the board).
//
//        The Queen can move any distance vertically, horizontally and diagonally.
//
//        Input
//        The queens(n) function takes the size of the chessboard.
//
//        �
//        ∈
//        �
//        n∈Z, so it can be negative, and values can go up to
//        14
//        1
//        1000
//        141
//        1000
//        .
//
//        Output
//        The maximum number of queens to leave one single unbeaten square
//        Return 0 if n is negative.
//        Examples
//        �
//        =
//        4
//        →
//        6
//
//        �
//        �
//        �
//        �
//        �
//        �
//        n=4→6 queens
//        �
//        =
//        5
//        →
//        12
//
//        �
//        �
//        �
//        �
//        �
//        �
//        n=5→12 queens
//        Good luck )


//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import java.math.BigInteger;
//
//class SolutionTest {
//    @Test
//    void sampleTests() {
//        //           Expected               Actual
//        assertEquals(BigInteger.valueOf(0), Chess.queens(BigInteger.valueOf(0)));
//        assertEquals(BigInteger.valueOf(0), Chess.queens(BigInteger.valueOf(1)));
//        assertEquals(BigInteger.valueOf(0), Chess.queens(BigInteger.valueOf(2)));
//        assertEquals(BigInteger.valueOf(2), Chess.queens(BigInteger.valueOf(3)));
//        assertEquals(BigInteger.valueOf(6), Chess.queens(BigInteger.valueOf(4)));
//        assertEquals(BigInteger.valueOf(12), Chess.queens(BigInteger.valueOf(5)));
//        assertEquals(BigInteger.valueOf(20), Chess.queens(BigInteger.valueOf(6)));
//        assertEquals(BigInteger.valueOf(342), Chess.queens(BigInteger.valueOf(20)));
//        assertEquals(BigInteger.valueOf(992), Chess.queens(BigInteger.valueOf(33)));
//        assertEquals(BigInteger.valueOf(2352), Chess.queens(BigInteger.valueOf(50)));
//        assertEquals(BigInteger.valueOf(0), Chess.queens(BigInteger.valueOf(-321)));
//    }


import java.math.BigInteger;

public class Chess {

    public static void main(String[] args) {
        System.out.println();
    }

    public static BigInteger queens(BigInteger n) {
        return BigInteger.valueOf(0);
    }
}
