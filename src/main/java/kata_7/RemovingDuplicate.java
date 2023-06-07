package kata_7;
//
//Remove the duplicates from a list of integers, keeping the last ( rightmost ) occurrence of each element.
//
//        Example:
//        For input: [3, 4, 4, 3, 6, 3]
//
//        remove the 3 at index 0
//        remove the 4 at index 1
//        remove the 3 at index 3
//        Expected output: [4, 6, 3]
//
//        More examples can be found in the test cases.
//
//        Good luck!
//
//import org.junit.Test;
//import static org.junit.Assert.assertArrayEquals;
//import org.junit.runners.JUnit4;
//
//public class SolutionTest{
//    @Test
//    public void basicTests(){
//        assertArrayEquals(new int[]{4,6,3},Solution.solve(new int[]{3,4,4,3,6,3}));
//        assertArrayEquals(new int[]{1,2,3},Solution.solve(new int[]{1,2,1,2,1,2,3}));
//        assertArrayEquals(new int[]{1,2,3,4},Solution.solve(new int[]{1,2,3,4}));
//        assertArrayEquals(new int[]{4,5,2,1},Solution.solve(new int[]{1,1,4,5,1,2,1}));
//    }

import java.util.*;

public class RemovingDuplicate {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solve(new int[]{1,1,4,5,1,2,1})));
    }

    public static int [] solve(int [] arr){
        //...

        Set<Integer> set = new HashSet<>();

        for(int num : arr){
            set.add(num);
        }


        //convert the set back to an array
        int[] uniqueArray = new int[set.size()];
        int index = 0;

        for(int num : set){
            uniqueArray[index++] = num;
        }

        return uniqueArray;
    }
}
