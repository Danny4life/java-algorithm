package kata_7;

//import org.junit.Test;
//import static org.junit.Assert.assertEquals;
//import org.junit.runners.JUnit4;
//
//public class SolutionTest {
//    @Test
//    public void sampleTests() {
//        assertion(6,   3, 4, 5);
//        assertion(24,  6, 8, 10);
//    }
//
//    private void assertion(double expected, double a, double b, double c) {
//        assertEquals(
//                String.format("Inputs: (%f, %f, %f)\n", a, b, c),
//                expected,
//                Kata.heron(a, b, c),
//                0.01
//        );
//    }
//}

//pseudocode
// 1. look for s
// 2. use the formula to solve for the area
// S = a+b+c/2
public class HeronFormula {

    public static void main(String[] args) {
        System.out.println(heron( 6, 8, 10));
    }

    public static double heron(double a, double b, double c)
    {
        //code here

        double S = (a+b+c) / 2;

        double area = S *(S - a) * (S - b) * (S - c);
        double res = Math.sqrt(area);

        return res;
    }
}
