package kata_8;
//You will be given an array a and a value x. All you need to do is check whether the provided array contains the value.
//
//        Array can contain numbers or strings. X can be either.
//
//        Return true if the array contains the value, false if not.


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;

public class YouOnlyNeedOne {

    public static void main(String[] args) {
        int[] arr = {66, 101};
        //System.out.println(check({66, 101}, 66));
    }


    public static boolean check(int[] a, Object x) {
        // Your code here

       return Arrays.asList(a).contains(x);
    }

}
