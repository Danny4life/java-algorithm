package decagon_algo_repo.decagon_past_weekly_algo.week_5;
// Task given already
//Array Of Products
//        Write a function that takes in a non-empty array of integers and returns an array of the same length, where each element in the output array is equal to the product of every other number in the input array.
//
//        In other words, the value at output[i] is equal to the product of every number in the input array other than input[i].
//
//        Sample Input
//        [5, 1, 4, 2]
//        Sample Output
//        [8, 40, 10, 20]

// 8 is equal to 1 x 4 x 2
// 40 is equal to 5 x 4 x 2
// 10 is equal to 5 x 1 x 2
// 20 is equal to 5 x 1 x 4


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//import org.junit.Test;
//import static org.junit.Assert.*;
//import java.util.List;
//import java.util.Arrays;
//public class ArrayOfProductsTests {
//    @Test
//    public void test1() {
//        List<Integer> expected0 = Arrays.asList(8,40,10,20);
//        List<Integer> actual0 = Challenge.arrayOfProducts(Arrays.asList(5,1,4,2));
//        assertEquals(expected0, actual0);
//    }
//    @Test
//    public void test2() {
//        List<Integer> expected0 = Arrays.asList(384,48,64,192,96);
//        List<Integer> actual0 = Challenge.arrayOfProducts(Arrays.asList(1,8,6,2,4));
//        assertEquals(expected0, actual0);
//    }
//    @Test
//    public void test3() {
//        List<Integer> expected0 = Arrays.asList(1,1,1);
//        List<Integer> actual0 = Challenge.arrayOfProducts(Arrays.asList(-1,-1,-1));
//        assertEquals(expected0, actual0);
//    }
//}
public class ArrayOfProducts {
    public static void main(String[] args) {
        System.out.println(arrayOfProducts(Arrays.asList(5,1,4,2)));
    }

    public static List<Integer> arrayOfProducts(List<Integer> array) {
        int n = array.size();
        List<Integer> leftProduct = new ArrayList<>(n);
        List<Integer> rightProduct = new ArrayList<>(n);
        List<Integer> res = new ArrayList<>(n);

        // Calculate left products
        int product = 1;
        for (int i = 0; i < n; i++) {
            leftProduct.add(product);
            product *= array.get(i);
        }
        // Reset product for right products calculation
        product = 1;
        // Calculate right products
        for (int i = n - 1; i >= 0; i--) {
            // Add at index 0 to maintain order
            rightProduct.add(0, product);
            product *= array.get(i);
        }
        // Calculate the final result
        for (int i = 0; i < n; i++) {
            res.add(leftProduct.get(i) * rightProduct.get(i));
        }

        return res;
    }
}
