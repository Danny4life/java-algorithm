package decagon_algo_repo.decagon_past_weekly_algo.week_6;
//
//Write a function that takes in the head of a Singly Linked List and an integer k and removes the kth node from the end of the list.
//
//        The removal should be done in place, meaning that the original data structure should be mutated (no new structure should be created).
//
//        Furthermore, the input head of the linked list should remain the head of the linked list after the removal is done, even if the head is the node that's supposed to be removed.
//
//        In other words, if the head is the node that's supposed to be removed, your function should simply mutate its value and next pointer.
//
//        Note that your function doesn't need to return anything.
//
//        You can assume that the input Linked List will always have at least two nodes and, more specifically, at least k nodes.
//
//        Each LinkedList node has an integer value as well as a next node pointing to the next node in the list or to None / null if it's the tail of the list.
//
//        Sample Input
//
//        head = 0 -> 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> 9 // the head node with value 0
//        k = 4
//        Sample Output
//// No output required.
//// The 4th node from the end of the list (the node with value 6) is removed.
//        0 -> 1 -> 2 -> 3 -> 4 -> 5 -> 7 -> 8 -> 9
//        Interface Help
//        Run against Sample Tests: Click Run Tests above or press ⌘ + '
//        Running against Final Tests: Click Submit Solution above or press ⌘ + Enter
//        Difficulty Estimates
//        Basic Difficulty, 1 Hour Estimated Time
//
//
//import org.junit.Test;
//import static org.junit.Assert.*;
//import java.util.*;
//
//public class ProgramTest {
//    @Test
//    public void TestCase1() {
//        TestLinkedList test = new TestLinkedList(0);
//        test.addMany(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9});
//        int[] expected = {0, 1, 2, 3, 4, 5, 7, 8, 9};
//        Program.removeKthNodeFromEnd(test, 4);
//        assertTrue(compare(test.getNodesInArray(), expected));
//    }
//
//    public boolean compare(List<Integer> arr1, int[] arr2) {
//        if (arr1.size() != arr2.length) {
//            return false;
//        }
//        for (int i = 0; i < arr1.size(); i++) {
//            if (arr1.get(i) != arr2[i]) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    class TestLinkedList extends Program.LinkedList {
//
//        public TestLinkedList(int value) {
//            super(value);
//        }
//
//        public void addMany(int[] values) {
//            Program.LinkedList current = this;
//            while (current.next != null) {
//                current = current.next;
//            }
//            for (int value : values) {
//                current.next = new Program.LinkedList(value);
//                current = current.next;
//            }
//        }
//
//        public List<Integer> getNodesInArray() {
//            List<Integer> nodes = new ArrayList<Integer>();
//            Program.LinkedList current = this;
//            while (current != null) {
//                nodes.add(current.value);
//                current = current.next;
//            }
//            return nodes;
//        }
//    }
//}


public class RemoveKthElementFromNode {

    public static class LinkedList{
        int value;
        LinkedList next = null;

        public LinkedList(int value) {
            this.value = value;
        }
    }

    public static void removeKthNodeFromEnd(LinkedList head, int k){

        //Initialize two pointers first and second to the head of the linked list.
        LinkedList first = head;
        LinkedList second = head;

        // Move second pointer k steps forward
        for(int i = 0; i < k; i++){
            second = second.next;
        }

        // If second reaches the end of the list, remove the head node
        if(second == null){
            head.value = head.next.value;
            head.next = head.next.next;
            return;
        }

        // Move both pointers until second reaches the end
        while (second.next != null){
            first = first.next;
            second = second.next;
        }

        // Remove the kth node (element)
        first.next = first.next.next;

    }

    public static void printLinkedList(LinkedList head) {
        LinkedList current = head;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Sample input
        LinkedList head = new LinkedList(0);
        head.next = new LinkedList(1);
        head.next.next = new LinkedList(2);
        head.next.next.next = new LinkedList(3);
        head.next.next.next.next = new LinkedList(4);
        head.next.next.next.next.next = new LinkedList(5);
        head.next.next.next.next.next.next = new LinkedList(6);
        head.next.next.next.next.next.next.next = new LinkedList(7);
        head.next.next.next.next.next.next.next.next = new LinkedList(8);
        head.next.next.next.next.next.next.next.next.next = new LinkedList(9);

        int k = 4;

        System.out.println("Before removal:");
        printLinkedList(head);

        removeKthNodeFromEnd(head, k);

        System.out.println("After removal:");
        printLinkedList(head);
    }

}
