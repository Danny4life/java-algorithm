package kata_7;

//This kata is about static method that should return different values.
//
//        On the first call it must be 1, on the second and others - it must be a double from previous value.
//
//        Look tests for more examples, good luck :)


//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//class SolutionTest {
//    @Test
//    void basicTests() {
//        assertEquals(1, A.getNumber());
//        assertEquals(2, A.getNumber());
//        assertEquals(4, A.getNumber());
//        assertEquals(8, A.getNumber());
//        assertEquals(16, A.getNumber());
//    }
//}

//pseudocode
// double the value by its number everytime the code is run


public class DoubleValue {
    public static void main(String[] args) {
        System.out.println(getNumber());
    }

    static int num = 1;
    public static int getNumber() {

        int currentValue = num;
        num += num;


        return currentValue;
    }
}
