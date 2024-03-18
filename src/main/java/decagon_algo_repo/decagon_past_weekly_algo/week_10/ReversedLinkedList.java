package decagon_algo_repo.decagon_past_weekly_algo.week_10;

//Write a function that takes in the head of a Singly Linked List,
//        reverses the list in place (i.e., doesn't create a brand new list), and returns its new head.
//
//        Each LinkedList node has an integer value as well as a next node
//        pointing to the next node in the list or to None / null if it's the tail of the list.
//
//        You can assume that the input Linked List will always have at least one node; in other words,
//        the head will never be None / null.
//
//        Sample Input
//        head = 0 -> 1 -> 2 -> 3 -> 4 -> 5 // the head node with value 0
//        Sample Output
//        5 -> 4 -> 3 -> 2 -> 1 -> 0 // the new head node with value 5
//
//import org.junit.Test;
//import static org.junit.Assert.*;
//import org.junit.jupiter.api.BeforeEach;
//import java.util.*;
//
//public class ProgramTest {
//    @Test
//    public void TestCase1() {
//        Program.LinkedList test = newLinkedList(new int[] {0, 1, 2, 3, 4, 5});
//        List<Integer> result = toArrayList(Program.reverseLinkedList(test));
//        int[] expected = new int[] {5, 4, 3, 2, 1, 0};
//
//        assertTrue(arraysEqual(result, expected));
//    }
//
//    @Test
//    public void TestCase2() {
//        Program.LinkedList test = newLinkedList(new int[] {0});
//        List<Integer> result = toArrayList(Program.reverseLinkedList(test));
//        int[] expected = new int[] {0};
//
//        assertTrue(arraysEqual(result, expected));
//    }
//
//    @Test
//    public void TestCase3() {
//        Program.LinkedList test = newLinkedList(new int[] {0, 1});
//        List<Integer> result = toArrayList(Program.reverseLinkedList(test));
//        int[] expected = new int[] {1, 0};
//
//        assertTrue(arraysEqual(result, expected));
//    }
//
//    @Test
//    public void TestCase4() {
//        Program.LinkedList test = newLinkedList(new int[] {0, 1, 2});
//        List<Integer> result = toArrayList(Program.reverseLinkedList(test));
//        int[] expected = new int[] {2, 1, 0};
//
//        assertTrue(arraysEqual(result, expected));
//    }
//
//    @Test
//    public void TestCase5() {
//        Program.LinkedList test = newLinkedList(new int[] {0, 1, 2, 3});
//        List<Integer> result = toArrayList(Program.reverseLinkedList(test));
//        int[] expected = new int[] {3, 2, 1, 0};
//
//        assertTrue(arraysEqual(result, expected));
//    }
//
//    @Test
//    public void TestCase6() {
//        Program.LinkedList test = newLinkedList(new int[] {0, 1, 2, 3, 4, 5, 6});
//        List<Integer> result = toArrayList(Program.reverseLinkedList(test));
//        int[] expected = new int[] {6, 5, 4, 3, 2, 1, 0};
//
//        assertTrue(arraysEqual(result, expected));
//    }
//
//    @Test
//    public void TestCase7() {
//        Program.LinkedList test = newLinkedList(new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12});
//        List<Integer> result = toArrayList(Program.reverseLinkedList(test));
//        int[] expected = new int[] {12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
//
//        assertTrue(arraysEqual(result, expected));
//    }
//
//
//    public Program.LinkedList newLinkedList(int[] values) {
//        Program.LinkedList ll = new Program.LinkedList(values[0]);
//        Program.LinkedList current = ll;
//        for (int i = 1; i < values.length; i++) {
//            current.next = new Program.LinkedList(values[i]);
//            current = current.next;
//        }
//        return ll;
//    }
//
//    public List<Integer> toArrayList(Program.LinkedList ll) {
//        List<Integer> arr = new ArrayList<Integer>();
//        Program.LinkedList current = ll;
//        while (current != null) {
//            arr.add(current.value);
//            current = current.next;
//        }
//        return arr;
//    }
//
//    public boolean arraysEqual(List<Integer> arr1, int[] arr2) {
//        if (arr1.size() != arr2.length) return false;
//        for (int i = 0; i < arr1.size(); i++) {
//            if (arr1.get(i) != arr2[i]) return false;
//        }
//        return true;
//    }
//}

public class ReversedLinkedList {
    public static void main(String[] args) {

    }

    public static LinkedList reverseLinkedList(LinkedList head) {
        // Write your code here.
        return null;
    }

    static class LinkedList {
        int value;
        LinkedList next = null;

        public LinkedList(int value) {
            this.value = value;
        }
    }
}
