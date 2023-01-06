package kata_8;

//You get an array of numbers, return the sum of all of the positives ones.
//
//        Example [1,-4,7,12] => 1 + 7 + 12 = 20
//
//        Note: if there is nothing to sum, the sum is default to 0.
//

//public class SolutionTest {
//    @Test
//    public void testSomething() {
//        assertEquals(15, Positive.sum(new int[]{1,2,3,4,5}));
//        assertEquals(13, Positive.sum(new int[]{1,-2,3,4,5}));
//        assertEquals(0, Positive.sum(new int[]{}));
//        assertEquals(0, Positive.sum(new int[]{-1,-2,-3,-4,-5}));
//        assertEquals(9, Positive.sum(new int[]{-1,2,3,4,-5}));
//    }
//}

//STEPS
//--get the sum of all numbers
///- create an int variable 0
///- loop through all the array
///-assigned and concantenate all the loop array to the variable
//-- return only the sum of the negative numbers
///- check if any of the number is negative,if yes skip it
//-- if there is no positive number, return zero
public class Positive {

    public static void main(String[] args) {
        System.out.println(sum(new int[]{}));
    }

    public static int sum(int[] arr){

        int sum = 0;
        for(int i = 0; i < arr.length; i++){

            if(arr[i] < 0) {
                continue;
            }
            sum += arr[i];

        }
        return sum;
    }
}
