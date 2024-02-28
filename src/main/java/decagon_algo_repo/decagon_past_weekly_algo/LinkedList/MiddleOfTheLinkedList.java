//package decagon_algo_repo.decagon_past_weekly_algo.LinkedList;
////
////Given the head of a singly linked list, return the middle node of the linked list.
////
////        If there are two middle nodes, return the second middle node.
////
////
////
////        Example 1:
////
////
////        Input: head = [1,2,3,4,5]
////        Output: [3,4,5]
////        Explanation: The middle node of the list is node 3.
////        Example 2:
////
////
////        Input: head = [1,2,3,4,5,6]
////        Output: [4,5,6]
////        Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.
////
////
////        Constraints:
////
////        The number of nodes in the list is in the range [1, 100].
////        1 <= Node.val <= 100
//
//
//
//
//
//
//public class MiddleOfTheLinkedList {
//    public static void main(String[] args) {
//
//    }
//
//    public static <ListNode> ListNode middleNode(ListNode head) {
//        int count = 0;
//        ListNode current = head;
//
//        // First iteration to count the number of nodes
//        while (current != null) {
//            count++;
//            current = current.next;
//        }
//
//        // Reset current pointer for the second iteration
//        current = head;
//
//        // Second iteration to find the second middle node
//        for (int i = 0; i < count / 2; i++) {
//            current = current.next;
//        }
//
//        return current;
//
//
//    }
//}
//
//// Link : https://leetcode.com/problems/middle-of-the-linked-list/description/
