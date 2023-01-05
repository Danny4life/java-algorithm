package kata_8;

//You will be given a list of strings. You must sort it alphabetically
//        (case-sensitive, and based on the ASCII values of the chars) and then return the first value.
//
//        The returned value must be a string, and have "***" between each of its letters.
//
//        You should not remove or add elements from/to the array.
//


//public class SolutionTest {
//
//    @Test
//    public void testFixed() {
//        assertEquals("b***i***t***c***o***i***n", SortAndStar.twoSort(new String[]
//                {"bitcoin", "take", "over", "the", "world", "maybe", "who", "knows", "perhaps"}));
//        assertEquals("a***r***e", SortAndStar.twoSort(new String[]
//                {"turns", "out", "random", "test", "cases", "are", "easier", "than", "writing", "out", "basic", "ones"}));
//    }
//}

//STEPS
//-- Sort the array first
//-- return the first value only
//-- add *** between each letter

import java.util.Arrays;

public class SortAndStar {

    public static void main(String[] args) {
        System.out.println(twoSort(new String[] {"bitcoin", "take", "over", "the", "world", "maybe", "who", "knows", "perhaps"}));


    }

    public static String twoSort(String[] s) {
        Arrays.sort(s);

        String str = s[0];

        String[] arr = str.split("");

        String newStr = Arrays.toString(arr);



        return newStr.join("***", arr);
    }
}
