package kata_8;

//Given a non-empty array of integers, return the result of multiplying the values together in order. Example:
//
//        [1, 2, 3, 4] => 1 * 2 * 3 * 4 = 24

import java.util.Arrays;

public class ReduceButGrow {

    public static void main(String[] args) {
        System.out.println(grow(new int[]{1,2,3}));
    }

    public static int grow(int[] x){

        int res = 1;


        for(int r : x){
            res *= r;
        }

        return res;

    }
}
