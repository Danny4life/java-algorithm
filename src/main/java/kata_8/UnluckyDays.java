package kata_8;

//        Friday 13th or Black Friday is considered as unlucky day.
//        Calculate how many unlucky days are in the given year.
//
//        Find the number of Friday 13th in the given year.
//
//        Input: Year in Gregorian calendar as integer.
//
//        Output: Number of Black Fridays in the year as an integer.
//
//        Examples:
//
//        unluckyDays(2015) == 3
//        unluckyDays(1986) == 1

//import org.junit.Test;
//import static org.junit.Assert.assertEquals;
//import org.junit.runners.JUnit4;
//
//
//public class SolutionTest {
//    @Test
//    public void testSomething() {
//        assertEquals(3, Kata.unluckyDays(2015));
//        assertEquals(1, Kata.unluckyDays(1986));
//    }
//}

import java.time.LocalDate;

public class UnluckyDays {

    public static void main(String[] args) {
        System.out.println(unluckyDays(1986));
    }

    public static int unluckyDays(int year) {
        // Implement me! :)

        int unluckyDateCount = 0;

        // count the number of fridays the 13ths
        for(int month = 1; month <= 12; month++ ){
            LocalDate fridayThe13th = LocalDate.of(year, month, 13);

            if(fridayThe13th.getDayOfWeek() == LocalDate.now().getDayOfWeek().FRIDAY){
                unluckyDateCount++;

            }
        }

        // count the number of black fridays
        LocalDate blackFridays = LocalDate.of(year, 11, 23);
        while (blackFridays.getDayOfWeek() != LocalDate.now().getDayOfWeek().FRIDAY){
            blackFridays = blackFridays.minusDays(1);
        }
        if(blackFridays.getDayOfMonth() == 13){
                unluckyDateCount++;
        }

        return unluckyDateCount;

    }
}
