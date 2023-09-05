package kata_8;

//There are pillars near the road. The distance between the pillars is the same and the width of the pillars is the same.
//        Your function accepts three arguments:
//
//        number of pillars (≥ 1);
//        distance between pillars (10 - 30 meters);
//        width of the pillar (10 - 50 centimeters).
//        Calculate the distance between the first and the last pillar in centimeters
//        (without the width of the first and last pillar).


//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//class SolutionTest {
//    @Test
//    void basicTest1() {
//        assertEquals(0, Kata.pillars(1,10,10), "Testing for number of pillars: 1, distance: 10 m and width: 10 cm");
//    }
//
//    @Test
//    void basicTest2() {
//        assertEquals(2000, Kata.pillars(2,20,25), "Testing for number of pillars: 2, distance: 20 m and width: 25 cm");
//    }
//
//    @Test
//    void basicTest3() {
//        assertEquals(15270, Kata.pillars(11,15,30), "Testing for number of pillars: 11, distance: 15 m and width: 30 cm");
//    }
//}

// STEPS
/// 1 number of pillars must be > 1

//link
// https://www.codewars.com/kata/5bb0c58f484fcd170700063d/train/java


public class Pillar {

    public static void main(String[] args) {
        System.out.println(pillars(2,20,25));



    }

    public static int pillars(int numPill, int dist, int width){

       if(numPill <= 1){
           return 0;
       } else if (numPill == 2) {
           return dist * 100;
       }else {
           return (numPill - 1) * dist * 100 + (numPill - 2) * width;
       }

    }


}
