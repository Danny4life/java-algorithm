package kata_7;

//Two red beads are placed between every two blue beads. There are N blue beads.
//        After looking at the arrangement below work out the number of red beads.
//
//@ @@ @ @@ @ @@ @ @@ @ @@ @
//
//        Implement count_red_beads(n) (in PHP count_red_beads($n);
//        in Java, Javascript, TypeScript, C, C++ countRedBeads(n))
//        so that it returns the number of red beads.
//        If there are less than 2 blue beads return 0.

//public class SolutionTest {
//    @Test
//    public void test0() {
//        assertEquals(0, BeadsCounter.countRedBeads(0));
//    }
//    @Test
//    public void test1() {
//        assertEquals(0, BeadsCounter.countRedBeads(1));
//    }
//    @Test
//    public void test3() {
//        assertEquals(4, BeadsCounter.countRedBeads(3));
//    }
//    @Test
//    public void test5() {
//        assertEquals(8, BeadsCounter.countRedBeads(5));
//    }
//}

//steps
// take care of blue beads less than 2

//We define a function countRedBeads that takes the number of blue beads n as an input.
//
//        We check if the number of blue beads is less than 2.
//        If it's less than 2, we return 0 as per the problem statement.
//
//        If there are at least 2 blue beads, we calculate the number of red beads as follows:
//
//        For N blue beads, there will be N - 1 gaps between them.
//        Each gap contains 2 red beads.
//        So, we multiply (n - 1) by 2 to get the total number of red beads.

public class BeadCount {

    public static void main(String[] args) {
        System.out.println(countRedBeads(3));
    }



    public static int countRedBeads(final int nBlue) {

        int countRedBeads;

        if(nBlue < 2){
            return 0;
        }

        countRedBeads = (nBlue - 1) * 2;

        return countRedBeads;
    }
}
