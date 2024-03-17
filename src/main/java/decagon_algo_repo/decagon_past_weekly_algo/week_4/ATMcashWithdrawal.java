package decagon_algo_repo.decagon_past_weekly_algo.week_4;

//Task
//        An ATM only has 100, 50 and 20 dollar bills (USD) available to be dispensed.
//
//        Given an amount between 40 and 10000 dollars (inclusive) and assuming
//        that the ATM wants to use as few bills as possible, determinate the
//        minimal number of 100, 50 and 20 dollar bills the ATM needs to dispense (in that order).
//
//        Here is the specification for the withdraw method you'll complete:
//
//        Challenge.withdraw(amount)
//        Parameters
//        amount: Integer - Amount of money to withdraw. Assume that the amount is
//        always divisible into 100, 50 and 20 bills.
//
//        Return Value
//        Integer[] - An array of 3 integers representing the number of 100,
//        50 and 20 dollar bills needed to complete the withdraw (in that order).
//
//        Constraints
//        40 ≤ amount ≤ 10,000
//
//        Examples
//        amount	Return Value
//        250	[2,1,0]
//        260	[2,0,3]
//        370	[3,1,1]
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Nested;
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//@DisplayName("withdraw")
//public class WithdrawTest {
//    @Nested
//    @DisplayName("sample tests")
//    class SampleTests {
//
//        @Test
//        @DisplayName("should handle 40")
//        public void shouldHandle40() {
//            assertEquals(AL(0, 0, 2), Challenge.withdraw(40));
//        }
//
//        @Test
//        @DisplayName("should handle 60")
//        public void shouldHandle60() {
//            assertEquals(AL(0, 0, 3), Challenge.withdraw(60));
//        }
//
//        @Test
//        @DisplayName("should handle 230")
//        public void shouldHandle230() {
//            assertEquals(AL(1, 1, 4), Challenge.withdraw(230));
//        }
//
//        @Test
//        @DisplayName("should handle 250")
//        public void shouldHandle250() {
//            assertEquals(AL(2, 1, 0), Challenge.withdraw(250));
//        }
//
//        @Test
//        @DisplayName("should handle 260")
//        public void shouldHandle260() {
//            assertEquals(AL(2, 0, 3), Challenge.withdraw(260));
//        }
//    }
//
//    @SafeVarargs
//    public static <T> ArrayList<T> AL(T ...a) {
//        return new ArrayList<T>(Arrays.asList(a));
//    }
//}
//

import java.util.ArrayList;
import java.util.Arrays;

public class ATMcashWithdrawal {

    public static void main(String[] args) {

    }

    public static ArrayList<Integer> withdraw(int amount) {

        return new ArrayList<Integer>(Arrays.asList(0, 0, 0));
    }
}
