package tutorial;

import java.util.*;

public class ArrayListEx1 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();


        System.out.println("is array list empty :" + list.isEmpty());

        list.add("one");
        list.add("one");
        list.add("one");

        System.out.println(list);
        System.out.println("after insertion : " + list.isEmpty());
    }
}
