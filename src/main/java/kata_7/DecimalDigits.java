package kata_7;

//Determine the total number of digits in the integer (n>=0) given as input to the function.
//        For example, 9 is a single digit, 66 has 2 digits and 128685 has 6 digits.
//        Be careful to avoid overflows/underflows.
//
//        All inputs will be valid.


//public class SampleTests {
//    @Test
//    public void Digits() {
//        assertEquals(1,  DecTools.Digits(5l));
//        assertEquals(5,  DecTools.Digits(12345l));
//        assertEquals(10, DecTools.Digits(9876543210l));
//    }
//}

// steps
// initialize a count variable
// loop through the given parameter
// sum the count
// return it

public class DecimalDigits {

    public static void main(String[] args) {
        System.out.println(Digits(0l));
    }

    public static int Digits(long n) {

        int count = 0;

        if(n == 0){
            return 1;
        }

        while (n > 0){
            n /= 10;
            count++;

        }

        return count;
    }
}
