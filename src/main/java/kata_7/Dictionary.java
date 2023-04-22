package kata_7;
//
//In this kata, your job is to create a class Dictionary which you can add words to and their entries. Example:
//
//        >>> Dictionary d = new Dictionary();
//
//        >>> d.newEntry("Apple", "A fruit that grows on trees");
//
//        >>> System.out.println(d.look("Apple"));
//        A fruit that grows on trees
//
//        >>> System.out.println(d.look("Banana"));
//        Cant find entry for Banana
//
//        import org.junit.Test;
//        import static org.junit.Assert.assertEquals;
//        import org.junit.runners.JUnit4;
//
//public class SampleTests {
//    @Test
//    public void Tests()
//    {
//        Dictionary d = new Dictionary();
//
//        d.newEntry("Apple", "A fruit");
//        assertEquals("A fruit", d.look("Apple"));
//
//        d.newEntry("Soccer", "A sport");
//        assertEquals("A sport", d.look("Soccer"));
//
//        assertEquals("Cant find entry for Hi", d.look("Hi"));
//        assertEquals("Cant find entry for Ball", d.look("Ball"));
//
//        d.newEntry("soccer", "a sport");
//        assertEquals("a sport", d.look("soccer"));
//    }
//}

import java.util.HashMap;
import java.util.Map;

public class Dictionary {

   Map<String, String> entries = new HashMap<>();

    public static void main(String[] args) {
        Dictionary d = new Dictionary();
        d.newEntry("Apple", "A fruit");

        System.out.println(d.look("Hi"));
    }

    public Dictionary(){
        // your code
        entries = new HashMap<String, String>();
    }

    public  void newEntry(String key, String value){
        // your code
        entries.put(key, value);

    }

    public  String look(String key){
        // your code

        String value = entries.get(key);

        if(value == null) {
            return "Can't find entry for " + key;
        }else {
            return value;
        }


    }
}

