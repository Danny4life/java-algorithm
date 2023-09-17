package kata_8;


//Philip's just turned four and he wants to know how old he will be in various years in
//        the future such as 2090 or 3044. His parents can't keep up calculating this so they've
//        begged you to help them out by writing a programme that can answer Philip's endless questions.
//
//        Your task is to write a function that takes two parameters: the year of birth and the year to
//        count years in relation to. As Philip is getting more curious every day he may soon want to
//        know how many years it was until he would be born, so your function needs to work with both dates
//        in the future and in the past.
//
//        Provide output in this format: For dates in the future: "You are ... year(s) old." For dates in the past:
//        "You will be born in ... year(s)." If the year of birth equals the year requested return:
//        "You were born this very year!"
//
//        "..." are to be replaced by the number, followed and proceeded by a single space.
//        Mind that you need to account for both "year" and "years", depending on the result.
//
//        Good Luck!


//import org.junit.Test;
//import static org.junit.Assert.assertEquals;
//import org.junit.runners.JUnit4;
//
//public class SolutionTest {
//    @Test
//    public void testAge() {
//
//        assertEquals("You are 4 years old.", AgeDiff.CalculateAge(2012, 2016));
//        assertEquals("You are 27 years old.", AgeDiff.CalculateAge(1989, 2016));
//        assertEquals("You are 90 years old.", AgeDiff.CalculateAge(2000, 2090));
//        assertEquals("You will be born in 10 years.", AgeDiff.CalculateAge(2000, 1990));
//        assertEquals("You were born this very year!", AgeDiff.CalculateAge(3400, 3400));
//        assertEquals("You are 2000 years old.", AgeDiff.CalculateAge(900, 2900));
//        assertEquals("You will be born in 110 years.", AgeDiff.CalculateAge(2010, 1900));
//        assertEquals("You will be born in 510 years.", AgeDiff.CalculateAge(2010, 1500));
//        assertEquals("You are 1 year old.", AgeDiff.CalculateAge(2011, 2012));
//        assertEquals("You will be born in 1 year.", AgeDiff.CalculateAge(2000, 1999));
//
//    }
//}

// steps
// 1. first get the current years
// a. minus the current year by the birth year
// 2. get the year in the future
// a. current year - year born
// 3. take care of edge case

// calculate age
// https://www.codewars.com/kata/5761a717780f8950ce001473/train/java

public class CalculateAges {
    public static void main(String[] args) {
        System.out.println(CalculateAge(2011, 2012));
    }

    public static String CalculateAge(int birth, int yearTo) {
        int currentYears = yearTo - birth;

        if(currentYears > 0){
            if(currentYears == 1){
                return "You are 1 year old.";
            }else {
                return "You are " + currentYears + " years old.";
            }
        } else if (currentYears < 0) {
            if(currentYears == -1){
                return "You will be born in 1 year.";
            }else {
                return "You will be born in " + (-currentYears) + " years.";
            }
        }else {
            return "You were born this very year!";
        }
    }

}
