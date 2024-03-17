package decagon_algo_repo.decagon_past_weekly_algo.week_10;

// given alrready
//You're given a list of time intervals during which students at a school need a laptop.
//        These time intervals are represented by pairs of integers [start, end], where 0 <= start < end.
//        However, start and end don't represent real times; therefore, they may be greater than 24.
//
//        No two students can use a laptop at the same time, but immediately after a student is done using a laptop,
//        another student can use that same laptop. For example, if one student rents a laptop during the time interval [0, 2], another student can rent the same laptop during any time interval starting with 2.
//
//        Write a function that returns the minimum number of laptops that the school needs
//        to rent such that all students will always have access to a laptop when they need one.
//
//        Challenge.laptopRentals(times)
//        Parameters
//        times: List<Integer[]> - A 2D array containing the times the student would require a laptop.
//
//        Return Value
//        Integer - Minimum number of laptops the school needs to rent.
//
//        Examples
//        times	Return Value
//        [[0,2],[1,4],[4,6],[0,4],[7,8],[9,11],[3,10]]	3
//        [[0,4],[2,3],[2,3],[2,3]]	4
//        [[1,5],[5,6],[6,7],[7,9]]	1
//
//import org.junit.Test;
//import static org.junit.Assert.*;
//import java.util.List;
//import java.util.Arrays;
//public class LaptopRentalsTests {
//    @Test
//    public void example1() {
//        Integer expected0 = 3;
//        Integer actual0 = Challenge.laptopRentals(Arrays.asList(Arrays.asList(0,2),Arrays.asList(1,4),Arrays.asList(4,6),Arrays.asList(0,4),Arrays.asList(7,8),Arrays.asList(9,11),Arrays.asList(3,10)));
//        assertEquals(expected0, actual0);
//    }
//    @Test
//    public void example2() {
//        Integer expected0 = 4;
//        Integer actual0 = Challenge.laptopRentals(Arrays.asList(Arrays.asList(0,4),Arrays.asList(2,3),Arrays.asList(2,3),Arrays.asList(2,3)));
//        assertEquals(expected0, actual0);
//    }
//    @Test
//    public void example3() {
//        Integer expected0 = 1;
//        Integer actual0 = Challenge.laptopRentals(Arrays.asList(Arrays.asList(1,5),Arrays.asList(5,6),Arrays.asList(6,7),Arrays.asList(7,9)));
//        assertEquals(expected0, actual0);
//    }
//    @Test
//    public void example4() {
//        Integer expected0 = 1;
//        Integer actual0 = Challenge.laptopRentals(Arrays.asList(Arrays.asList(0,4)));
//        assertEquals(expected0, actual0);
//    }
//    @Test
//    public void example5() {
//        Integer expected0 = 0;
//        Integer actual0 = Challenge.laptopRentals(Arrays.asList(Arrays.asList()));
//        assertEquals(expected0, actual0);
//    }
//}

import java.util.*;

public class LaptopRentals {
    public static void main(String[] args) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(Arrays.asList(1, 5));
        result.add(Arrays.asList(5, 6));
        result.add(Arrays.asList(6, 7));
        result.add(Arrays.asList(7,9));
        System.out.println(laptopRentals(result));
    }

    public static Integer laptopRentals(List<List<Integer>> times) {

        // check for edge cases
        if (times == null || times.isEmpty()){
            return 0;
        }

        // Sort the intervals based on start times in ascending order
        Collections.sort(times, Comparator.comparingInt(o -> o.get(0)));

        Queue<Integer> result = new PriorityQueue<>();

        for (List<Integer> interval : times) {
            int start = interval.get(0);
            int end = interval.get(1);

            // Check if any laptop is available
            if (!result.isEmpty() && result.peek() <= start) {
                // Update the result of the laptop
                result.poll();
            }

            // Allocate a new laptop (add result to priority queue)
            result.offer(end);
        }

        // Number of laptops in use is the size of the priority queue
        return result.size();
    }
}



