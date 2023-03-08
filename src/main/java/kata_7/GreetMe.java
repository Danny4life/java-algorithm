package kata_7;

//Write a method that takes one argument as name and then greets that name,
//        capitalized and ends with an exclamation point.
//
//        Example:
//
//        "riley" --> "Hello Riley!"
//        "JACK"  --> "Hello Jack!"


//import org.junit.Test;
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertNotEquals;
//
//public class GreetMeTests {
//    @Test
//    public void basicTests() {
//        assertEquals("Hello Riley!", GreetMe.greet("riley"));
//    }
//}

//Things to note
//-- name must be greeted with Hello
//-- the first letter of the name must be capitalized
//--the name must end with an exclamation mark !

//STEPS
//--- add Hello to name when called
//--- capitalized only the first letter
//--- add exclamation mark at the end of the name
//--- every other letter after the first latter must be lower case

public class GreetMe {

    public static void main(String[] args) {
        System.out.println(greet("riley"));
    }

    public static String greet(String name){
        String cap = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase() + "!";
        return "Hello " + cap;
    }
}
