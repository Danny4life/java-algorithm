package kata_7;

//A latin square is an n × n array filled with the integers 1 to n, each occurring once in each row and column.
//
//        Here are examples of latin squares of size 4 and 7:
//
//        [[1, 4, 3, 2],      [[2, 3, 1, 7, 4, 6, 5],
//        [4, 3, 2, 1],       [7, 1, 6, 5, 2, 4, 3],
//        [3, 2, 1, 4],       [6, 7, 5, 4, 1, 3, 2],
//        [2, 1, 4, 3]]       [4, 5, 3, 2, 6, 1, 7],
//        [5, 6, 4, 3, 7, 2, 1],
//        [1, 2, 7, 6, 3, 5, 4],
//        [3, 4, 2, 1, 5, 7, 6]]
//        Latin squares have many practical uses, for example in error-correcting-codes
//        and the design of agricultural experiments.
//        See https://en.wikipedia.org/wiki/Latin_square for more details.
//        // Sudoku is a special type of 9 x 9 latin square, with additional conditions.
//
//        Write a function that returns a latin square for any positive integer n.
//
//        If you are interested in verifying that any array is a latin square, see Latin Square Validator.

//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//class SolutionTest
//{
//    @Test
//    void sampleTests()
//    {
//        for (int i = 1; i <= 10; i++) {
//            int[][] latinSquare = LatinSquares.makeLatinSquare(i);
//            Object[] verification = Preloaded.verifyLatinSquare(latinSquare, i);
//            boolean result = (boolean) verification[0];
//            String message = (String) verification[1];
//            assertTrue(result, "n = " + i + " Verifier returned: " + message);
//        }
//    }
//}


import java.util.Arrays;

public class LatinSquares {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(makeLatinSquare(5)));
    }

    public static int[][] makeLatinSquare(int n) {
        final int[][] latinSquare = new int[n][n];

        for(int i = 0; i < n; i++){
            latinSquare[0][i] = i + 1;
        }

        for(int i = 1; i < n; i++){
            for (int j = 1; j < n; j++){
                latinSquare[i][j] = latinSquare[i - 1][(j + 1) % n];
            }
        }

        // Put your code here
        return latinSquare;
    }
}
