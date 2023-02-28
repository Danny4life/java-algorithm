package kata_7;

//In your class, you have started lessons about arithmetic progression. Since you are also a programmer,
//        you have decided to write a function that will return the first n elements of the sequence with
//        the given common difference d and first element a. Note that the difference may be zero!
//
//        The result should be a string of numbers, separated by comma and space.
//
//        Example
//        # first element: 1, difference: 2, how many: 5
//        arithmetic_sequence_elements(1, 2, 5) == "1, 3, 5, 7, 9"


//import org.junit.Test;
//import static org.junit.Assert.assertEquals;
//import org.junit.runners.JUnit4;

//public class SolutionTest {
//    @Test
//    public void shouldPassFixedTests() {
//        assertEquals("1, 2, 3, 4, 5, 6, 7, 8, 9, 10", Progression.arithmeticSequenceElements(1, 1, 10));
//        assertEquals("1, 3, 5, 7, 9", Progression.arithmeticSequenceElements(1, 2, 5));
//        assertEquals("1, 1, 1, 1, 1", Progression.arithmeticSequenceElements(1, 0, 5));
//        assertEquals("1, -2, -5, -8, -11, -14, -17, -20, -23, -26", Progression.arithmeticSequenceElements(1, -3, 10));
//        assertEquals("100, 90, 80, 70, 60, 50, 40, 30, 20, 10", Progression.arithmeticSequenceElements(100, -10, 10));
//    }
//}

//STEPS
// get the first element

public class Progression {

    public static void main(String[] args) {
        System.out.println(arithmeticSequenceElements(1,1,10));
    }

    public static String arithmeticSequenceElements(int a, int d, long n) {
        // Solution goes here

      return "";
    }

}
