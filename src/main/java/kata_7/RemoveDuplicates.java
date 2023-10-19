package kata_7;

//Remove the duplicates from a list of integers, keeping the last ( rightmost )
//        occurrence of each element.
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


//public class SolutionTest{
//    @Test
//    public void basicTests(){
//        assertArrayEquals(new int[]{4,6,3},Solution.solve(new int[]{3,4,4,3,6,3}));
//        assertArrayEquals(new int[]{1,2,3},Solution.solve(new int[]{1,2,1,2,1,2,3}));
//        assertArrayEquals(new int[]{1,2,3,4},Solution.solve(new int[]{1,2,3,4}));
//        assertArrayEquals(new int[]{4,5,2,1},Solution.solve(new int[]{1,1,4,5,1,2,1}));
//    }

import java.util.*;

public class RemoveDuplicates {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solve(new int[]{3, 4, 4, 3, 6, 3})));
    }

    public static int [] solve(int [] arr){
        //...

        Set<Integer> uniqueNumbers = new LinkedHashSet<>();
        List<Integer> result = new ArrayList<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            int num = arr[i];
            if (!uniqueNumbers.contains(num)) {
                uniqueNumbers.add(num);
                result.add(0, num);
            }
        }

        // convert the Arraylist back to an int[] array
        int[] resArray = new int[result.size()];
        for(int i = 0; i < result.size(); i++){
            resArray[i] = result.get(i);
        }

        return resArray;
    }
}

