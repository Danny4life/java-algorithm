package kata_7;

//Write a function that takes a positive integer n,
//        sums all the cubed values from 1 to n (inclusive), and returns that sum.
//
//        Assume that the input n will always be a positive integer.
//
//        Examples: (Input --> output)
//
//        2 --> 9 (sum of the cubes of 1 and 2 is 1 + 8)
//        3 --> 36 (sum of the cubes of 1, 2, and 3 is 1 + 8 + 27)

//import org.junit.Test;
//import static org.junit.Assert.assertEquals;
//import org.junit.runners.JUnit4;

// TODO: Replace examples and use TDD by writing your own tests

//public class SolutionTest {
//    @Test
//    public void exampleTests() {
//        assertEquals(1,Solution.sumCubes(1));
//        assertEquals(9,Solution.sumCubes(2));
//        assertEquals(36,Solution.sumCubes(3));
//        assertEquals(100,Solution.sumCubes(4));
//        assertEquals(3025, Solution.sumCubes(10));
//        assertEquals(58155876,Solution.sumCubes(123));
//    }
//}

//STEPS
// loop to first get all the numbers in n
// get all the cube root of the numbers
// sum all the numbers and return it

public class SumOfCubes {

    public static void main(String[] args) {
        System.out.println(sumCubes(3));


//        System.out.println(Math.pow(4, 3));
//        System.out.println(64+27+8+1);
    }

    public static long sumCubes(long n)
    {
        //put your code here :D

        long sum = 0;


        for(long i = 1; i <= n; i++){
           sum += (long) Math.pow(i, 3);
        }

        return sum;
    }
}
