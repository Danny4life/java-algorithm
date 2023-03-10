package alogorithm_not_solved;


//Having two standards for a keypad layout is inconvenient!
//        Computer keypad's layout:
//        7 8 9  \n
//        4 5 6  \n
//        1 2 3  \n
//        0 \n
//
//        Cell phone keypad's layout:
//        1 2 3\n
//        4 5 6\n
//        7 8 9\n
//        0\n
//
//        Solve the horror of unstandardized keypads by providing a function that converts computer input to a number
//        as if it was typed on a phone.
//
//        Example:
//        "789" -> "123"
//
//        Notes:
//        You get a string with numbers only


//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//class BudTest {
//
//    @Test
//    void basicTest() {
//        assertEquals("0123456789", Bud.computerToPhone("0789456123"), "For input \"0789456123\"");
//        assertEquals("000", Bud.computerToPhone("000"), "For input \"000\"");
//        assertEquals("34567", Bud.computerToPhone("94561"), "For input \"94561\"");
//        assertEquals("", Bud.computerToPhone(""), "For empty input");
//    }

// Explain
//---replace 789 with 123
//--- 456 stays the same
//--- replace 123 with 789
// 0 stays the same

/// STEPS
///-- get the substring from 789 and replace with 123

public class Bud {

    public static void main(String[] args) {
        System.out.println(computerToPhone("94561"));
    }

    public static String computerToPhone(String number){
        // solution



        return "";
    }
}
