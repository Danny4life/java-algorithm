package kata_7;

//Write a function which reduces fractions to their simplest form!
//        Fractions will be presented as an array/tuple (depending on the language)
//        of strictly positive integers, and the reduced fraction must be returned as an array/tuple:
//
//        input:   [numerator, denominator]
//        output:  [reduced numerator, reduced denominator]
//        example: [45, 120] --> [3, 8]
//        All numerators and denominators will be positive integers.
//



//class SampleTest {
//    @ParameterizedTest(name = "Fraction = '{'{2}, {3}'}'")
//    @DisplayName("Sample test cases")
//    @CsvSource({
//            "   3, 1,     60,  20",
//            "   2, 3,     80, 120",
//            "   2, 1,      4,   2",
//            "   3, 8,     45, 120",
//            "1000, 1,   1000,   1",
//            "   1, 1,      1,   1"
//    })
//    void exampleTests(int expectedNumerator, int expectedDenominator, int nominator, int denominator){
//        assertArrayEquals(new int[]{expectedNumerator, expectedDenominator}, Reduce.myFraction(new int[]{nominator, denominator}));
//    }
//}

import java.util.Arrays;

public class MyFraction {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(myFraction(new int[]{45, 120})));
    }

    public static int[] myFraction(int[] fractions){
        //your code here

        int n = fractions[0];
        int d = fractions[1];

        int commonDivisor = calculateCommonDivisor(n, d);
        int reduceNumerator = n/commonDivisor;
        int reduceDenomenator = d/commonDivisor;

        return new int[]{reduceNumerator, reduceDenomenator};
    }

    private static int calculateCommonDivisor(int numerator, int denomenator) {

        if(denomenator == 0){
            return numerator;
        }else {
            return calculateCommonDivisor(denomenator, numerator % denomenator);
        }
    }
}
