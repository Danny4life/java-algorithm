package kata_8;

//In this simple exercise, you will create a program that will take two lists of integers,
//        a and b. Each list will consist of 3 positive integers above 0, representing the
//        dimensions of cuboids a and b. You must find the difference of the cuboids'
//        volumes regardless of which is bigger.
//
//        For example, if the parameters passed are ([2, 2, 3], [5, 4, 1]), the volume
//        of a is 12 and the volume of b is 20. Therefore, the function should return 8.
//
//        Your function will be tested with pre-made examples as well as random ones.
//
//        If you can, try writing it in one line of code.

public class VolumesOfCuboid {

    public static void main(String[] args) {
        System.out.println(findDifference(new int[]{3,2,5}, new int[]{1,4,4}));
    }

    public static int findDifference(final int[] firstCuboid, final int[] secondCuboid) {
        //your code here !!
        int res1 = 1;
        int res2 = 1;


        for(int i = 0; i < firstCuboid.length; i++){
            res1 *= firstCuboid[i];
        }

        for (int j = 0; j < secondCuboid.length; j++){
            res2 *= secondCuboid[j];
        }
        return Math.abs(res1 - res2);// Math.abs() convert negative value to positive
    }
}
