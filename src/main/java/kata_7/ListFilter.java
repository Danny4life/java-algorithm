package kata_7;

//In this kata you will create a function that takes a list of non-negative integers
//        and strings and returns a new list with the strings filtered out.
//
//        Example
//        Kata.filterList(List.of(1, 2, "a", "b")) => List.of(1,2)
//        Kata.filterList(List.of(1, 2, "a", "b", 0, 15)) => List.of(1,2,0,15)
//        Kata.filterList(List.of(1, 2, "a", "b", "aasf", "1", "123", 231)) => List.of(1, 2, 231)



//public class ExampleTests {
//
//    @Test
//    public void examples() {
//        assertEquals(List.of(1, 2), Kata.filterList(List.of(1, 2, "a", "b")), "For input: [1, 2, \"a\", \"b\"]");
//        assertEquals(List.of(1, 0, 15), Kata.filterList(List.of(1, "a", "b", 0, 15)), "For input: [1, \"a\", \"b\", 0, 15]");
//        assertEquals(List.of(1, 2, 123), Kata.filterList(List.of(1, 2, "aasf", "1", "123", 123)), "For input: [1, 2, \"aasf\", \"1\", \"123\", 123]");
//    }
//}


// steps
// 1. loop through the list
// 2. check if any of the item present is not a string
// 3. if yes, add it out and return the list



import java.util.ArrayList;
import java.util.List;

public class ListFilter {

    public static void main(String[] args) {
        System.out.println(filterList(List.of(1, 2, "a", "b", 0, 15)));
    }

    public static List<Object> filterList(final List<Object> list) {
        // Return the List with the Strings filtered out

        List<Object> filteredList = new ArrayList<>();

        for(Object l : list){
            if(!(l instanceof String)){
                filteredList.add(l);
            }
        }
        return filteredList;
    }
}
