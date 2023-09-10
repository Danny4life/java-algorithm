package kata_8;

//This is an easy twist to the example kata (provided by Codewars when learning how to create your own kata).
//
//        Add the value "codewars" to the array websites 1,000 times.


//import org.junit.Test;
//import static org.junit.Assert.assertEquals;
//
//public class KataExampleTwistTest {
//    @Test
//    public void test(){
//        String[] websites = KataExampleTwist.kataExampleTwist();
//        assertEquals("The array is still empty", true, websites.length > 0);
//        assertEquals("The array does not equal 1,000", true, websites.length == 1000);
//        boolean allCodewars = true;
//        for (int i = 0; i < websites.length; i++) if (!"codewars".equals(websites[i])) allCodewars = false;
//        assertEquals("Every element in the array must contain the value \"codewars\"", true, allCodewars);
//    }
//}

//https://www.codewars.com/kata/525c1a07bb6dda6944000031/train/java

import java.util.Arrays;

public class ExampleTwist {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(kataExampleTwist()));

    }

    public static String[] kataExampleTwist()
    {
        String[] websites = new String[1000];

        String valueToAdd = "codewars";

        for(int i = 0; i < 1000; i++){
            websites[i] = valueToAdd;
        }
        return websites;
    }
}
