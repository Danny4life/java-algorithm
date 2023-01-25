package kata_7;

//The snail crawls up the column. During the day it crawls up some distance.
//        During the night she sleeps, so she slides down for some distance
//        (less than crawls up during the day).
//
//        Your function takes three arguments:
//
//        The height of the column (meters)
//        The distance that the snail crawls during the day (meters)
//        The distance that the snail slides down during the night (meters)
//        Calculate number of day when the snail will reach the top of the column.


//ublic class SampleTest {
//    @Test
//    public void basicTests() {
//        assertEquals(2, Kata.snail(3,2,1));
//        assertEquals(5, Kata.snail(10,3,1));
//        assertEquals(8, Kata.snail(10,3,2));
//        assertEquals(7, Kata.snail(100,20,5));
//        assertEquals(1, Kata.snail(5,10,3));
//    }
//}





public class Snail {

    public static void main(String[] args) {
        System.out.println(snail(10,3,1));

    }

    public static int snail(int column, int day, int night) {

        int days = 1;

        while(day < column){
            column -= (day - night);
            days++;
        }

        return days; // your code here

    }
}
