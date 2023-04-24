package kata_7;

//Task
//        You need to create a function, helloWorld, that will return the String Hello,
//        World! without actually using raw strings. This includes quotes,
//        double quotes and template strings. You can, however, use the String constructor and any related functions.
//
//        You cannot use the following:
//
//        "Hello, World!"
//        'Hello, World!'
//        `Hello, World!`
//        Good luck and try to be as creative as possible!
//
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//class SolutionTest {
//    // these tests do not test for if raw strings are used - take that in mind
//    @Test
//    void testBasic() {
//        assertEquals("Hello, World!", HelloWorld.helloWorld());
//    }
//}
//

public class HelloString {

    public static void main(String[] args) {
        System.out.println(helloWorld());
    }

    public static String helloWorld() {
        // Your code

        char[] hello = {72, 101, 108, 108, 111, 44, 32};
        char[] world = { 87, 111, 114, 108, 100, 33 };

        String str = new String(hello) + new String(world);
        return str;
    }
}
