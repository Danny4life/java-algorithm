package kata_7;

//You are given an odd-length array of integers, in which all of them are the same, except for one single number.
//
//        Complete the method which accepts such an array, and returns that single different number.
//
//        The input array will always be valid! (odd-length >= 3)
//
//        Examples
//        [1, 1, 2] ==> 2
//        [17, 17, 3, 17, 17, 17, 17] ==> 3


//import org.junit.Test;
//import static org.junit.Assert.assertEquals;
//
//public class SolutionTest {
//
//    @Test
//    public void simpleArray1() {
//        assertEquals(2, getActualFor(1, 1, 2));
//    }
//
//    private int getActualFor(int... numbers) {
//        return Solution.stray(numbers);
//    }
//}

//Pseudocode
//loop through the array
// check if each number in the array is equal to the given number
// if yes continue, if not, return that number

public class Stray {

    public static void main(String[] args) {
        System.out.println(stray(new int[]{1, 1, 2}));
    }

    static int stray(int[] numbers) {

        int sum=0;
        for(int c :numbers)
            sum^=c ;
        return sum;
    }
}
