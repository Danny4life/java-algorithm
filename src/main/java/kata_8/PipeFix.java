package kata_8;

//issue
//        Looks like some hoodlum plumber and his brother has been running around and damaging your stages again.
//
//        The pipes connecting your level's stages together need to be fixed before you receive any more complaints.
//
//        Pipes list is correct when each pipe after the first index is greater (+1) than the previous one,
//        and that there is no duplicates.
//
//        Task
//        Given the a list of numbers, return a fixed list so that the values increment by 1
//        for each index from the minimum value up to the maximum value (both included).
//
//        Example
//        Input:  1,3,5,6,7,8 Output: 1,2,3,4,5,6,7,8


import java.util.Arrays;

//
//public class PipesExampleTests {
//    @Test
//    public void tests() {
//        assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9}, Kata.pipeFix(new int[] {1,2,3,5,6,8,9}));
//        assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9,10,11,12}, Kata.pipeFix(new int[] {1,2,3,12}));
//        assertArrayEquals(new int[] {6,7,8,9}, Kata.pipeFix(new int[] {6,9}));
//        assertArrayEquals(new int[] {-1,0,1,2,3,4}, Kata.pipeFix(new int[] {-1,4}));
//        assertArrayEquals(new int[] {1,2,3}, Kata.pipeFix(new int[] {1,2,3}));
//    }
//}
public class PipeFix {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(pipeFix(new int[]{1, 2, 3, 5, 6, 8, 9})));
    }

    public static int[] pipeFix(int[] numbers) {
        // Fix the pipes!
    }
}
