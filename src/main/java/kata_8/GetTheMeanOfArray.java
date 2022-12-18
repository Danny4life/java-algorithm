package kata_8;

//It's the academic year's end, fateful moment of your school report. The averages must be calculated.
//        All the students come to you and entreat you to calculate their average for them.
//        Easy ! You just need to write a script.
//
//        Return the average of the given array rounded down to its nearest integer.
//
//        The array will never be empty.


// to calculate the average of an array
// round it down to its nearest integer
// array is never empty

//steps
//-- sum all the integers in the array
// -- divide the total sum by the length of the array
//-- round it down to its nearest integer

public class GetTheMeanOfArray {

    public static void main(String[] args) {
        System.out.println(getAverage(new int[]{2,2,2,2})); // return 2
    }

    public static int getAverage(int[] marks){


       int sum = 0;
       int res = 0;

       for(int i = 0; i < marks.length; i++){
           sum += marks[i];
           res = sum / marks.length;
       }

        return (int) Math.round(res);
    }
}
