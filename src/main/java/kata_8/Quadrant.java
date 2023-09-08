package kata_8;

//Task
//        Given a point in a Euclidean plane (x and y), return the quadrant the point exists in: 1, 2, 3 or 4 (integer).
//        x and y are non-zero integers, therefore the given point never lies on the axes.
//
//        Examples
//        (1, 2)     => 1
//        (3, 5)     => 1
//        (-10, 100) => 2
//        (-1, -9)   => 3
//        (19, -56)  => 4
//        Reference
//        QuadrantsQuadrants
//        There are four quadrants:
//
//        First quadrant, the quadrant in the top-right, contains all points with positive X and Y
//        Second quadrant, the quadrant in the top-left, contains all points with negative X, but positive Y
//        Third quadrant, the quadrant in the bottom-left, contains all points with negative X and Y
//        Fourth quadrant, the quadrant in the bottom-right, contains all points with positive X, but negative Y
//        More on quadrants: Quadrant (plane geometry) - Wikipedia
//
//        Task Series
//        Quadrants (this kata)
//        Quadrants 2: Segments

//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.CsvSource;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//// TODO: Replace examples and use TDD by writing your own tests
//
//class SolutionTest {
//    @ParameterizedTest(name = "Quadrant {0}: ({1}, {2})")
//    @CsvSource(textBlock = """
//        1,       1,   2
//        1,       3,   5
//        2,     -10, 100
//        3,      -1,  -9
//        4,      19, -56
//    """)
//    @DisplayName("Sample tests") void sampleTests(int expected, int x, int y) {
//        assertEquals(expected, Kata.quadrant(x, y));
//    }
//}


// https://www.codewars.com/kata/643af0fa9fa6c406b47c5399/train/java

public class Quadrant {

    public static void main(String[] args) {
        System.out.println(quadrant(1,2));
    }

    public static int quadrant(int x, int y) {
       if((x > 0) && (y > 0)){
            return 1;
       } else if ((x < 0) && (y > 0)) {
           return 2;
       } else if ((x < 0) && (y < 0)) {
           return 3;
       }
       return 4;
    }
}
