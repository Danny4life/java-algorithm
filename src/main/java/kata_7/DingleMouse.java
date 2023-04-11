package kata_7;

//A family of kookaburras are in my backyard.
//
//        I can't see them all, but I can hear them!
//
//        How many kookaburras are there?
//
//        Hint
//        The trick to counting kookaburras is to listen carefully
//
//        The males sound like HaHaHa...
//
//        The females sound like hahaha...
//
//        And they always alternate male/female
//
//        Examples
//        ha = female => 1
//        Ha = male => 1
//        Haha = male + female => 2
//        haHa = female + male => 2
//        hahahahaha = female => 1
//        hahahahahaHaHaHa = female + male => 2
//        HaHaHahahaHaHa = male + female + male => 3
//        ^ Kata Note : No validation is necessary; only valid input will be passed :-)


//import org.junit.Test;
//import static org.junit.Assert.assertEquals;
//
//public class ExampleTests {
//
//    @Test
//    public void examples() {
//        assertEquals(0, Dinglemouse.kookaCounter(""));
//        assertEquals(1, Dinglemouse.kookaCounter("hahahahaha"));
//        assertEquals(2, Dinglemouse.kookaCounter("hahahahahaHaHaHa"));
//        assertEquals(3, Dinglemouse.kookaCounter("HaHaHahahaHaHa"));
//    }
//
//}

//Psedoo
// 1. create a count variable
// 2. declare what the males sound like HaHaHa...
// 3. declare what the females sound like hahaha...
// 4. male could be at the start or at the end of the string


public class DingleMouse {

    public static void main(String[] args) {
        System.out.println(kookaCounter("HaHaHahahaHaHa"));
    }

    public static int kookaCounter(final String laughing) {
        // Your code here!

        return laughing.replaceAll("(ha)+", "1").replaceAll("(Ha)+", "1").length();
    }
}
