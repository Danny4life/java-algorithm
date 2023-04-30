package kata_7;

//Task
//        You have a list of integers. The task is to return the maximum sum of the
//        elements located between two negative elements. No negative element should
//        be present in the sum. If there is no such sum: -1 for Python, C++, JavaScript,
//        Java, CoffeeScript and COBOL, Nothing for Haskell, None for Rust.
//
//        Example 1
//        [4, -1, 6, -2, 3, 5, -7, 7] -> 8
//        ^      ^         ^
//        Sum between -1 and -2 is 6, between -2 and -7 is 3 + 5 = 8.
//        It's also not 14 (between -1 and -7), because this includes a negative number (-2).
//
//        Example 2
//        [4, -1, -2] -> 0
//        ^   ^
//        There is nothing between -1 and -2, so return 0.
//
//
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//class SolutionTest {
//    @Test
//    void testBasic() {
//        assertEquals(8, MaxSumBetweenTwoNegatives.maxSum(new int[] { -1, 6, -2, 3, 5, -7 }));
//        assertEquals(0, MaxSumBetweenTwoNegatives.maxSum(new int[] { 5, -1, -2 }));
//        assertEquals(-1, MaxSumBetweenTwoNegatives.maxSum(new int[] { 1, -2 }));
//    }
//}

//pseudocode
// 1. first check for a negative element
// 2. check if there is  positive element after the first negative element
// 3. check if there is a negative element after the positive element
// 4. return the sum of the positive element between two negative element

public class MaxSumBetweenTwoNegative {
    public static void main(String[] args) {
        System.out.println(maxSum(new int[] { -1, 6, -2, 3, 5, -7 }));
    }

    public static int maxSum(int[] arr) {
        // Your code

        int sum = -1;
        int max = -1;
        for(int a : arr)
            if(a < 0) {
                if(sum > -1 && sum > max) max = sum;
                sum = 0;
            } else if(sum > -1) sum += a;
        return max;
    }
}
