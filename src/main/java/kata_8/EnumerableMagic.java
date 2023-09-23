package kata_8;

//Task
//        Create a method all which takes two params:
//
//        a sequence
//        a function (function pointer in C)
//        and returns true if the function in the params returns
//        true for every element in the sequence. Otherwise, it should return false.
//        If the sequence is empty, it should return true, since technically nothing failed the test.
//
//        Example
//        all((1, 2, 3, 4, 5), greater_than_9) -> false
//        all((1, 2, 3, 4, 5), less_than_9)    -> True


import java.util.function.IntPredicate;

//import org.junit.Test;
//import static org.junit.Assert.assertFalse;
//import static org.junit.Assert.assertTrue;
//import org.junit.runners.JUnit4;
//
//import java.util.function.IntPredicate;
//
//public class SolutionTest{
//    private static final IntPredicate evenNumber = n -> n % 2 == 0;
//    private static final IntPredicate oddNumber = n -> n % 2 != 0;
//    private static final IntPredicate lessThan10 = n -> n < 10;
//    private static final IntPredicate lessThan5 = n -> n < 5;
//    private static final IntPredicate greaterThan1 = n -> n > 1;
//    private static final IntPredicate greaterThan5 = n -> n > 5;
//    private static final IntPredicate greaterThan10 = n -> n > 10;
//
//    @Test
//    public void fixedTests(){
//        assertTrue(Solution.all(new int[]{2, 4, 6, 10}, evenNumber));
//        assertFalse(Solution.all(new int[]{1, 3, 5, 10}, oddNumber));
//        assertFalse(Solution.all(new int[]{2, 4, 6, 19}, lessThan10));
//        assertTrue(Solution.all(new int[]{1, 1, 2}, lessThan5));
//        assertTrue(Solution.all(new int[]{2, 9, 4, 3}, greaterThan1));
//        assertFalse(Solution.all(new int[]{2, 9, 4, 0}, greaterThan1));
//        assertFalse(Solution.all(new int[]{5, 6, 7, 8}, greaterThan5));
//        assertTrue(Solution.all(new int[]{13, 42}, greaterThan10));
//
//        assertFalse(Solution.all(new int[]{5}, evenNumber));
//        assertTrue(Solution.all(new int[]{5}, oddNumber));
//        assertFalse(Solution.all(new int[]{5}, lessThan5));
//
//        assertTrue(Solution.all(new int[]{}, evenNumber));
//        assertTrue(Solution.all(new int[]{}, lessThan5));
//        assertTrue(Solution.all(new int[]{}, greaterThan10));
//    }
//}
public class EnumerableMagic {

    public static void main(String[] args) {
        System.out.println(all(new int[]{1, 2, 3, 4,5},  p -> p > 9));
    }

    public static boolean all(int[] list, IntPredicate predicate){
        // REMINDER: a Predicate "p" is tested for argument "arg" using p.test(arg)
        for(int num : list){
            if(!predicate.test(num)){
                return false;
            }
        }
        return true;
    }
}
