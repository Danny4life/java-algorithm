package kata_8;

//I'm new to coding and now I want to get the sum of two arrays...
//        Actually the sum of all their elements. I'll appreciate for your help.
//
//        P.S. Each array includes only integer numbers. Output is a number too.

//public class SolutionTest {
//    @Test
//    public void sampleTests() {
//        assertEquals(21, Sum.arrayPlusArray(new int[]{1,2,3}, new int[]{4,5,6}));
//        assertEquals(-21, Sum.arrayPlusArray(new int[]{-1,-2,-3}, new int[]{-4,-5,-6}));
//        assertEquals(15, Sum.arrayPlusArray(new int[]{0,0,0}, new int[]{4,5,6}));
//        assertEquals(2100, Sum.arrayPlusArray(new int[]{100,200,300}, new int[]{400,500,600}));
//    }
//}

//Steps
//-- sum all array 1
// sum all array 2
//-- add array 1 and array 2 together

public class ArrayOfArray {
    public static void main(String[] args) {
        System.out.println(arrayPlusArray(new int[]{100,200,300}, new int[]{400,500,600}));
    }

    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        // arr1 + arr2 is not working...

        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0; i < arr1.length; i++){
            sum1 += arr1[i];
        }
        for(int j = 0; j < arr2.length; j++){
            sum2 += arr2[j];
        }
        return (sum1 + sum2);
    }

}
