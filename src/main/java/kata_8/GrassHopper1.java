package kata_8;

//Create a function that gives a personalized greeting. This function takes two parameters: name and owner.
//
//        Use conditionals to return the proper message:
//
//        case	return
//        name equals owner	'Hello boss'
//        otherwise	'Hello guest'

//public class KataTest {
//    @Test public void basicTests() {
//        assertEquals("For inputs \"Daniel\" and \"Daniel\"", "Hello boss", Kata.greet("Daniel", "Daniel"));
//        assertEquals("For inputs \"Greg\" and \"Daniel\"", "Hello guest", Kata.greet("Greg", "Daniel"));
//    }
//}

// Steps
//-- check if name equals owner, return Hello boss
//-- if not return Hello guest

public class GrassHopper1 {

    public static void main(String[] args) {
        System.out.println(greet("Greg", "Daniel"));
    }
    static String greet(String name, String owner) {
        // Add code here
        return (name.equals(owner)) ? "Hello boss" : "Hello guest";
    }
}
