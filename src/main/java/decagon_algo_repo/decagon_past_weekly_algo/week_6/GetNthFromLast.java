package decagon_algo_repo.decagon_past_weekly_algo.week_6;

public class GetNthFromLast {

    public static class Node {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }

    public static int getNthFromLast(Node head, int n) {
        // Your code here

        return 0;

        }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(8);
        head.next.next.next.next.next.next.next.next = new Node(9);

        System.out.println("After removal:");
        System.out.println(getNthFromLast(head, 2));



    }
}
