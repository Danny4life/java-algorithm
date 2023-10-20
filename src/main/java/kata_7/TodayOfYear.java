package kata_7;

//Work out what number day of the year it is.
//
//        toDayOfYear([1, 1, 2000]) => 1
//        The argument passed into the function is an array with the format [D, M, YYYY],
//        e.g. [1, 2, 2000] for February 1st, 2000 or [22, 12, 1999] for December 22nd, 1999.
//
//        Don't forget to check for whether it's a leap year! Three criteria must be taken into
//        account to identify leap years:
//
//        The year can be evenly divided by 4;
//        If the year can be evenly divided by 100, it is NOT a leap year, unless;
//        The year is also evenly divisible by 400. Then it is a leap year.


//class SolutionTest {
//    @Test
//    void ExampleTests() {
//        assertEquals(145, DateToInt.toDayOfYear(new int[]{25,  5, 2022}), "Normal Day");
//        assertEquals(137, DateToInt.toDayOfYear(new int[]{17,  5, 1991}), "Normal day");
//        assertEquals(295, DateToInt.toDayOfYear(new int[]{22, 10, 1990}), "Normal day");
//        assertEquals(  1, DateToInt.toDayOfYear(new int[]{ 1,  1, 2001}), "First day, normal year");
//        assertEquals(  1, DateToInt.toDayOfYear(new int[]{ 1,  1, 2000}), "First day, leap year");
//        assertEquals(365, DateToInt.toDayOfYear(new int[]{31, 12, 2003}), "Last day, normal year");
//        assertEquals(366, DateToInt.toDayOfYear(new int[]{31, 12, 2004}), "Last day, leap year");
//        assertEquals (60, DateToInt.toDayOfYear(new int[]{29,  2, 2008}), "Leap day");
//    }
//}


public class TodayOfYear {

    public static void main(String[] args) {
        System.out.println(toDayOfYear(new int[]{25, 5}));
    }

    public static int toDayOfYear(int[] date){
        //Happy Coding!
        return 1;
    }
}
