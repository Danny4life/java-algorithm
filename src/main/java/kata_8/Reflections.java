package kata_8;


//"Point reflection" or "point symmetry" is a basic concept in geometry where a given point, P,
//        at a given position relative to a mid-point, Q has a corresponding point, P1, which is
//        the same distance from Q but in the opposite direction.
//
//        Task
//        Given two points P and Q, output the symmetric point of point P about Q. Each argument
//        is a two-element array of integers representing the point's X and Y coordinates.
//        Output should be in the same format, giving the X and Y coordinates of point P1.
//        You do not have to validate the input.
//
//        This kata was inspired by the Hackerrank challenge Find Point

//class ReflectedPoints {
//    @Test
//    void BasicTest() {
//
//        assertArrayEquals(new int[]{2,2}, reflectPoint(new int[]{0,0}, new int[]{1,1}));
//        assertArrayEquals(new int[]{-6,-18}, reflectPoint(new int[]{2,6}, new int[]{-2,-6}));
//
//        assertArrayEquals(new int[]{-30, 30}, reflectPoint(new int[]{10, -10}, new int[]{-10, 10}));
//        assertArrayEquals(new int[]{-25, 37}, reflectPoint(new int[]{1, -35}, new int[]{-12, 1}));
//        assertArrayEquals(new int[]{-1014, -443}, reflectPoint(new int[]{1000, 15}, new int[]{-7, -214}));
//        assertArrayEquals(new int[]{0,0}, reflectPoint(new int[]{0,0}, new int[]{0,0}));
//    }
//}

//STEPS
// create an empty array with size 2
// loop through q
// multiply numbers in q by 2;


import java.util.Arrays;

public class Reflections {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(reflectPoint(new int[]{2, 6}, new int[]{-2, -6})));
    }

    public static int[] reflectPoint(int[] p, int[] q) {
        //Write Code


       int[] points = new int[2];

       points[0] = q[0] * 2 -p[0];
       points[1] = q[1] * 2 -p[1];

        return points;
    }

}
