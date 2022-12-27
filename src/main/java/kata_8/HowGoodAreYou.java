package kata_8;

//There was a test in your class and you passed it. Congratulations!
//        But you're an ambitious person. You want to know if you're better than the average student in your class.
//
//        You receive an array with your peers' test scores. Now calculate the average and compare your score!
//
//        Return True if you're better, else False!
//
//        Note:
//        Your points are not included in the array of your class's points. For calculating the average point you may add
//        your point to the given array!

// get the average of the peers total score
// check if student score is greater than the average, if yes return true else return false;


//public class KataExampleTests {
//    @Test
//    public void tests() {
//        assertEquals(true, Kata.betterThanAverage(new int[] {2, 3}, 5));
//        assertEquals(true, Kata.betterThanAverage(new int[] {100, 40, 34, 57, 29, 72, 57, 88}, 75));
//        assertEquals(true, Kata.betterThanAverage(new int[] {12, 23, 34, 45, 56, 67, 78, 89, 90}, 69));
//        assertEquals(false, Kata.betterThanAverage(new int[] {100, 90}, 11));
//    }
//
//}

public class HowGoodAreYou {

    public static void main(String[] args) {
        System.out.println(betterThanAverage(new int[] {100, 90}, 11));

//        int[] arr = {1,2,3,4,5,6,7,8,9};
//        int total = 0;
//        int avr = 0;
//
//        for(int i = 0; i < arr.length; i++){
//            total = total + arr[i];
//            avr = total / arr.length;
//
//
//        }
//        System.out.println(total);
   }

    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        // Your code here
        int total = 0;
        int average = 0;

        for(int i = 0; i < classPoints.length; i++){
            total = total + classPoints[i];
            average = total / classPoints.length;

            if(yourPoints > average){
                return true;
            }

        }

        return false;

    }
}
