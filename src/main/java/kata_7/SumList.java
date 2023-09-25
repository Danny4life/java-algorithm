package kata_7;

//Please write a function that sums a list, but ignores any duplicate items in the list.
//
//        For instance, for the list [3, 4, 3, 6] , the function should return 10.

//
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import java.util.Arrays;
//class SolutionTest {
//    @Test
//    void sampleTests() {
//        assertEquals(5 , Solution.sumNoDuplicates(new int[]{1, 1, 2, 3}), "Incorrect answer for arr = "+ Arrays.toString(new int[]{1, 1, 2, 3}));
//        assertEquals(6 , Solution.sumNoDuplicates(new int[]{1, 2, 3}), "Incorrect answer for arr = "+ Arrays.toString(new int[]{1,2,3}));
//        assertEquals(3 , Solution.sumNoDuplicates(new int[]{1, 1, 2, 2, 3}), "Incorrect answer for arr = "+ Arrays.toString(new int[]{1, 1, 2, 2, 3}));
//    }
//}

// steps
// create a hashmap to store duplicate numbers
// put the duplicate number into the hashmap
// initialized a sum total variable to hold the total sum of non duplicate numbers
// loop through the map to calculate the sum of non duplicate numebers
// sum the total
// return the sum total



import java.util.HashMap;
import java.util.Map;

public class SumList {

    public static void main(String[] args) {
        System.out.println(sumNoDuplicates(new int[]{1,1,2,3}));
    }

    public static int sumNoDuplicates(int[] arr){
        //Put your code here ʌ_ʌ

        Map<Integer, Integer> duplicateNum = new HashMap<>();

        for(int num : arr){
            duplicateNum.put(num, duplicateNum.getOrDefault(num, 0) + 1);
        }

        int sumTotal = 0;

        for(Map.Entry<Integer, Integer> nonDuplicatesNum : duplicateNum.entrySet()){
            if(nonDuplicatesNum.getValue() == 1){
                sumTotal = sumTotal + nonDuplicatesNum.getKey();
            }
        }
            return sumTotal;
    }

}
