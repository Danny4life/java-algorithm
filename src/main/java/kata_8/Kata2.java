package kata_8;

//write me a function stringy that takes a size and returns a string of alternating '1s' and '0s'.
//
//        the string should start with a 1.
//
//        a string with size 6 should return :'101010'.
//
//        with size 4 should return : '1010'.
//
//        with size 12 should return : '101010101010'.
//
//        The size will always be positive and will only use whole numbers.


//public class StringyExampleTests {
//    @Test
//    public void startTest() {
//        assertEquals("Your string should start with a 1", '1', Kata.stringy(3).charAt(0));
//    }
//
//    @Test
//    public void lengthTests() {
//        Random randGen = new Random();
//        for (int i = 0; i < 10; i++) {
//            int size = randGen.nextInt(50);
//            assertEquals("Wrong length using size " + size, size, Kata.stringy(size).length());
//        }
//    }
//}

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

//STEPS
//loop through the number
public class Kata2 {

    public static void main(String[] args) {
        System.out.println(stringy(4));
    }

    public static String stringy(int size) {
        // Your code here

      String str = "";

      for(int i = 1; i <= size; i++){
          str += i % 2;
      }

      return str;
    }
}
