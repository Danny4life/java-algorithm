package kata_7;
//
//Normally we have firstname, middle and the last name but there may be more than one word in a name like a South Indian one.
//
//        Similar to those kinda names we need to initialize the names.
//
//        See the pattern below:
//
//        initials('code wars') => returns C.Wars
//        initials('Barack Hussain obama') => returns B.H.Obama
//        Complete the function initials.
//
//        Names are separated by exactly one space in the input, without leading or trailing spaces.
//        Names will always be lowercase, except optionally their first letter

//
//import java.lang.*;
//import org.junit.*;
//import static org.junit.Assert.assertEquals;
//
//public class ExampleTestCases {
//
//    @Test
//    public void testExamples() {
//        assertEquals("C.Wars", CWars.initials("code wars"));
//        assertEquals("B.H.Obama", CWars.initials("Barack hussain obama"));
//        assertEquals("B.H.Obama", CWars.initials("barrack hussain Obama"));
//    }
//
//}

//Pseudocode
// 1. get the first character of the string and make it uppercase
// 2. check for space then get the second character and make it uppercase
// 3. check for space and make the third character uppercase


import java.util.Arrays;

public class CWars {
    public static void main(String[] args) {
        System.out.println(initials("Barack hussain obama"));
    }

    public static String initials(String name){

        String[] words = name.trim().split("\\s+");
        StringBuilder initials = new StringBuilder();

        for(int i = 0; i < words.length - 1; i++){
            String word = words[i];
            initials.append(Character.toUpperCase(word.charAt(0)));
            initials.append(".");
        }

        String lastword = words[words.length - 1];
        initials.append(Character.toUpperCase(lastword.charAt(0)));
        initials.append(lastword.substring(1));


            return initials.toString();
    }
}
