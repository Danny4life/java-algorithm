package kata_8;

//Fix the bug in Filtering method
//        The method is supposed to remove even numbers from the list
//        and return a list that contains the odd numbers.
//
//        However, there is a bug in the method that needs to be resolved.


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

//import org.junit.Test;
//
//import java.util.stream.Collectors;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.*;
//
//import static org.junit.Assert.assertEquals;
//
//public class Kata13DecemberTest {
//    @Test
//    public void firstTest() throws Exception {
//        List<Integer> listOfNumbers = new LinkedList<>(Arrays.asList(1, 2, 2, 2, 4, 3, 4, 5, 6, 7));
//        List<Integer> expectedResult = new LinkedList<>(Arrays.asList(1, 3, 5, 7));
//        assertEquals(expectedResult,Kata13December.filterOddNumber(listOfNumbers));
//    }
//
//    @Test
//    public void secondTest()
//    {
//        List<Integer> listOfNumbers = new LinkedList<>(Arrays.asList( 1, 2, 2, 2, 4, 3, 4 ));
//        List<Integer> expectedResult = new LinkedList<>(Arrays.asList( 1, 3 ));
//        assertEquals(Arrays.toString(expectedResult.toArray()), Arrays.toString(Kata13December.filterOddNumber(listOfNumbers).toArray()));
//    }
//
//}

// https://www.codewars.com/kata/566dc566f6ea9a14b500007b/train/java
public class FixTheBug {
    public static void main(String[] args) {
        System.out.println(filterOddNumber(new LinkedList<>(Arrays.asList(1, 2, 2, 2, 4, 3, 4, 5, 6, 7))));
    }

    public static List<Integer> filterOddNumber(List<Integer> listOfNumbers)
    {

        List<Integer> oddNum = new ArrayList<>();

        for (Integer num : listOfNumbers)
        {
            if (num % 2 != 0)
            {
                oddNum.add(num);
            }
        }
        return oddNum;
    }
}
