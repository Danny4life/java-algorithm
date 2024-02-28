package decagon_algo_repo.decagon_past_weekly_algo.week_6;

public class GetNthFromLast {

    public static class Node {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }

    public static int getNthFromLast(Node head, int n) {
        // Your code here

        if(head == null || n <= 0){
            return -1;
        }

        Node first = head;
        Node second = head;

        // Move second pointer to the Nth node from the beginning
        for(int i = 0; i < n; i++){

            // if n is greater than the length of the linked list, return -1
            if(second == null)
                return -1;
            second = second.next;



        }

        // Move both pointers simultaneously until second reaches the end

        while(second != null){
            first = first.next;
            second = second.next;
        }

        // At this point, first points to the Nth node from the end
        return first.data;

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
       // printLinkedList(head);
        System.out.println(getNthFromLast(head, 2));



    }
}
