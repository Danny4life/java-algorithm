package kata_8;

//Numbers ending with zeros are boring.
//
//        They might be fun in your world, but not here.
//
//        Get rid of them. Only the ending ones.
//
//        1450 -> 145
//        960000 -> 96
//        1050 -> 105
//        -1050 -> -105


//import static org.junit.Assert.*;
//import org.junit.Test;
//
//public class NoBoringTest {
//
//    private static void testing(int actual, int expected) {
//        assertEquals(expected, actual);
//    }
//    @Test
//    public void test1() {
//        System.out.println("Fixed Tests: noBoringZeros");
//        testing(NoBoring.noBoringZeros(1450), 145);
//        testing(NoBoring.noBoringZeros(960000), 96);
//        testing(NoBoring.noBoringZeros(1050), 105);
//        testing(NoBoring.noBoringZeros(-1050), -105);
//    }
//}



// algorithm to solve this problem
// 1. go through a given number
// 2. check if the given number ends with zero
// 3. if it end with zero, remove it and return the rest numbers


public class NoBoring {
    public static void main(String[] args) {
        System.out.println(noBoringZeros(960000));
    }

    public static int noBoringZeros(int n) {
        // your code

        if(n == 0){
            return n;
        }

        while (n % 10 == 0){
            n /= 10;
        }

        return n;
    }


}
