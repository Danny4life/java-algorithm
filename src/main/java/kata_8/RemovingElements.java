package kata_8;

//Take an array and remove every second element from the array.
//        Always keep the first element and start removing with the next element.
//
//        Example:
//        ["Keep", "Remove", "Keep", "Remove", "Keep", ...] --> ["Keep", "Keep", "Keep", ...]
//
//        None of the arrays will be empty, so you don't have to worry about that!


//class KataTest {
//    @Test
//    void basicTest() {
//        assertArrayEquals(new Object[] { "Hello", "Hello Again" },Kata.removeEveryOther(new Object[] { "Hello", "Goodbye", "Hello Again" }));
//        assertArrayEquals(new Object[] { new Object[] { 1, 2 } },Kata.removeEveryOther(new Object[] { new Object[] { 1, 2 } }));
//        assertArrayEquals(new Object[] { 1, 3, 5, 7, 9 },Kata.removeEveryOther(new Object[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }));
//        assertArrayEquals(new Object[] { "Goodbye" }, Kata.removeEveryOther(new Object[] { "Goodbye" }));
//        assertArrayEquals(new Object[] {}, Kata.removeEveryOther(new Object[] {}));
//    }
//}



//steps
// 1. first convert the array to an arraylist bcos array has fixed size
// 2. loop through the array
// 3. check if the current array index is == to 0
// 4.if yes, add it to the empty array
// 5. return arrayList to array using toArray() method


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemovingElements {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(removeEveryOther(new Object[]{"Goodbye" })));
    }

    public static Object[] removeEveryOther(Object[] arr) {
        // happy coding

        List<Object> res = new ArrayList<>(); // convert the array to an array list

       for(int i = 0; i < arr.length; i++){
            if(i % 2 == 0){
                res.add(arr[i]);
            }
       }
        return res.toArray();
    }
}
