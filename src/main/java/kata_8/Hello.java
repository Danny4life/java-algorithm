package kata_8;
//Create a method sayHello/say_hello/SayHello that takes as input a name,
//        city, and state to welcome a person. Note that name will be an
//        array consisting of one or more values that should be joined together
//        with one space between each, and the length of the name array in test cases will vary.
//
//        Example:
//
//        sayHello(new String[]{"John", "Smith"}, "Phoenix", "Arizona")
//        This example will return the string Hello, John Smith! Welcome to Phoenix, Arizona!


//public class HelloTest {
//
//    @Test
//    public void test1() throws Exception {
//        Hello h = new Hello();
//        String[] name = {"John", "Smith"};
//        assertEquals("Hello, John Smith! Welcome to Phoenix, Arizona!",
//                h.sayHello(name, "Phoenix", "Arizona"));
//    }

//STEPS
//return name

import java.util.Arrays;

public class Hello {

    public static void main(String[] args) {
        System.out.println(sayHello(new String[]{"John", "Smith", "Rose"}, "Phoenix", "Arizona"));
    }

    public static String sayHello(String [] name, String city, String state){
        //code here

        return "Hello, " + String.join(" ", name) + "! Welcome to " + city + ", " + state + "!";


    }
}
