package alogorithm_not_solved;

//Write two functions, one that converts standard time to decimal time and one
//        that converts decimal time to standard time.
//
//        One hour has 100 minutes (or 10,000 seconds) in decimal time,
//        yet its duration is the same as in standard time. Thus a decimal minute consists of 36 standard seconds,
//        which is 1/100 of an hour.
//        Working time is usually rounded to integer decimal minutes.
//        Thus one standard minute equals 0.02 decimal hours,
//        while two standard minutes equal 0.03 decimal hours and so on.
//        toIndustrial(time) should accept either the time in minutes as an integer or a
//        string of the format "h:mm".
//        Minutes will always consist of two digits in the tests (e.g., "0:05");
//        hours can have more. Return a double that represents decimal hours (e.g. 1.75 for 1h 45m).
//        Round to a precision of two decimal digits - do not simply truncate!
//        toNormal(time) should accept a double representing decimal time in hours.
//        Return a string that represents standard time in the format "h:mm".
//        There will be no seconds in the tests. We'll neglect them for the purpose of this kata.
//
//        Flavor text (click to expand)
//
//        Examples:
//        toIndustrial(1) => 0.02
//        toIndustrial("1:45") => 1.75
//        toNormal(0.33) => "0:20"


//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Nested;
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//@DisplayName("Basic tests")
//class SolutionTest {
//    @Test
//    @DisplayName("All methods tested")
//    void basicTests() {
//        assertEquals(0.02,DTC.toIndustrial(1));
//        assertEquals(0.03,DTC.toIndustrial(2));
//        assertEquals(1.75,DTC.toIndustrial(105));
//        assertEquals(0.05,DTC.toIndustrial("0:03"));
//        assertEquals(0.07,DTC.toIndustrial("0:04"));
//        assertEquals(1.75,DTC.toIndustrial("1:45"));
//        assertEquals("1:45",DTC.toNormal(1.75));
//        assertEquals("0:20",DTC.toNormal(0.33));
//    }
//}

//pseudocode
// 1. convert standard time to decimal time and vice versa

public class DTC {

    public static void main(String[] args) {
        System.out.println(toIndustrial(1));
        System.out.println(toIndustrial(2));
        System.out.println(toNormal(1.75));
    }

    public static double toIndustrial(String time){
        return 0.0;
    }

    public static double toIndustrial(int time){

        return 0.0;
    }

    public static String toNormal(double time){
        return "";
    }
}
