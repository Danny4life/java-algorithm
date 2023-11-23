package leetcode_75;

//238. Product of Array Except Self
//        Medium
//        20.6K
//        1.2K
//        Companies
//        Given an integer array nums, return an array answer such that answer[i]
//        is equal to the product of all the elements of nums except nums[i].
//
//        The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
//
//        You must write an algorithm that runs in O(n) time and without using the division operation.
//
//
//
//        Example 1:
//
//        Input: nums = [1,2,3,4]
//        Output: [24,12,8,6]
//        Example 2:
//
//        Input: nums = [-1,1,0,-3,3]
//        Output: [0,0,9,0,0]
//
//
//        Constraints:
//
//        2 <= nums.length <= 105
//        -30 <= nums[i] <= 30
//        The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

/**
 * 1. first get products of all arrays
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductExceptSelf {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{1, 2, 3, 4})));
    }

    public static int[] productExceptSelf(int[] nums) {

        int len = nums.length;

        int[] productArray = new int[len];

        // Calculate the product of all elements to the left of each index
       int leftPro = 1;
       for(int i = 0; i < len; i++){
           productArray[i] = leftPro;
           leftPro *= nums[i];

       }

        // Calculate the product of all elements to the right of each index
       int rightPro = 1;
       for(int i = len - 1; i >= 0; i--){
            productArray[i] *= rightPro;
            rightPro *= nums[i];
       }

        return productArray;

    }
}
