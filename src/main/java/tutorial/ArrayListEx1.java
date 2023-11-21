package tutorial;

import java.util.*;

public class ArrayListEx1 {

    public static void main(String[] args) {

        List<String> fruitList = new ArrayList<>();
        fruitList.add("mango");
        fruitList.add("banana");
        fruitList.add("rice");
        fruitList.add("pawpaw");

        String [] array = fruitList.toArray(new String[fruitList.size()]);

        System.out.println("List: " + fruitList);
        System.out.println("array: " + Arrays.toString(array));


    }
}
