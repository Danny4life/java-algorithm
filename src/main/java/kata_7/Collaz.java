package kata_7;

//The Collatz Conjecture states that for any positive natural number n, this process:
//
//        if n is even, divide it by 2
//        if n is odd, multiply it by 3 and add 1
//        repeat
//        will eventually reach n = 1.
//
//        For example, if n = 20, the resulting sequence will be:
//
//        [ 20, 10, 5, 16, 8, 4, 2, 1 ]
//        Write a program that will output the length of the Collatz Conjecture for any given n.
//        In the example above, the output would be 8.


//public class SolutionTest {
//    @Test
//    public void testSomething() {
//        assertEquals("Test failed for: " + 100L, 26L, Collatz.conjecture(100L));
//        assertEquals("Test failed for: " + 10L, 7L, Collatz.conjecture(10L));
//        assertEquals("Test failed for: " + 500L, 111L, Collatz.conjecture(500L));
//        assertEquals("Test failed for: " + 1000000000L, 101L, Collatz.conjecture(1000000000L));
//        assertEquals("Test failed for: " + 1000000000000000L, 276L, Collatz.conjecture(1000000000000000L));
//    }
//}


//STEPS
//- check if n is even, if yes keep dividing it by 2
//-- but if n is odd, multiply it by 3 and add 1
//--until n get to 1 and return the length of n


public class Collaz {

    public static void main(String[] args) {
        System.out.println(conjecture(20L));
        System.out.println(1 % 2);
    }

    public static long conjecture(long x) {
        long counter = 1;

        while(x != 1){
            x = (x % 2 == 0) ? x / 2 : x * 3 + 1;
            counter++;
        }
        return counter;


    }
}
