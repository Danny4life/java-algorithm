package kata_8;

//Your Job
//        Find the sum of all multiples of n below m
//
//        Keep in Mind
//        n and m are natural numbers (positive integers)
//        m is excluded from the multiples
//        Examples
//        Kata.sumMul(2, 9)   ==> 2 + 4 + 6 + 8 = 20
//        Kata.sumMul(3, 13)  ==> 3 + 6 + 9 + 12 = 30
//        Kata.sumMul(4, 123) ==> 4 + 8 + 12 + ... = 1860  5 + 10 + 15 = 30
//        Kata.sumMul(4, -7)  // throws IllegalArgumentException

//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertThrows;

//class SampleTests {
//
//    @Test
//    void basicTests() {
//        assertEquals(20, Kata.sumMul(2, 9), "n = 2, m = 9");
//        assertEquals(30, Kata.sumMul(5, 20), "n = 5, m = 20");
//        assertEquals(1860, Kata.sumMul(4,123),"n = 4, m = 123");
//        assertEquals(86469, Kata.sumMul(123,4567),"n = 123, m = 4567");
//    }
//
//    @Test
//    void invalidTests() {
//        assertThrows(IllegalArgumentException.class, () -> Kata.sumMul(0, 0), "n = 0, m = 0");
//        assertThrows(IllegalArgumentException.class, () -> Kata.sumMul(4, -7), "n = 4, m = -7");
//        assertThrows(IllegalArgumentException.class, () -> Kata.sumMul(-3, 10), "n = -3, m = 10");
//    }

//STEPS
//loop through m, but start from m
// find the multiples of n

public class Kata3 {

    public static void main(String[] args) {

        System.out.println(sumMul(2,9));

    }

    public static long sumMul(int n, int m) {
        // TODO implement

        int sum = 0;

       for(int i = n; i < m; i++){
           if( i % n == 0){
               sum += i;
           }
        }
        return sum;
    }
}
