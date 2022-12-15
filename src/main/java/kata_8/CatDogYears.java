package kata_8;

//Kata Task
//        I have a cat and a dog.
//
//        I got them at the same time as kitten/puppy. That was humanYears years ago.
//
//        Return their respective ages now as [humanYears,catYears,dogYears]
//
//        NOTES:
//
//        humanYears >= 1
//        humanYears are whole numbers only
//        Cat Years
//        15 cat years for first year
//        +9 cat years for second year
//        +4 cat years for each year after that
//        Dog Years
//        15 dog years for first year
//        +9 dog years for second year
//        +5 dog years for each year after that


import java.util.Arrays;

public class CatDogYears {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(humanYearsCatYearsDogYears(10)));
    }

    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        // Your code here!

        int[] res = new int[3];

        int catYears = 0;
        int dogYears = 0;


       if(humanYears >= 1){
           catYears += 15;
           dogYears += 15;
       }
       if (humanYears >= 2) {
           catYears += 9;
           dogYears += 9;
       }
       if(humanYears > 2){
           catYears += 4 * (humanYears - 2);
           dogYears += 5 * (humanYears - 2);
       }


        return new int[]{humanYears,catYears, dogYears};
    }

}
