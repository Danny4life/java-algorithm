package leetcode_75;

//283. Move Zeroes
//        Easy
//        15.7K
//        403
//        Companies
//        Given an integer array nums, move all 0's to the end of it while maintaining
//        the relative order of the non-zero elements.
//
//        Note that you must do this in-place without making a copy of the array.
//
//
//
//        Example 1:
//
//        Input: nums = [0,1,0,3,12]
//        Output: [1,3,12,0,0]
//        Example 2:
//
//        Input: nums = [0]
//        Output: [0]
//
//
//        Constraints:
//
//        1 <= nums.length <= 104
//        -231 <= nums[i] <= 231 - 1
//
//
//        Follow up: Could you minimize the total number of operations done?

import java.util.Arrays;

/**
 * 1. loop through the array
 * 2. if the element at a particular index is zero, move it to the right
 * 3. else move the element to the left
 */

public class MoveZeros {


    public static void main(String[] args) {
        int [] array = {0, 1, 0, 3, 12};
        System.out.println("Original array: " + Arrays.toString(array));

        moveZeroes(array);

        System.out.println("Modified array : " + Arrays.toString(array));
    }

    public static void moveZeroes(int[] nums) {

        int n = nums.length;
        int nonZeroIndex = 0;

        for(int i = 0; i < n; i++){

            if(nums[i] != 0){
                nums[nonZeroIndex++] = nums[i];
            }
            
        }

        while (nonZeroIndex < n){
            nums[nonZeroIndex++] = 0;
        }
    }
}

