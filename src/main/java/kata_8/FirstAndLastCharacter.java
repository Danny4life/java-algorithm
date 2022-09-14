package kata_8;

//It's pretty straightforward. Your goal is to create a function that removes the
//        first and last characters of a string.
//        You're given one parameter, the original string.
//        You don't have to worry with strings with less than two characters.

public class FirstAndLastCharacter {

    public static void main(String[] args) {
        System.out.println(remove("eloquent"));
    }

    public static String remove(String str) {

        // your code here
        str = str.substring(1, str.length()-1);

        return str;

    }
}
