package decagon_algo_repo.decagon_past_weekly_algo.week_4;

// given already

//Check to see if a string has the same amount of 'x's and 'o's.
//        The method must return a boolean and be case insensitive. The string can contain any char.
//
//        Examples input/output:
//
//        XO("ooxx") => true
//        XO("xooxx") => false
//        XO("ooxXm") => true
//        XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
//        XO("zzoo") => false

//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.CsvSource;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//class SolutionTest {
//    @ParameterizedTest(name = "str = \"{1}\"") @DisplayName("Sample tests")
//    @CsvSource(textBlock = """
//      true,  ooxx
//      false, xooxx
//      true,  ooxXm
//      true,  zpzpzpp
//      false, zzoo
//      true,  xxxooo
//      true,  xxxXooOo
//      false, xxx23424esdsfvxXXOOooo
//      false, xXxxoewrcoOoo
//      false, XxxxooO
//      true,  zssddd
//      false, Xxxxertr34
//      true,  ''
//  """)
//    void sampleTests(boolean expected, String input) {
//        assertEquals(expected, XO.getXO(input));
//    }
//}


public class GetXo {
    public static void main(String[] args) {
        System.out.println(getXO("ooxXm"));

    }

    public static boolean getXO (String str) {
        // step 1 : initialized two variables to keep track of the amount of x and o in the string
        int countAmountOfX = 0;
        int countAmountOfO  = 0;

        // step 2 : loop through each character in the string
        for(char charInString : str.toCharArray()){


            // step 3 : if the current character is x for both lower and uppercase increment the count by 1
            if(charInString == 'x' || charInString == 'X' ){
                countAmountOfX++;

                // step 4 : else if the current character is o for both lower and uppercase increment the count by 1
            } else if (charInString == 'o' || charInString == 'O') {
                countAmountOfO++;
            }
        }

        // step 5 : if the count are equal return true, else return false
        return countAmountOfX == countAmountOfO;

    }
}


// LINK : https://www.codewars.com/kata/55908aad6620c066bc00002a/train/java
