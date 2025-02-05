package decagon_algo_repo.decagon_past_weekly_algo.week_4;

import java.util.ArrayList;
// task given already by Dami
public class Challenge {
    public static int packArray(ArrayList<Integer> integers) {

        // Step 1. Loop through the array list until the size of the integers list is greater than 1
        for (int i = 0; integers.size() > 1; i++) {
            // Step 2. Create a new ArrayList to store the result of the current pass
            ArrayList<Integer> res = new ArrayList<Integer>();

            // Step 3. Iterate over the integers list in steps of 2
            for (int j = 0; j < integers.size(); j += 2) {
                // Step 4. Get the current pair of elements
                int x = integers.get(j);
                int y = integers.get(j + 1);

                // Step 5. Add the sum or product of the pair to the result list
                // Step 6. If i is even, add x + y; if i is odd, add x * y
                res.add(i % 2 == 0 ? x + y : x * y);
            }

            // Step 7. Update the integers list with the result list for the next pass
            integers = res;
        }

        // Step 8. Return the final remaining element in the list
        return integers.get(0);
    }
}
