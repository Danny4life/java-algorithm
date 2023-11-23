package tutorial;

import java.util.*;

public class ArrayListEx1 {

    public static void main(String[] args) {

      HashMap<Integer, String> map = new HashMap<>();
      map.put(1, "mango");
      map.put(2, "orange");
      map.put(3, "banana");
      map.put(4, "carrot");

      for(Map.Entry m : map.entrySet()){
          System.out.println(m.getValue());
      }

    }
}
