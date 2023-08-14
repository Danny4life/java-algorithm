package kata_8;


//Input: Array of elements
//
//        ["h","o","l","a"]
//
//        Output: String with comma delimited elements of the array in th same order.
//
//        "h,o,l,a"
//
//        Note: if this seems too simple for you try the next level


//public class ArrayPrinterTest {
//    @Test
//    @DisplayName("Example test")
//    void testInteger() {
//        Integer[] array = new Integer[] { 2, 4, 5, 2 };
//        assertEquals("2,4,5,2", ArrayPrinter.printArray(array), "Testing with: [2, 4, 5, 2]");
//    }
//}

import java.util.Arrays;

public class ArrayPrinter {

    public static void main(String[] args) {
        System.out.println(printArray(new Object[]{"h","o","l","a"}));
    }

    public static String printArray(Object[] array) {

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < array.length; i++){
            sb.append(array[i]);
            if(i < array.length - 1){
                sb.append(",");
            }
        }

        return sb.toString();
    }
}
