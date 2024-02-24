package decagon_algo_repo.decagon_past_weekly_algo.kata_8_algo;

//Jack really likes his number five: the trick here is that you have to
//        multiply each number by 5 raised to the number of digits of each numbers, so, for example:
//
//        multiply(3) == 15 # 3 * 5¹
//        multiply(10) == 250 # 10 * 5²
//        multiply(200) == 25000 # 200 * 5³
//        multiply(0) == 0 # 0 * 5¹
//        multiply(-3) == -15 # -3 * 5¹
//
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//class MultiplyExampleTests {
//
//    @Test
//    void tests() {
//        assertEquals(15, Kata.multiply(3), "For number = 3");
//        assertEquals(250, Kata.multiply(10), "For number = 10");
//        assertEquals(25000, Kata.multiply(200), "For number = 200");
//        assertEquals(0, Kata.multiply(0), "For number = 0");
//        assertEquals(-15, Kata.multiply(-3), "For number = -3");
//    }
//}

public class MultiplyTheNumber {
    public static void main(String[] args) {
        System.out.println(multiply(200));
    }

    public static int multiply(int number) {
        // Your code here

        String convertNum = Integer.toString(number);



        int num = convertNum.length();

       // System.out.println(num);
        int d = number * 5;



        return (int)Math.pow(d, 5);
    }
}


//https://www.codewars.com/kata/5708f682c69b48047b000e07/train/java