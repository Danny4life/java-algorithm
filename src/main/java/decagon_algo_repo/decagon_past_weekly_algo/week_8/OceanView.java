package decagon_algo_repo.decagon_past_weekly_algo.week_8;


//Description
//        Given an array of integers heights of length n, indicating that there are n buildings,
//        heights[i] represents the height of the building at the corresponding position.
//
//        To the right of a building is the ocean, and for each building,
//        if all buildings to the right of that building are strictly lower than it,
//        then that building has a view of the ocean.
//
//        Returns a list of indexed subscripts of all buildings with an ocean view,
//        in ascending order, with index subscripts starting at 0.
//
//        Example
//        Example 1:
//
//        Input:
//        heights = [5, 2, 3, 4]
//        Output:
//        [0, 3]
//        Explanation:
//        Building No.1 is 2 in height and Building No.2 is 3 in height and is not
//        strictly higher than the building to its right
//        Example 2:
//
//        Input:
//        heights = [2, 2, 2, 2, 2]
//        Output:
//        [4]
//        Explanation:
//        There are no buildings strictly higher than the right side, so only the
//        rightmost building, No. 4, has a view of the sea

import java.util.ArrayList;
import java.util.Arrays;

public class OceanView {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findBuildings(new int[]{2,2,2,2,2})));

    }

    public static int[] findBuildings(int[] heights) {
        // write your code here
        // Initialize an ArrayList to store indexes of buildings with ocean view
        ArrayList<Integer> result = new ArrayList<>();

        // Initialize a variable to keep track of the maximum height encountered from right
        int maxHeight = 0;

        // Iterate over the buildings from right to left
        for (int i = heights.length - 1; i >= 0; i--) {
            // Check if the current building's height is greater than the maximum height encountered so far
            if (heights[i] > maxHeight) {
                // If yes, add its index to the result list
                result.add(i);
                // Update the maximum height encountered
                maxHeight = heights[i];
            }
        }

        // Convert the ArrayList to an array and return
        int[] output = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            output[i] = result.get(result.size() - 1 - i); // Reversing the order as we iterated from right to left
        }
        return output;
    }
    }

