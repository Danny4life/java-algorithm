package kata_7;
//
//Find the total sum of internal angles (in degrees)
//        in an n-sided simple polygon. N will be greater than 2.


//public class SolutionTest {
//    @Test
//    public void sampleTests() {
//        assertEquals(180, AngleSum.sumOfAngles(3));
//        assertEquals(360, AngleSum.sumOfAngles(4));
//    }
//}

///STEPS
// find how to solve the sum of polygon
public class AngleSums {

    public static void main(String[] args) {
        System.out.println(sumOfAngles(4));
    }

    public static int sumOfAngles(int n) {
        // Code here

        return (n -2) * 180;
    }
}
