package kata_8;

//Given a set of numbers, return the additive inverse of each.
//        Each positive becomes negatives, and the negatives become positives.
//
//        invert([1,2,3,4,5]) == [-1,-2,-3,-4,-5]
//        invert([1,-2,3,-4,5]) == [-1,2,-3,4,-5]
//        invert([]) == []

import java.sql.Array;
import java.util.Arrays;

public class InvertValues {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(invert(new int[] {-1,2,-3,4,5})));
    }

    public static int[] invert(int[] array) {

       for(int i = 0; i < array.length; i++){
           array[i] *=  -1;
       }

       return array;
    }
}
