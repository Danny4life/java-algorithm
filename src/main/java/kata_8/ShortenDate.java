package kata_8;

//Task Description
//        You're re-designing a blog, and the blog's posts have the Weekday Month Day,
//        time format for showing the date and time when a post was made, e.g., Friday May 2, 7pm.
//
//        You're running out of screen real estate, and on some pages you want to display a shorter format,
//        Weekday Month Day that omits the time.
//
//        Write a function that takes the website date/time in its original string format and returns the shortened format.
//
//        Input
//        Input will always be a string, e.g., "Friday May 2, 7pm".
//
//        Output
//        Output will be the shortened string, e.g., "Friday May 2".


//
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//class SolutionTest {
//    @Test
//    void sampleTests() {
//        assertEquals("Friday May 2",Solution.shortenToDate("Friday May 2, 9am"),"Failed for input: \"Friday May 2, 9am\"");
//        assertEquals("Tuesday January 29",Solution.shortenToDate("Tuesday January 29, 10pm"),"Failed for input: \"Tuesday January 29, 10pm\"");
//        assertEquals("Monday December 25",Solution.shortenToDate("Monday December 25, 10pm"),"Failed for input: \"Monday December 25, 10pm\"");
//    }
//}

//STEPS
//1. Define a regular expression pattern to match the time (e.g., 9am)
//2. Use a Matcher to find the time in the input string
//3. Replace any matching time with an empty string


// https://www.codewars.com/kata/56b0ff16d4aa33e5bb00008e/train/java

//import kata_7.Pattern;
import java.util.regex.*;

public class ShortenDate {

    public static void main(String[] args) {
        System.out.println(shortenToDate("Friday May 2, 9am"));
    }

    public static String shortenToDate(String longDate) {
        //Put your code here ^_^

        Pattern pattern = Pattern.compile("\\d{1,2}(am|pm)");

        Matcher matcher = pattern.matcher(longDate);

        String result = matcher.replaceAll("").trim();

        return result.replace(",", "");
    }
}
