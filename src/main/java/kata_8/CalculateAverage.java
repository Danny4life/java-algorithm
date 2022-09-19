package kata_8;

//Write a function which calculates the average of the numbers in a given list.
//
//        Note: Empty arrays should return 0.

import java.util.Arrays;

public class CalculateAverage {
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        System.out.println(find_average(arr));
    }

    public static double find_average(int[] array){

        double total = 0;
        double average = 0;

        if(array.equals("")){
            return 0;
        }

        for(int i = 0; i < array.length; i++)
            total += array[i];
            average = total / array.length;
            return average;
    }
}
