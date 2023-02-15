package kata_7;



//A new task for you!
//
//        You have to create a method, that corrects a given time string.
//        There was a problem in addition, so many of the time strings are broken.
//        Time is formatted using the 24-hour clock, so from 00:00:00 to 23:59:59.
//        Examples
//        "09:10:01" -> "09:10:01"
//        "11:70:10" -> "12:10:10"
//        "19:99:99" -> "20:40:39"
//        "24:01:01" -> "00:01:01"
//        If the input-string is null or empty return exactly this value!
//        (empty string for C++) If the time-string-format is invalid, return null. (empty string for C++)
//
//        Have fun coding it and please don't forget to vote and rank this kata! :-)
//
//        I have created other katas. Have a look if you like coding and challenges.
//

//import java.util.Arrays;
//import java.util.Random;
//import java.util.concurrent.ThreadLocalRandom;
//
//import org.junit.Test;
//import static org.junit.Assert.assertEquals;
//import org.junit.runners.JUnit4;
//
//public class SolutionTest {
//
//    private void test(String expected, String input) {
//        assertEquals(null, Solution.timeCorrect(null));
//    }
//
//    @Test
//    public void testNull() {
//        test(null, null);
//    }
//
//    @Test
//    public void testEmpty() {
//        test("", "");
//    }
//
//    @Test
//    public void testCorrect() {
//        Arrays.asList("09:10:01", "00:00:00", "23:59:59", "12:34:56")
//                .forEach(s -> assertEquals(s, s));
//    }
//
//    @Test
//    public void testCorrection() {
//        assertEquals("12:10:10", Solution.timeCorrect("11:70:10"));
//        assertEquals("20:39:09", Solution.timeCorrect("19:99:09"));
//        assertEquals("20:40:39", Solution.timeCorrect("19:99:99"));
//        assertEquals("00:01:01", Solution.timeCorrect("24:01:01"));
//        assertEquals("04:01:01", Solution.timeCorrect("52:01:01"));
//    }
//
//    @Test
//    public void testInvalidFormat() {
//        assertEquals(null, Solution.timeCorrect("0:00:00"));
//        assertEquals(null, Solution.timeCorrect("00:0:00"));
//        assertEquals(null, Solution.timeCorrect("00:00:0"));
//        assertEquals(null, Solution.timeCorrect("-0:00:00"));
//        assertEquals(null, Solution.timeCorrect("00:00:000"));
//        assertEquals(null, Solution.timeCorrect("000000"));
//        assertEquals(null, Solution.timeCorrect("00;11;22"));
//        assertEquals(null, Solution.timeCorrect("00:00:0/"));
//        assertEquals(null, Solution.timeCorrect(":0:00:00"));
//    }
//
//    @Test
//    public void testEdgeCases() {
//        assertEquals("00:00:00", Solution.timeCorrect("24:00:00"));
//        assertEquals("00:00:00", Solution.timeCorrect("23:59:60"));
//        assertEquals("00:00:00", Solution.timeCorrect("47:59:60"));
//        assertEquals("00:00:59", Solution.timeCorrect("47:60:59"));
//        assertEquals("12:00:00", Solution.timeCorrect("12:00:00"));
//        assertEquals("04:40:39", Solution.timeCorrect("99:99:99"));
//        assertEquals("01:00:00", Solution.timeCorrect("24:60:00"));
//        assertEquals("01:00:00", Solution.timeCorrect("25:00:00"));
//    }
//
//}
public class Solution {

    public static void main(String[] args) {
        System.out.println(timeCorrect("12:10:10"));
    }

    public static String timeCorrect(String timestring) {
        // your code here


        if (timestring == null || !timestring.matches("^\\d{2}:\\d{2}:\\d{2}$")) {
            return null;
        }
        String[] split = timestring.split(":");
        int h = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);
        int s = Integer.parseInt(split[2]);
        m += s / 60;
        s = s % 60;
        h += m / 60;
        m = m % 60;
        h = h % 24;
        return String.format("%02d:%02d:%02d", h, m, s);
    }
}
