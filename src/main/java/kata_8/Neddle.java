package kata_8;


//Can you find the needle in the haystack?
//
//        Write a function findNeedle() that takes an array full of junk but containing one "needle"
//
//        After your function finds the needle it should return a message (as a string) that says:
//
//        "found the needle at position " plus the index it found the needle, so:
//
//        Example(Input --> Output)
//
//        ["hay", "junk", "hay", "hay", "moreJunk", "needle", "randomJunk"] --> "found the needle at position 5"
//        Note: In COBOL, it should return "found the needle at position 6"

//
//import org.junit.Test;
//import static org.junit.Assert.assertEquals;
//
//public class NeedleExampleTests {
//    @Test
//    public void tests() {
//        Object[] haystack1 = {"3", "123124234", null, "needle", "world", "hay", 2, "3", true, false};
//        Object[] haystack2 = {"283497238987234", "a dog", "a cat", "some random junk", "a piece of hay", "needle", "something somebody lost a while ago"};
//        Object[] haystack3 = {1,2,3,4,5,6,7,8,8,7,5,4,3,4,5,6,67,5,5,3,3,4,2,34,234,23,4,234,324,324,"needle",1,2,3,4,5,5,6,5,4,32,3,45,54};
//        assertEquals("found the needle at position 3", Kata.findNeedle(haystack1));
//        assertEquals("found the needle at position 5", Kata.findNeedle(haystack2));
//        assertEquals("found the needle at position 30", Kata.findNeedle(haystack3));
//    }
//}

// STEPS

//1. loop through the array
// 2. check if neddle is found
// 3. if found, return found the neddle at position index
// 4 find the index of needle in the array

// https://www.codewars.com/kata/56676e8fabd2d1ff3000000c/train/java


public class Neddle {

    public static void main(String[] args) {
        System.out.println(findNeedle(new Object[]{"hay", "junk", "hay", "hay", "moreJunk", "needle", "randomJunk"}));
    }


    public static String findNeedle(Object[] haystack) {
        // Your code here

        for(int i = 0; i < haystack.length; i++){
            if(haystack[i] == "needle"){
                return "found the needle at position " + i;
            }
        }

        return "";
    }
}
