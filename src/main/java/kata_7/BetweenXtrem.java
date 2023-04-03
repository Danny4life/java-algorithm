package kata_7;

//Given an array of numbers, return the difference between the largest and smallest values.
//
//        For example:
//
//        [23, 3, 19, 21, 16] should return 20 (i.e., 23 - 3).
//
//        [1, 434, 555, 34, 112] should return 554 (i.e., 555 - 1).
//
//        The array will contain a minimum of two elements.
//        Input data range guarantees that max-min will cause no integer overflow.


//import org.junit.Test;
//import static org.junit.Assert.assertEquals;
//import org.junit.runners.JUnit4;
//
//public class SolutionTest {
//    @Test
//    public void fixedTest() {
//        assertEquals(42, Kata.betweenExtremes(new int[]{21, 34, 54, 43, 26, 12}));
//        assertEquals(99, Kata.betweenExtremes(new int[]{-1, -41, -77, -100}));
//    }
//}

//pseudocode
//1. get the largest number
//2. get the smallest number
//3. get the difference between the largest and smallest number and return it

import java.util.Arrays;

public class BetweenXtrem {

    public static void main(String[] args) {
        System.out.println(betweenExtremes(new int[]{-1, -41, -77, -100 }));
    }

    public static int betweenExtremes(int[] numbers)
    {
        // your code goes here


        int max = numbers[0];
        int min = numbers[0];

        for(int i = 1; i < numbers.length; i++){
            if(max < numbers[i]){
                max = numbers[i];
            }
            if(min > numbers[i]){
                min = numbers[i];
            }
        }


        return max - min;
    }
}
