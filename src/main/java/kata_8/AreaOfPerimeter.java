package kata_8;

//You are given the length and width of a 4-sided polygon. The polygon can either be a rectangle or a square.
//        If it is a square, return its area. If it is a rectangle, return its perimeter.
//
//        Example(Input1, Input2 --> Output):
//
//        6, 10 --> 32
//        3, 3 --> 9
//        Note: for the purposes of this kata you will assume that it is a square
//        if its length and width are equal, otherwise it is a rectangle.


//public class SolutionTest {
//    @Test
//    public void testSomething() {
//        assertEquals(16, Solution.areaOrPerimeter(4 , 4));
//        assertEquals(32, Solution.areaOrPerimeter(6 , 10));
//    }
//}

//Steps
//given a 4 sided polygon, if its a square return its area, if its a rectangle return its perimeter
// if length and width are equal its a square, if not its a rectangle
// find how to get area of a sqaure = l * w
// find how to get perimeter of a rectangle p = 2(l+w);

public class AreaOfPerimeter {
    public static void main(String[] args) {
        System.out.println(areaOrPerimeter(6,10));
    }

    public static int areaOrPerimeter (int l, int w) {
        // code away...
        return (l == w) ? (l * w) : 2 * (l + w);
    }
}
