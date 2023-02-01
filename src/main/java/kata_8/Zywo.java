package kata_8;
//
//Create a function that accepts a list/array and a number n,
//        and returns a list/array of the first n elements from the list/array.
//
//        If you need help, here's a reference:
//
//        https://docs.oracle.com/javase/6/docs/api/java/util/Arrays.html#copyOfRange(int[],%20int,%20int


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//public class SolutionTest {
//    @Test
//    public void basicTests() {
//        assertArrayEquals("should return the first 3 items", new int[]{0, 1, 2}, ZywOo.take(new int[]{0, 1, 2, 3, 5, 8, 13}, 3));
//    }
//}

//STEPS
//loop through the array
// return the first 3 elements of the array
public class Zywo {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(take(new int[]{0, 1, 2, 3, 5, 8, 13}, 3)));
    }

    public static int[] take(int[] arr, int n) {

        if(arr.length == 0 || n > arr.length){
            return arr;
        }

        int [] newArr = new int[n];

        for(int i = 0; i < n; i++){
            newArr[i] = arr[i];
        }


        return newArr;

    }
}
