package tutorial;

import java.util.*;

public class ArrayListEx1 {

    public static void main(String[] args) {

       PriorityQueue<String> queue = new PriorityQueue<String>();

       queue.add("one");
       queue.add("two");
       queue.add("three");
       queue.add("four");
        queue.add("five");



        System.out.println("Head: " + queue.element());
        System.out.println("Peek: " + queue.peek());

        for(String q : queue){
            System.out.println(q);
        }

    }
}
