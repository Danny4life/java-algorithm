package kata_8;

//Write a method, that will get an integer array as parameter and will process every number from this array.
//
//        Return a new array with processing every number of the input-array like this:
//
//        If the number has an integer square root, take this, otherwise square the number.
//
//        Example
//        [4,3,9,7,2,1] -> [2,9,3,49,4,1]
//        Notes
//        The input array will always contain only positive numbers, and will never be empty or null.


import java.util.Arrays;

public class ToSqureOrNotToSquare {

    static int[] arr = {4,3,9,7,2,1};
    public static void main(String[] args) {
        System.out.println(Arrays.toString(squareOrSquareRoot(arr)));
    }

    public static int[] squareOrSquareRoot(int[] array)
    {

      for(int i = 0; i < array.length; i++){

          if(Math.sqrt(array[i]) % 1 == 0){
              array[i] = (int) Math.sqrt(array[i]);
          } else {
              array[i] = array[i] * array[i];
          }
      }
        return array;
    }
}
