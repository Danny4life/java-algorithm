package alogorithm_not_solved;
//
//Write a function that takes a string of parentheses, and determines if the order of the parentheses is valid.
//        The function should return true if the string is valid, and false if it's invalid.
//
//        Examples
//        "()"              =>  true
//        ")(()))"          =>  false
//        "("               =>  false
//        "(())((()())())"  =>  true
//        Constraints
//        0 <= length of input <= 100
//
//        All inputs will be strings, consisting only of characters ( and ).
//        Empty strings are considered balanced (and therefore valid), and will be tested.
//        For languages with mutable strings, the inputs should not be mutated.

//
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.DisplayName;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//// TODO: Replace examples and use TDD by writing your own tests
//
//class SampleTests {
//    @Test @DisplayName("Should return true for valid parentheses")
//    void validCases() {
//        runTest(true, "()");
//        runTest(true, "((()))");
//        runTest(true, "()()()");
//        runTest(true, "(()())()");
//        runTest(true, "()(())((()))(())()");
//    }
//
//    @Test @DisplayName("Should return false for invalid parentheses")
//    void invalidCases() {
//        runTest(false, ")(");
//        runTest(false, "()()(");
//        runTest(false, "((())");
//        runTest(false, "())(()");
//        runTest(false, ")()");
//        runTest(false, ")");
//    }
//
//    @Test @DisplayName("Should return true for empty strings")
//    void emptyString() {
//        runTest(true, "");
//    }
//    private void runTest(boolean expected, String input) {
//        assertEquals(expected, Kata.validParentheses(input), "Test failed for input \""+input+"\"");
//    }
//}

//STEPS
//--Parenthesis must start with ( and end with ) to return true, if not return false

public class Kata77 {

    public static void main(String[] args) {
        System.out.println(validParentheses(  "()"));
    }

    public static boolean validParentheses(String parenStr) {


      return false;
    }
}
