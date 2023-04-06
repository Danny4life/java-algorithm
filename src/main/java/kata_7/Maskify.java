package kata_7;
//
//Usually when you buy something, you're asked whether your credit card number,
//        phone number or answer to your most secret question is still correct. However,
//        since someone could look over your shoulder, you don't want that shown on your screen. Instead, we mask it.
//
//        Your task is to write a function maskify, which changes all but the last four characters into '#'.
//
//        Examples
//        Maskify.Maskify("4556364607935616"); // should return "############5616"
//        Maskify.Maskify("64607935616");      // should return "#######5616"
//        Maskify.Maskify("1");                // should return "1"
//        Maskify.Maskify("");                 // should return ""
//
//// "What was the name of your first pet?"
//        Maskify.Maskify("Skippy");                                   // should return "##ippy"
//        Maskify.Maskify("Nananananananananananananananana Batman!"); // should return "####################################man!"


//import org.junit.Test;
//import static org.junit.Assert.assertEquals;
//import org.junit.runners.JUnit4;
//
//public class SolutionTest {
//    @Test
//    public void testSolution() {
//        assertEquals("############5616", Maskify.maskify("4556364607935616"));
//        assertEquals("#######5616",      Maskify.maskify(     "64607935616"));
//        assertEquals("1",                Maskify.maskify(               "1"));
//        assertEquals("",                 Maskify.maskify(                ""));
//
//        // "What was the name of your first pet?"
//        assertEquals("##ippy",                                    Maskify.maskify("Skippy")                                  );
//        assertEquals("####################################man!",  Maskify.maskify("Nananananananananananananananana Batman!"));
//    }
//}

//Pseudocode
/// 1. replace every character with the # sign
/// 2. get the last four character
/// 3. append the masked charter with the last four character


public class Maskify {

    public static void main(String[] args) {
        System.out.println(maskify("4556364607935616"));
    }

    public static String maskify(String str) {

        char[] ch = str.toCharArray();
        int len = ch.length;

        for(int i = 0; i < len - 4; i++){
            ch[i] = '#';
        }

        String newStr = new String(ch);
        return newStr;

    }




}
