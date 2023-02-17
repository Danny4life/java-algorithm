package kata_7;

//Task
//        Given two positive integers m (width) and n (height), fill a two-dimensional list (or array)
//        of size m-by-n in the following way:
//
//        (1) All the elements in the first and last row and column are 1.
//
//        (2) All the elements in the second and second-last row and column are 2,
//        excluding the elements from step 1.
//
//        (3) All the elements in the third and third-last row and column are 3,
//        excluding the elements from the previous steps.
//
//        And so on ...
//
//        Examples
//        create_box(5, 8) should return
//
//        [[1, 1, 1, 1, 1],
//        [1, 2, 2, 2, 1],
//        [1, 2, 3, 2, 1],
//        [1, 2, 3, 2, 1],
//        [1, 2, 3, 2, 1],
//        [1, 2, 3, 2, 1],
//        [1, 2, 2, 2, 1],
//        [1, 1, 1, 1, 1]]
//        create_box(10, 9) should return
//
//        [[1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
//        [1, 2, 2, 2, 2, 2, 2, 2, 2, 1],
//        [1, 2, 3, 3, 3, 3, 3, 3, 2, 1],
//        [1, 2, 3, 4, 4, 4, 4, 3, 2, 1],
//        [1, 2, 3, 4, 5, 5, 4, 3, 2, 1],
//        [1, 2, 3, 4, 4, 4, 4, 3, 2, 1],
//        [1, 2, 3, 3, 3, 3, 3, 3, 2, 1],
//        [1, 2, 2, 2, 2, 2, 2, 2, 2, 1],
//        [1, 1, 1, 1, 1, 1, 1, 1, 1, 1]]

//
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.assertArrayEquals;
//
//class SolutionTest
//{
//    @Test
//    void sampleTests()
//    {
//        final int[][] box_7_8 = {{1, 1, 1, 1, 1, 1, 1},
//                {1, 2, 2, 2, 2, 2, 1},
//                {1, 2, 3, 3, 3, 2, 1},
//                {1, 2, 3, 4, 3, 2, 1},
//                {1, 2, 3, 4, 3, 2, 1},
//                {1, 2, 3, 3, 3, 2, 1},
//                {1, 2, 2, 2, 2, 2, 1},
//                {1, 1, 1, 1, 1, 1, 1}};
//
//        final int[][] box_8_7 = {{1, 1, 1, 1, 1, 1, 1, 1},
//                {1, 2, 2, 2, 2, 2, 2, 1},
//                {1, 2, 3, 3, 3, 3, 2, 1},
//                {1, 2, 3, 4, 4, 3, 2, 1},
//                {1, 2, 3, 3, 3, 3, 2, 1},
//                {1, 2, 2, 2, 2, 2, 2, 1},
//                {1, 1, 1, 1, 1, 1, 1, 1}};
//
//        final int[][] box_4_2 = {{1, 1, 1, 1}, {1, 1, 1, 1}};
//
//        final int[][] box_2_4 = {{1, 1}, {1, 1}, {1, 1}, {1, 1}};
//
//        assertArrayEquals(box_7_8, SpiralingBox.createBox(7,8));
//
//        assertArrayEquals(box_8_7, SpiralingBox.createBox(8,7));
//
//        assertArrayEquals(box_4_2, SpiralingBox.createBox(4,2));
//
//        assertArrayEquals(box_2_4, SpiralingBox.createBox(2,4));
//    }
//}

//STEPS
//LOOP through both m and n as row and column


import java.util.Arrays;

public class SpiralingBox {

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(createBox(7, 8)));
    }

    public static int[][] createBox(int width, int length)
    {
        // Put your code here.

        int[][] box =  new int[length][width];

        for(int i = 0; i < length; i++){
            for(int j = 0; j  < width; j++){
               box[i][j] = 1+Math.min(Math.min(i, length - i -1), Math.min(j, width - j - 1));

            }
        }
        return box;
    }
}
