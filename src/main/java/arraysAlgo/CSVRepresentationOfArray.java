package arraysAlgo;


//Create a function that returns the CSV representation of a two-dimensional numeric array.
//
//        Example:
//
//        input:
//        [[ 0, 1, 2, 3, 4 ],
//        [ 10,11,12,13,14 ],
//        [ 20,21,22,23,24 ],
//        [ 30,31,32,33,34 ]]
//
//        output:
//        '0,1,2,3,4\n'
//        +'10,11,12,13,14\n'
//        +'20,21,22,23,24\n'
//        +'30,31,32,33,34'
//        Array's length > 2.

//class SolutionTest {
//    @Test
//    void testBasics() {
//        assertEquals("0,1,2,3,45\n10,11,12,13,14\n20,21,22,23,24\n30,31,32,33,34",
//                Kata.toCsvText(new int[][] {
//                        { 0, 1, 2, 3, 45 },
//                        { 10,11,12,13,14 },
//                        { 20,21,22,23,24 },
//                        { 30,31,32,33,34 } }));
//        assertEquals("-25,21,2,-33,48\n30,31,-32,33,-34",
//                Kata.toCsvText(new int[][]{
//                        { -25, 21,   2, -33,  48 },
//                        {  30, 31, -32,  33, -34 } }));
//        assertEquals("5,55,5,5,55\n6,6,66,23,24\n666,31,66,33,7",
//                Kata.toCsvText(new int[][]{
//                        {   5, 55,  5,  5, 55 },
//                        {   6,  6, 66, 23, 24 },
//                        { 666, 31, 66, 33,  7 } }));
//    }
//}





import java.util.Arrays;
public class CSVRepresentationOfArray {
    public static void main(String[] args) {
        String result = toCsvText(new int[][] {
                { 0, 1, 2, 3, 45 },
                { 10,11,12,13,14 },
                { 20,21,22,23,24 },
                { 30,31,32,33,34 }
        });

        System.out.println(result);

    }
    public static String toCsvText(int[][] array){

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                sb.append(array[i][j]);

                if(j < array[i].length - 1){
                    sb.append(",");
                }

            }

            if(i < array.length - 1){
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
