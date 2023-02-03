package kata_7;

//Your are given a string. You must replace any occurence of the sequence
//        coverage by covfefe, however, if you don't find the word coverage
//        in the string, you must add covfefe at the end of the string with a leading space.
//
//        For the languages where the string is not immutable (such as ruby),
//        don't modify the given string, otherwise this will break the test cases.


//import org.junit.Test;
//import static org.junit.Assert.assertEquals;
//import org.junit.runners.JUnit4;
//
//
//public class CovfefeTest {
//    @Test
//    public void basicTest() {
//        assertEquals("covfefe", Covfefe.covfefe("coverage"));
//        assertEquals("covfefe covfefe", Covfefe.covfefe("coverage coverage"));
//        assertEquals("nothing covfefe", Covfefe.covfefe("nothing"));
//        assertEquals( "double space  covfefe" ,Covfefe.covfefe("double space "));
//        assertEquals("covfefe covfefe", Covfefe.covfefe("covfefe"));
//    }
//
//}

//STEPS
//replace coverage with covfefe
// in the absence of the word coverage, add covefefe to the current word with space



public class Covfvee {

    public static void main(String[] args) {
        System.out.println(covfefe("coverage coverage"));
    }

    public static String covfefe(String tweet) {

        if(tweet.contains("coverage")){
            return tweet.replaceAll("coverage", "covfefe");
        }

        return tweet + " " + "covfefe";

    }
}
