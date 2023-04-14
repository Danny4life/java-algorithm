package kata_7;

//In this kata, you need to write a function that takes a string and a letter
//        as input and then returns the index of the second occurrence of that letter in the string.
//        If there is no such letter in the string, then the function should return -1.
//        If the letter occurs only once in the string, then -1 should also be returned.
//
//        Examples:
//
//        second_symbol('Hello world!!!','l') --> 3
//        second_symbol('Hello world!!!', 'A') --> -1
//        Good luck ;) And don't forget to rate this Kata if you liked it.


//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//class SolutionTest {
//
//    @Test
//    @DisplayName("Example Tests")
//    void sampleTestCases() {
//        assertEquals( 3, SecondOcurrence.secondSymbol("Hello world!!!", 'l'), "Find the index of the second symbol 'l' in the string");
//        assertEquals( 7, SecondOcurrence.secondSymbol("Hello world!!!", 'o'), "Find the index of the second symbol 'o' in the string");
//        assertEquals(-1, SecondOcurrence.secondSymbol("Hello world!!!", 'A'), "The symbol 'A' is not in the string");
//        assertEquals(-1, SecondOcurrence.secondSymbol("", 'q'),"The symbol 'q' is not in the string");
//        assertEquals(-1, SecondOcurrence.secondSymbol("Hello", '!'), "The symbol '!' is not in the string");
//    }
//}

//pseudocode
// 1. loop through the string
// 2. check if the char occurs twice in the string, if yes return the index
// 3. if not, return -1

public class SecondOccurence {

    public static void main(String[] args) {
        System.out.println(secondSymbol("Hello world!!!", 'o'));
    }

    public static int secondSymbol(String str, char c) {
        //DO YOUR MAGIC!!
       int firstIndex = str.indexOf(c);
       int secondIndex = str.indexOf(c, firstIndex + 1);

       if(firstIndex == -1 || secondIndex == -1){
           return -1;
       }

       return secondIndex;
    }
}
