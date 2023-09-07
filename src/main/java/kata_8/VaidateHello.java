package kata_8;

//You received a whatsup message from an unknown number. Could it be from that girl/boy
//        with a foreign accent you met yesterday evening?
//
//        Write a simple function to check if the string contains the word hallo in different languages.
//
//        These are the languages of the possible people you met the night before:
//
//        hello - english
//        ciao - italian
//        salut - french
//        hallo - german
//        hola - spanish
//        ahoj - czech republic
//        czesc - polish
//        Notes
//
//        you can assume the input is a string.
//        to keep this a beginner exercise you
//        don't need to check if the greeting is a subset of word (Hallowen can pass the test)
//        function should be case insensitive to pass the tests

//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;

// TODO: Replace examples and use TDD by writing your own tests

//class SolutionTest {
//
//    @Test
//    void testSomething() {
//        assertTrue(Kata.validateHello("hello"));
//        assertTrue(Kata.validateHello("ciao bella!"));
//        assertTrue(Kata.validateHello("salut"));
//        assertTrue(Kata.validateHello("hallo, salut"));
//        assertTrue(Kata.validateHello("hombre! Hola!"));
//        assertTrue(Kata.validateHello("Hallo, wie geht\'s dir?"));
//        assertTrue(Kata.validateHello("AHOJ!"));
//        assertTrue(Kata.validateHello("czesc"));
//        assertTrue(Kata.validateHello("Ahoj"));
//        assertFalse(Kata.validateHello("meh"));
//    }
//}

// https://www.codewars.com/kata/56a4addbfd4a55694100001f/train/java

// STEPS
// 1. check for case insensitive
// 2. check if any of the language is contain in the string greeting
// 3. if yes, return true
// 4. else, return false.

public class VaidateHello {

    public static void main(String[] args) {
        System.out.println(validateHello("Hallo, wie geht\\'s dir?"));
    }

    public static boolean validateHello(String greetings){
        //Your code

       String res = greetings.toLowerCase();

       if(res.contains("hello") || res.contains("ciao") || res.contains("salut") || res.contains("hallo") ||
       res.contains("hola") || res.contains("ahoj") || res.contains("czesc")){
           return true;
       }

       return false;
    }
}
