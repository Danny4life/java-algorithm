package kata_8;

//Complete the function which takes two arguments and returns all numbers which are divisible by the given divisor.
//        First argument is an array of numbers and the second is the divisor.
//
//        Example(Input1, Input2 --> Output)
//        [1, 2, 3, 4, 5, 6], 2 --> [2, 4, 6]

import java.util.Arrays;

// loop through the arr
// use modulus
public class FindNumbers {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9};

        System.out.println(Arrays.toString(divisibleBy(arr, 2)));
    }

    public static int[] divisibleBy(int[] numbers, int divider) {

        int count = 0;
        for(int number : numbers){
            if(number % divider == 0){
                count++;
            }
        }

        int[] arr = new int[count];
        int i = 0;

        for(int number : numbers){
            if(number % divider == 0){
                arr[i] = number;
                i++;
            }
        }


        return arr;
    }
}
