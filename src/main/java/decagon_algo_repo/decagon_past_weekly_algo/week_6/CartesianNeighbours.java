package decagon_algo_repo.decagon_past_weekly_algo.week_6;

// given already


//A Cartesian coordinate system is a coordinate system that specifies each point uniquely
//        in a plane by a pair of numerical coordinates, which are the signed distances
//        to the point from two fixed perpendicular directed lines, measured in the same unit of length.
//
//        The сoordinates of a point in the grid are written as (x,y). Each point in a coordinate system
//        has eight neighboring points. Provided that the grid step = 1.
//
//        It is necessary to write a function that takes a coordinate on the x-axis and y-axis and returns
//        a list of all the neighboring points. Points inside your returned list need not be sorted (any order is valid).
//
//        For Example:
//
//        * Given x = 2 and y = 2, the function should return [(1,1),(1,2),(1,3),(2,1),(2,3),(3,1),(3,2),(3,3)];
//        * Given x = 5 and y = 7, the function should return [(6,7),(6,6),(6,8),(4,7),(4,6),(4,8),(5,6),(5,8)].
//        Note that the required data structure to contain the coordinates might not be the same between translations,
//        so check the sample test cases provided.
//
//
//import org.junit.Test;
//import static org.junit.Assert.assertArrayEquals;
//
//public class MixedTest {
//    @Test
//    public void ExampleTest() {
//        assertArrayEquals("", Inspection.sortedList(Kata.cartesianNeighbor(2, 2)),
//                new int[][]{{1,1},{1,2},{1,3},{2,1},{2,3},{3,1},{3,2},{3,3}} );
//    }
//}


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CartesianNeighbours {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(cartesianNeighbor(2, 2)));

    }

    public static int[][] cartesianNeighbor(int x, int y){

        // step 1 initializes a list to store the neighbouring points. NOTE: a neighbouring point is any point that
        // surrounds the given point(x,y)
       List<int[]> neighbours = new ArrayList<>();

       // step 2 create a nested loop to iterate through potential neighbouring points around the given coordinate
        for(int i = -1; i <= 1; i++){
            for(int j = -1; j <= 1; j++){
                // step 3 use an if statement to check if the current point is not the center point i.e i and j are not both zero
                if(i != 0 || j != 0){
                    int nX = x + i;
                    int nY = y + j;

                    // step 4 if the neighbouring point is within the cordinate add it to the list
                   neighbours.add(new int[]{nX, nY});

                }
            }

        }

        // convert the list into a 2D array;
        int[][] res = new int[neighbours.size()][2];

        for(int k = 0; k < neighbours.size(); k++){
            res[k] = neighbours.get(k);
        }

        return res;

    }
}


// Link : https://www.codewars.com/kata/58989a079c70093f3e00008d/train/java
