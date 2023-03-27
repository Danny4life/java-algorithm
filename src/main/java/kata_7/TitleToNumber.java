package kata_7;

//Write a function
//
//        titleToNumber(title) or title_to_number(title) or titleToNb title ...
//
//        (depending on the language)
//
//        that given a column title as it appears in an Excel sheet, returns its corresponding column number.
//        All column titles will be uppercase.
//
//        Examples:
//
//        titleTonumber('A') === 1
//        titleTonumber('Z') === 26
//        titleTonumber('AA') === 27
//        Note for Clojure:
//        Don't use Java Math/pow (even with bigint) because there is a loss of precision
//        when the length of "title" is growing.
//        Write your own function "exp [x n]".

//import static org.junit.Assert.*;
//import org.junit.Test;
//
//public class TitleToNumberTest {
//    @Test
//    public void test0() {
//        System.out.println("Fixed Tests");
//        assertEquals(1, TitleToNumber.titleToNumber("A"));
//        assertEquals(27, TitleToNumber.titleToNumber("AA"));
//        assertEquals(52, TitleToNumber.titleToNumber("AZ"));
//        assertEquals(53, TitleToNumber.titleToNumber("BA"));
//        assertEquals(28779382963L, TitleToNumber.titleToNumber("CODEWARS"));
//    }
//}


//pseudocode
//--start count from A which is 1 up to Z  which is 26
//-- add A + B + C....Z

public class TitleToNumber {

    public static void main(String[] args) {
        System.out.println(titleToNumber("CODEWARS"));
    }

    public static long titleToNumber(String title) {
        // your code
        Long result = 0L;

        for(int i = 0; i < title.length(); i++){
            char c = title.charAt(i);
            result = result * 26 + (c - 'A' + 1);
        }


        return result;
    }
}
