package decagon_algo_repo.decagon_past_weekly_algo.week_9;

// given already
//Task
//        Your task is to create a function that will take an integer
//        and return the result of the look-and-say function on that integer.
//        This should be a general function that takes as input any positive integer,
//        and returns an integer; inputs are not limited to the sequence which starts with "1".
//
//        Conway's Look-and-say sequence goes like this:
//
//        Start with a number.
//        Look at the number, and group consecutive digits together.
//        For each digit group, say the number of digits, then the digit itself.
//        Sample inputs and outputs:
//
//        1 is read as "one 1" => 11
//        11 is read as "two 1s" => 21
//        21 is read as "one 2, then one 1" => 1211
//        9000 is read as "one 9, then 3 0s" => 1930
//        222222222222 is read as "twelve 2s" => 122


// Test case
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Nested;
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//@DisplayName("lookSay")
//public class LookSayTest {
//    @Nested
//    @DisplayName("sample tests")
//    class SampleTests {
//
//        @Test
//        @DisplayName("should work on sample tests")
//        public void shouldWorkOnSampleTests() {
//            assertEquals(10, Challenge.lookSay(0));
//            assertEquals(21, Challenge.lookSay(11));
//            assertEquals(1112, Challenge.lookSay(12));
//        }
//    }
//}
public class LookSay {
    public static void main(String[] args) {
        System.out.println(lookSay(12));
    }

    public static int lookSay(int number) {

        // Convert the given number to a string to easily iterate over its digits
        String input = String.valueOf(number);

        // Use StringBuilder to store the result
        StringBuilder result = new StringBuilder();

        // Initialize variables to track the current digit and its count and store in a char variable
        char currentDigit = input.charAt(0);
        int count = 1;

        // Iterate over the digits starting from the second digit
        for (int i = 1; i < input.length(); i++) {
            // Get the current digit
            char digit = input.charAt(i);
            // Check if the current digit is the same as the previous one
            if (digit == currentDigit) {
                // Increment count if current digit is the same as previous one
                count++;
            } else {
                // Append count and digit to the result
                result.append(count).append(currentDigit);
                // Reset count and update current digit
                count = 1;
                currentDigit = digit;
            }
        }

        // Append count and digit of the last group
        result.append(count).append(currentDigit);

        // Convert the result to integer
        return Integer.parseInt(result.toString());
    }
}
