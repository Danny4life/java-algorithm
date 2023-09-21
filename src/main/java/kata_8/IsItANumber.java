package kata_8;

//Given a string s, write a method (function) that will return true if
//        its a valid single integer or floating number or false if its not.
//
//        Valid examples, should return true:
//
//        isDigit("3")
//        isDigit("  3  ")
//        isDigit("-3.23")
//        should return false:
//
//        isDigit("3-4")
//        isDigit("  3   5")
//        isDigit("3 5")
//        isDigit("zero")

//import org.junit.Test;
//import static org.junit.Assert.assertEquals;
//
//public class DigitTest {
//
//    MyUtilities myUtil = new MyUtilities();
//
//    @Test
//    public void test0() throws Exception {
//        assertEquals(false, myUtil.isDigit("s2324"));
//    }
//
//    @Test
//    public void test1() throws Exception {
//        assertEquals(true, myUtil.isDigit("-234.4"));
//    }
//
//}

// https://www.codewars.com/kata/57126304cdbf63c6770012bd/train/java

// steps
// 1. create a method to check for valid integer
// 2. create a method to check for valid floating point number
// 3. then check if number is a valid integer, return true
// 4. else if it is a valid floating point number return true
// 5. else return false.

import java.util.regex.Pattern;

public class IsItANumber {

    public static void main(String[] args) {
        System.out.println(isDigit("3 5"));
    }

    public static boolean isDigit(String s)
    {
        //return true or false

        if(forValidInteger(s)){
            return true;
        } else if (forValidFloat(s)) {
            return true;

        }

        return false;
    }

    public static boolean forValidInteger(String integer){
        String reg1 = "^[-+]?\\d+$";

        return Pattern.matches(reg1, integer);
    }

    public static boolean forValidFloat(String floatingNumber){
        String reg2 = "^[-+]?\\d*\\.?\\d+$";

        return Pattern.matches(reg2, floatingNumber);
    }
}
