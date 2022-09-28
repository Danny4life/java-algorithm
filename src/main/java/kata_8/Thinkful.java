package kata_8;

//You're writing code to control your town's traffic lights. You need a function to handle each change from green,
//        to yellow, to red, and then to green again.
//
//        Complete the function that takes a string as an argument representing the current state of the
//        light and returns a string representing the state the light should change to.
//
//        For example, when the input is green, output should be yellow.
// red to green
// green to yellow
// yellow to red


public class Thinkful {

    public static void main(String[] args) {
        System.out.println(updateLight("yellow"));
    }

    public static String updateLight(String current) {

        if (current == "green"){
            return "yellow";
        } else if (current == "red"){
            return "green";
        }

        return "red";
    }
}
