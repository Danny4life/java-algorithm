package alogorithm_not_solved;


//Given a string and an array of integers representing indices, capitalize all letters at the given indices.
//
//        For example:
//
//        capitalize("abcdef",[1,2,5]) = "aBCdeF"
//        capitalize("abcdef",[1,2,5,100]) = "aBCdeF". There is no index 100.
//        The input will be a lowercase string with no spaces and an array of digits.
//
//        Good luck!

//
//import static kata.Solution.capitalize;
//
//import org.junit.runners.JUnit4;
//import org.junit.Test;
//import static org.junit.Assert.assertEquals;
//
//public class SolutionTest {
//    @Test
//    public void basicTest(){
//        assertEquals("aBCdeF", capitalize("abcdef", new int[]{1,2,5}));
//        assertEquals("aBCdeF", capitalize("abcdef", new int[]{1,2,5,100}));
//        assertEquals("cOdEwArs", capitalize("codewars", new int[]{1,3,5,50}));
//        assertEquals("abRacaDabRA", capitalize("abracadabra", new int[]{2,6,9,10}));
//        assertEquals("codewArriors", capitalize("codewarriors", new int[]{5}));
//    }
//}

//STEPS
//-i have a string and an array of integers, the integers represent indexes of each strings, i need to capitalize all
// string that represents the given index
//--loop through the string
//-- get the index of each string
//-- match it with the array integers
// if it matches return it as capitalize




public class Solution3 {

    public static void main(String[] args) {
        System.out.println(capitalize("abcdef", new int[]{1,2,5}));
    }

    public static String capitalize(String s, int[] ind) {


        return "";
    }
}
