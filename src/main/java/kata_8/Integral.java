package kata_8;

//Create a function that finds the integral of the expression passed.
//
//        In order to find the integral all you need to do is add one to the exponent (the second argument),
//        and divide the coefficient (the first argument) by that new number.
//
//        For example for 3x^2, the integral would be 1x^3: we added 1 to the exponent,
//        and divided the coefficient by that new number).
//
//        Notes:
//
//        The output should be a string.
//        The coefficient and exponent is always a positive integer.
//        Examples
//        3, 2  -->  "1x^3"
//        12, 5  -->  "2x^6"
//        20, 1  -->  "10x^2"
//        40, 3  -->  "10x^4"
//        90, 2  -->  "30x^3"


//mport org.junit.Test;
//import static org.junit.Assert.assertEquals;
//import org.junit.runners.JUnit4;
//
//// TODO: Replace examples and use TDD development by writing your own tests
//
//public class SolutionTest {
//    @Test
//    public void exampleTests() {
//        assertEquals("1x^3", Kata.integrate(3,2));
//        assertEquals("2x^6", Kata.integrate(12,5));
//        assertEquals("10x^2", Kata.integrate(20,1));
//        assertEquals("10x^4", Kata.integrate(40,3));
//        assertEquals("30x^3", Kata.integrate(90,2));
//    }
//}


// STEPS
// 1. add one to the exponent to get a new number and convert to a string
// 2. then divide the coefficient by the new number and convert to a string
// 3. join 1 + "x^" + 2 and return the output as a string

// https://www.codewars.com/kata/59811fd8a070625d4c000013/train/java

public class Integral {

    public static void main(String[] args) {
        System.out.println(integrate(3,2));
    }

    public static String integrate(int coefficient, int exponent) {
        // TODO implement the integration

        int newExp = exponent + 1;
        int newCoeff = coefficient / newExp;

        String r1 = Integer.toString(newExp);

        String r2 = Integer.toString(newCoeff);

        String res = r2 + "x^" + r1;

        return res;
    }
}
