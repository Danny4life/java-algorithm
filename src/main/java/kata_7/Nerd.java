package kata_7;

//Make your strings more nerdy:
//        Replace all 'a'/'A' with 4, 'e'/'E' with 3 and 'l' with 1 e.g. "Fundamentals" --> "Fund4m3nt41s"


//import org.junit.Test;
//import static org.junit.Assert.assertEquals;
//import org.junit.runners.JUnit4;
//
//public class SolutionTest {
//    @Test
//    public void testSomething() {
//        assertEquals("Fund4m3nt41s", Nerd.nerdify("Fund4m3nt41s"));
//        assertEquals("S3v3n", Nerd.nerdify("Seven"));
//        assertEquals("Los 4ng313s", Nerd.nerdify("Los Angeles"));
//        assertEquals("S3oijs314wuu3", Nerd.nerdify("Seoijselawuue"));
//    }
//}


//STEPS
//--use the replace all method
// convert to char array
//

import java.util.Arrays;

public class Nerd {

    public static void main(String[] args) {
        System.out.println(nerdify("Seven"));
    }

    public static String nerdify(String txt){

        return txt.replaceAll("[aA]", "4")
                .replaceAll("[eE]", "3")
                .replaceAll("l", "1");
    }
}
