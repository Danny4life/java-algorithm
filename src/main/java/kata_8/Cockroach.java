package kata_8;

//The cockroach is one of the fastest insects. Write a function which takes
//        its speed in km per hour and returns it in cm per second, rounded
//        down to the integer (= floored).
//
//        For example:
//
//        1.08 --> 30
//        Note! The input is a Real number (actual type is language dependent)
//        and is >= 0. The result should be an Integer.

// -- convert km per hour to cm per second
//-- then round it down to its integer

//1 km/h = 27.777778 cm/s


//public class CockroachSpeedTests{
//    @Test
//    public void basicTests() throws Exception{
//        Cockroach cockroach = new Cockroach();
//        assertEquals(30, cockroach.cockroachSpeed(1.08));
//        assertEquals(30, cockroach.cockroachSpeed(1.09));
//        assertEquals(0, cockroach.cockroachSpeed(0));
//    }
//}

public class Cockroach {

    public static void main(String[] args) {
        System.out.println(cockroachSpeed(0));
    }

    public static int cockroachSpeed(double x){
        // Good Luck!
        int kmToCm = (int) (x * 27.777778);

        return kmToCm;
    }
}
