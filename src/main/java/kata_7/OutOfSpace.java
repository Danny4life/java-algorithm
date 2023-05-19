package kata_7;

//Kevin is noticing his space run out! Write a function that removes the spaces
//        from the values and returns an array showing the space decreasing.
//        For example, running this function on the array ['i', 'have','no','space']
//        would produce ['i','ihave','ihaveno','ihavenospace']
//

//import java.util.Arrays;
//import org.junit.jupiter.api.*;
//
//class SolutionTest {
//
//    @Test
//    @Order(1)
//    @DisplayName("Strings with lower letters only")
//    void test1() {
//        String[] input = new String[]{"kevin", "has", "no", "space"};
//        String[] expected = new String[]{"kevin", "kevinhas", "kevinhasno", "kevinhasnospace"};
//        Assertions.assertArrayEquals(expected, OutOfSpace.spacey(input));
//    }
//
//    @Test
//    @Order(2)
//    @DisplayName("Strings with camel case")
//    void test2() {
//        String[] input = new String[]{"Camel", "Case", "Should", "Remain"};
//        String[] expected = new String[]{"Camel", "CamelCase", "CamelCaseShould", "CamelCaseShouldRemain"};
//        Assertions.assertArrayEquals(expected, OutOfSpace.spacey(input));
//    }
//
//    @Test
//    @Order(3)
//    @DisplayName("Strings with letters, digits,")
//    void test3() {
//        String[] input = new String[]{"Trying!", "Adding2", "Diff3rent", "Comb1nati0ns"};
//        String[] expected = new String[]{"Trying!", "Trying!Adding2", "Trying!Adding2Diff3rent", "Trying!Adding2Diff3rentComb1nati0ns"};
//        Assertions.assertArrayEquals(expected, OutOfSpace.spacey(input));
//    }


//Pseudcode
// 1. write a function that removes the spaces from the values
// 2. and return an array showing the space decreasing


import java.util.Arrays;

public class OutOfSpace {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(spacey(new String[]{"i", "have","no","space"})));
    }

    public static String[] spacey(String[] array) {
        // TODO: Figure it out :)
        for (int i = 1; i < array.length; i++) {
            array[i] = array[i - 1] + array[i];
        }
        return array;
    }
}
