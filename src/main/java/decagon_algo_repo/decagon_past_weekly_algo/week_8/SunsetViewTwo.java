package decagon_algo_repo.decagon_past_weekly_algo.week_8;

import java.util.ArrayList;
import java.util.Collections;

public class SunsetViewTwo {
    public static void main(String[] args) {
        int[] buildings = {3, 5, 4, 4, 3, 1, 3, 2};
        String direction = "EAST"; // or "WEST"

        // Getting the output
        ArrayList<Integer> result = sunsetViews(buildings, direction);
        System.out.println(result);

    }

    public static ArrayList<Integer> sunsetViews(int[] buildings, String direction) {
        // Write your code here.
        // Initialize an ArrayList to store the indexes of buildings that can see the ocean view
        ArrayList<Integer> sunsetBuildings = new ArrayList<>();

        // Check for empty input, edge cases
        if (buildings == null || buildings.length == 0) {
            return sunsetBuildings;
        }

        // Determine the index and step based on the direction
        int index = direction.equals("EAST") ? 0 : buildings.length;
        int step = direction.equals("EAST") ? 1 : -1;

        // Iterate through the buildings in the specified direction using a for loop
        for (int i = index; i >= 0 && i < buildings.length; i += step) {
            int building = buildings[i];

            // Remove the indexes of buildings that cannot see the ocean view due to the current building's height
            while (!sunsetBuildings.isEmpty() && buildings[sunsetBuildings.get(sunsetBuildings.size() - 1)] <= building) {
                sunsetBuildings.remove(sunsetBuildings.size() - 1);
            }

            // Add the index of the current building to the result
            sunsetBuildings.add(i);
        }

        // If the direction is WEST, reverse the result to get the indexes in ascending order
        if (direction.equals("WEST")) {
            Collections.reverse(sunsetBuildings);
        }

        return sunsetBuildings;
    }
}
