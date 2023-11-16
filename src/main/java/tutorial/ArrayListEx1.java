package tutorial;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Stack;

public class ArrayListEx1 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");

        for(String l : list){
            System.out.println(l);
        }

        LinkedList<String> list1 = new LinkedList<>();
        list1.add("five");
        list1.add("six");
        list1.add("seven");
        list1.add("eight");

        for(String ls : list1){
            System.out.println(ls);
        }

        Stack<String> stack = new Stack<>();
        stack.push("nine");
        stack.push("ten");
        stack.push("eleven");
        stack.push("twelve");
        stack.pop();
        stack.pop();

        for(String st : stack){
            System.out.println(st);
        }

        HashSet<String> set = new HashSet<>();
        set.add("john");
        set.add("jane");
        set.add("jane");
        set.add("jo");

        for(String st : set){
            System.out.println(st);
        }
    }
}
