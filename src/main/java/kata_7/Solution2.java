package kata_7;

//Implement the method indexOf (index_of in PHP), which accepts a linked list (head) and a value,
//        and returns the index (zero based) of the first occurrence of that value if exists, or -1 otherwise.
//
//        For example: Given the list: 1 -> 2 -> 3 -> 3, and the value 3, indexOf / index_of should return 2.
//
//        The linked list is defined as follows:
//
//class Node {
//    public Object data;
//    public Node next;
//
//    Node(T data, Node next) {
//        this.data = data;
//        this.next = next;
//    }
//
//    Node(T data) {
//        this(data, null);
//    }
//}
//Note: the list may be null and can hold any type of value.


//import org.junit.Test;
//import static org.junit.Assert.assertEquals;
//
//public class SolutionTest {
//
//    @Test
//    public void basicTests() {
//        assertEquals(-1, Solution.indexOf(null, 17));
//        assertEquals(1, Solution.indexOf(Helpers.listFromArray(1, 2, 3), 2));
//        assertEquals(0, Solution.indexOf(Helpers.listFromArray("aaa", "b", "abc"), "aaa"));
//        assertEquals(0, Solution.indexOf(Helpers.listFromArray(17, "17", 1.2), 17));
//        assertEquals(1, Solution.indexOf(Helpers.listFromArray(17, "17", 1.2), "17"));
//        assertEquals(2, Solution.indexOf(Helpers.listFromArray(1, 2, 3, 3), 3));
//    }


//STEPS
//given a list of numbers and a value
// return the index of the number based on the occurrence of the value
// loop through the list
// check if the index of the list correspond with the given value
//if yes return it or return -1

//import org.w3c.dom.Node;
//
//public class Solution2 {
//
//    public static void main(String[] args) {
//        System.out.println(indexOf(1));
//    }
//
//
//
//    static int indexOf(Node head, Object value) {
//        for (int i = 0; head != null; head = head.next, i++) {
//            if (head.data.equals(value)) return i;
//        }
//        return -1;
//    }
//
//
//}
